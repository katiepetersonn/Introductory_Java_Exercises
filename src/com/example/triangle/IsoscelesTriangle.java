package com.example.triangle;

public class IsoscelesTriangle {
    public static void main(String[] args) {
        createTriangle(3);
    }
    public static void createTriangle(int number) {

        for (int i = 1; i < number * 2; i += 2) {
            for (int j = 1; j < (number - (i / 2)); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }


    public void create(int number) {
    }
}