package com.company;

public class Clothes {
    private String name;
    private int size;
    private String material;
    private String color;
    private boolean casual;

    public Clothes(String name, int size, String material, String color, boolean casual) {
        this.name = name;
        this.size = size;
        this.material = material;
        this.color = color;
        this.casual = casual;
    }

    public void clothesTalk() {
        System.out.println("This is how CLOTHES talks");
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isCasual() {
        return casual;
    }

    public void setCasual(boolean casual) {
        this.casual = casual;
    }
}
