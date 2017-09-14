package com.example.triangle;

public class VerticalLine {
        public static void main(String[] args) {
        createVerticalLine(3);
    }

    public static void createVerticalLine (int numOfAstericks) {
        for (int i = 0; i < numOfAstericks ; i++) {
            System.out.println("*");
        }
    }

}
