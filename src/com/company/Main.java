package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        int userNumber = 1;
//
//        do {
//            if ((userNumber % 3 == 0) && (userNumber % 5 == 0)){
//                System.out.println("Fizz Buzz");
//            }
//            else if (userNumber % 5 == 0){
//                System.out.println("Buzz");
//            }
//            else if (userNumber % 3 == 0){
//                System.out.println("Fizz");
//            }
//            else {
//                System.out.println(userNumber);
//            }
//            userNumber += 1;
//        }
//        while(userNumber <= 100);
//
//        for (int i = 1; i <= 100 ; i++){
//            if(i % 3 == 0 && i % 5 == 0){
//                System.out.println("Fizz Buzz");
//            }
//            else if (i % 3 == 0){
//                System.out.println("Fizz");
//            }
//            else if (i % 5 == 0){
//                System.out.println("Buzz");
//            }
//            else {
//                System.out.println(i);
//            }
//        }
        /*
        a. Below 45 - F
        b. 45 to 49 - D
        c. 50 to 59 - C
        d. 60 to 79 - B
        e. Above 80 - A
         */
        System.out.println("What is your grade in class?");
        int grade = input.nextInt();
        if (grade < 45){
            System.out.println("You have an F.");
        }
        else if (grade >= 45 && grade <= 49){
            System.out.println("You have a D.");
        }
        else if (grade >= 50 && grade <= 59){
            System.out.println("You have a C.");
        }
        else if (grade >= 60 && grade <= 79){
            System.out.println("You have a B.");
        }
        else{
            System.out.println("You have an A");
        }
    }
}
/*
Fizzbuzz - Take user input of 1 - 100
if it is a multiple of 3 output "fizz"
if it is a multiple of 5 output "buzz"
if it is a multiple of both output " fizzbuzz"
jf jt js a multiple of neither output its value
 */