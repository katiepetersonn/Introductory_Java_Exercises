package com.example.triangle;

public class FizzBuzz {
    public static void main(String args[]){
        for (int i = 1; i <= 100; i++){
            System.out.println(changeNumber(i));
        }
    }

    public static String changeNumber(int number){
        if (number % 3 == 0 && number % 5 == 0) {
            return "Fizzbuzz";
        }
        if (number % 3 == 0){
            return "Fizz";
        }
        if (number % 5 == 0){
            return "Buzz";
        }
        return String.valueOf(number);
    }
}
