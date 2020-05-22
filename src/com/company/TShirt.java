package com.company;

public class TShirt extends Shirts {

    private String sloganOnShirt;

    public TShirt(String name,
                  int size,
                  String material,
                  String color,
                  boolean casual,
                  boolean longSleeves,
                  boolean shirtPocket,
                  String sloganOnShirt) {
        super(name, size, material, color, false, false, shirtPocket);
        this.sloganOnShirt = sloganOnShirt;
    }

    @Override
    public void clothesTalk() {
        System.out.println("This is the TSHIRT talking!");
    }
}
