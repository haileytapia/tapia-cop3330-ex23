/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Hailey Tapia
 */

package org.example;

import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        char silent, corroded, slicking, crankButFail, startThenDie, fuelInjection;
        Scanner input = new Scanner(System.in);

        System.out.print("Is the car silent when you turn the key? ");
        silent = input.next().charAt(0);

        if (silent == 'Y' || silent == 'y')
        {
            System.out.print("Are the battery terminals corroded? ");
            corroded = input.next().charAt(0);

            if (corroded == 'Y' || corroded == 'y')
                System.out.print("Clean terminals and try starting again.");
            else if (corroded == 'N' || corroded == 'n')
                System.out.print("Replace cables and try again.");
        }
        else if (silent == 'N' || silent == 'n')
        {
            System.out.print("Does the car make a slicking noise? ");
            slicking = input.next().charAt(0);

            if (slicking == 'Y' || slicking == 'y')
                System.out.print("Replace the battery.");
            else if (slicking == 'N' || slicking == 'n')
            {
                System.out.print("Does the car crank up but fail to start? ");
                crankButFail = input.next().charAt(0);

                if (crankButFail == 'Y' || crankButFail == 'y')
                    System.out.print("Check spark plug connections.");
                else if (crankButFail == 'N' || crankButFail == 'n')
                {
                    System.out.print("Does the engine start and then die? ");
                    startThenDie = input.next().charAt(0);

                    if (startThenDie == 'Y' || startThenDie == 'y')
                    {
                        System.out.print("Does you car have fuel injection? ");
                        fuelInjection = input.next().charAt(0);

                        if (fuelInjection == 'Y' || fuelInjection == 'y')
                            System.out.print("Get it in for service.");
                        else if (fuelInjection == 'N' || fuelInjection == 'n')
                            System.out.print("Check to ensure the choke is opening and closing.");
                    }
                    else if(startThenDie == 'N' || startThenDie == 'n')
                        System.out.print("This should not be possible.");
                }
            }
        }
    }
}