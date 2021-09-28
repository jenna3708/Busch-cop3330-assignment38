/*
 *  UCF COP3330 Fall 2021 Assignment 38 Solution
 *  Copyright 2021 Jenna Busch
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;

public class exercise38 {
    public static void main(String[] args) {

        System.out.println("Enter a list of numbers, separated by spaces:");
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        Scanner scanNum = new Scanner(line);
        while (scanNum.hasNextInt()) {
            numbers.add(scanNum.nextInt());
        }

        int size = numbers.size();
        System.out.println("The even numbers are:");

        for(int i = 0; i < size; i++)
        {
            if(numbers.get(i) %2 == 0)
            {
                System.out.println(numbers.get(i));
            }
        }

    }


}
