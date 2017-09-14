package com.example.triangle;

public class RightTriangle {
    public static void main(String[] args) {
        RightTriangle(4);
    }

    public static void RightTriangle (int numOfAstericks) {

        HorizonalLine oneLine = new HorizonalLine();

        for (int i = 0; i < numOfAstericks ; i++) {
            oneLine.createLine(i);
            System.out.println("\n");
        }
    }
}
