package com.company;

public class Shirts extends Clothes {
    private boolean longSleeves;
    private boolean shirtPocket;
    public Shirts(String name,
                  int size,
                  String material,
                  String color,
                  boolean casual,
                  boolean longSleeves,
                  boolean shirtPocket) {
        super(name, size, material, color, casual);
        this.longSleeves = longSleeves;
        this.shirtPocket = shirtPocket;
    }


}
