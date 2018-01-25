package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int userNumber = 1;

        do {
            if ((userNumber % 3 == 0) && (userNumber % 5 == 0)){
                System.out.println("fizzbuzz");
            }
            else if (userNumber % 5 == 0){
                System.out.println("buzz");
            }
            else if (userNumber % 3 == 0){
                System.out.println("fizz");
            }
            else {
                System.out.println(userNumber);
            }
            userNumber += 1;
        }
        while(userNumber <= 100);

        
    }
}
/*
Fizzbuzz - Take user input of 1 - 100
if it is a multiple of 3 output "fizz"
if it is a multiple of 5 output "buzz"
if it is a multiple of both output " fizzbuzz"
jf jt js a multiple of neither output its value
 */