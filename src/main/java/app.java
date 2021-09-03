/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Conroy Ricketts
 */

import java.util.Scanner;

public class app
{
    public static void main(String[] args)
    {
        final double conversionFactor = 0.09290304;

        System.out.println("Enter the length of the room in feet.");

        Scanner scan = new Scanner(System.in);
        String length = scan.next();

        System.out.println("Enter the width of the room in feet.");

        scan = new Scanner(System.in);
        String width = scan.next();

        int lengthi = Integer.parseInt(length);
        int widthi = Integer.parseInt(width);

        double area = lengthi * widthi;
        double areaInMeters = area * conversionFactor;

        System.out.println(String.format("The dimensions are %d by %d feet. The area is %.2f square feet, which is %.2f square meters.", lengthi, widthi, area, areaInMeters));
    }
}
