package com.example.triangle;

public class Diamond {
    public static void main(String[] args) {
        int number = 3;
        IsoscelesTriangle.createTriangle(number);
        drawBottomDiamond(number + 1 );
    }

    public static void drawBottomDiamond(int size){
        for (int x = size - 2; x >= 0; x--) {
            for (int y = 2; y <= size - x; y++) {
                System.out.print(" ");
            }
            for (int z = 2; z <= 2 * x; z++) {
                System.out.print("*");
            }
            System.out.println();
        }

        }
    }
