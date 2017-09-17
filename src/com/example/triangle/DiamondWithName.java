package com.example.triangle;

public class DiamondWithName {
    public static void main(String[] args) {
        create(5, "Katie");
    }
    public static void create(int number, String name){
        Diamond diamond = new Diamond();

        createTop(number - 1);
        System.out.println(name);
        diamond.drawBottomDiamond(number - 1);
    }
    public static void createTop(int number){
        for (int i = 1; i < number * 2; i += 2) {
            for (int j = 3; j < (number - (i / 2) + 1); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}
