package com.company;

public class Pants extends Clothes {

    private int numPockets;
    private String cuffType;

    public Pants(String name,
                 int size,
                 String material,
                 String color,
                 boolean casual,
                 int numPockets,
                 String cuffType) {
        super(name, size, material, color, casual);

        this.numPockets = numPockets;
        this.cuffType = cuffType;
    }
}
