package com.silmontes.helloworls;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Welcome to the Game!");
        System.out.println("May I have your name?");
        String name = sc.nextLine();
        System.out.println("Hello "+name);


        boolean start = false;
        while(!start){
            System.out.println("Shall we begin the game?");
            start = sc.nextBoolean();
        }

        int randomNum = random.nextInt(100);
        int numberGuess = 0;

        System.out.println("Guess the random number from 0 to 99");
        int rnd = sc.nextInt();
        while(start){
            numberGuess ++;

            if(numberGuess<5){
                if(rnd == randomNum){
                    System.out.println("You won! Congratulations!!");
                    start = false;
                }else if (randomNum > rnd){
                    System.out.println("Guess a higher number");
                    rnd = sc.nextInt();
                }else{
                    System.out.println("Guess a lower number");
                    rnd = sc.nextInt();
                }
            }else{
                System.out.println("Game over! Thanks for participating!");
                System.out.println("The number was "+randomNum);
                start = false;
            }

        }

    }
}
