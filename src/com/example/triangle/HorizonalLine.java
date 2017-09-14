package com.example.triangle;

public class HorizonalLine {
    public static void main(String[] args) {
        createLine(8);
    }

    public static void createLine (int numOfAstericks) {
        for (int i = 0; i < numOfAstericks ; i++) {
            System.out.print("*");
        }
    }

}