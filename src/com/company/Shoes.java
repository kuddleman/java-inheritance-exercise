package com.company;

public class Shoes extends Clothes {

    private boolean openToed;
    private String countryOfOrigin;

    public Shoes(String name,
                 int size,
                 String material,
                 String color,
                 boolean casual,
                 boolean openToed,
                 String countryOfOrigin) {
        super(name, size, material, color, casual);
        this.openToed = openToed;
        this.countryOfOrigin = countryOfOrigin;
    }

    @Override
    public void clothesTalk() {
        System.out.println("This is SHOES talking");
    }
}

//comments
