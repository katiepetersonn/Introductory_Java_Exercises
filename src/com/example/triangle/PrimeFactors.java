package com.example.triangle;
import java.util.ArrayList;

//Write a method generate(int n) that given an integer N will return a list of integers such that the numbers are the factors of N and are arranged in increasing numerical order.
//        For example, generate(1) should return an empty list and generate(30) should return the numbers: 2,3,5.

// A prime number is any number greater than one that is only divisible by itself.

// 1 is not a prime number (it is not greater than 1).
// 2 is a prime number (it is greater than one and is only evenly divisible by itself and 1).
// 3 is a prime number (as above).
// 4 is not a prime number (it is evenly divisible by 2).
// The prime factors of an integer are the set of prime numbers will divide the integer exactly.

public class PrimeFactors {

    public static void main(String[] args) {
        System.out.println(generate(30));
    }

    public static boolean potentialPrime(int number){

        if(number == 1){
            return false;
        } else {
            for (int i = 2; i <number; i++){
                if (number % i == 0){
                    return false;
                }
            }
        }
        return true;
    }

    public static ArrayList<Integer> generate(int number) {
        ArrayList<Integer> primeFactors = new ArrayList<Integer>();
        for (int i= 2; i < number; i++) {
            if (number % i == 0){
                if (potentialPrime(i)){
                    primeFactors.add(i);
                }
            }
        }

        return primeFactors;
    }
}