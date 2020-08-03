package com.example.fruit;

public class Apple {

    @FruitColor(fruitColor = FruitColor.Color.RED)
    private String appleColor;
    @FruitName("apple")
    private String appleName;
    @FruitProvider(id=1,name="张三",address = "北京房山")
    private String appleProvider;


    public String getAppleColor() {
        return appleColor;
    }

    public void setAppleColor(String appleColor) {
        this.appleColor = appleColor;
    }

    public String getAppleName() {
        return appleName;
    }

    public void setAppleName(String appleName) {
        this.appleName = appleName;
    }

    public String getAppleProvider() {
        return appleProvider;
    }

    public void setAppleProvider(String appleProvider) {
        this.appleProvider = appleProvider;
    }


}
