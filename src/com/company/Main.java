package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Shoes myShoes = new Shoes( "sneakers", 12, "cloth", "red", true, false, "Indonesia");

        System.out.println(myShoes.getName());

        myShoes.clothesTalk();
    }
}
