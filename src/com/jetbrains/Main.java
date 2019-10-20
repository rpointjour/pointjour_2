package com.jetbrains;

import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void learnMult() {
        int num1 = 0;
        int num2 = 0;
        int answer = 0;
        Random r = new Random();
        Scanner in = new Scanner(System.in);
        num1 = r.nextInt(10);
        num2 = r.nextInt(10);

        System.out.println(num1 + " times " + num2 + " = ? ");
        answer = in.nextInt();

        if (answer == (num1 * num2)) {
            System.out.println("Very good!"); // Responses
            System.out.println("Excellent!");
            System.out.println("Nice work!");
            System.out.println("Keep up the good work!");
            learnMult();
        } else {
            while (answer != (num1 * num2)) {
                System.out.println("No. Please try again.");
                answer = in.nextInt();
                learnMult();
            }
        }
    }
    public static void main(String[] args)
    {
        learnMult();
    }
}
