package com.example.fruit;

import java.lang.reflect.Field;

/**
 * 注解处理器
 */
public class FruitInfoUtil{

    public static void getFruitInfo(Class<?> clazz){

        String strFruitName = "水果名称：";
        String strFruitColor = "水果颜色：";
        String strFruitInfo = "水果信息：";

        Field[] declaredFields = clazz.getDeclaredFields();

        for (Field field:declaredFields) {

            if(field.isAnnotationPresent(FruitName.class)){
                FruitName annotation = field.getAnnotation(FruitName.class);
                System.out.println(strFruitInfo + annotation.value().toString());
            }
            if(field.isAnnotationPresent(FruitColor.class)){
                FruitColor annotation = field.getAnnotation(FruitColor.class);
                System.out.println(strFruitColor + annotation.fruitColor().toString());
            }
            if(field.isAnnotationPresent(FruitProvider.class)){

                FruitProvider annotation = field.getAnnotation(FruitProvider.class);
                System.out.println(strFruitInfo + annotation.id() +""+ annotation.name() +""+ annotation.address() );
            }

        }
    }
}
