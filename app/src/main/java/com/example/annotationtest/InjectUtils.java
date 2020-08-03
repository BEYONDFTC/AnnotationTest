package com.example.annotationtest;

import android.app.Activity;
import android.view.View;

import java.lang.reflect.Field;

public class InjectUtils  {

    public static void toInject(Activity activity){
        Class<? extends Activity> aClass = activity.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            if(declaredField.isAnnotationPresent(InJectView.class)){
                InJectView annotation = declaredField.getAnnotation(InJectView.class);
                int value = annotation.value();
                View viewById = activity.findViewById(value);
                try {
                    declaredField.set(activity,viewById);
                } catch (IllegalAccessException e) {

                }
            }
        }
    }
}
