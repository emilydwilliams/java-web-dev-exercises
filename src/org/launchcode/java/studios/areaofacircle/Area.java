package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        try {
            double radius = input.nextDouble();
            while (radius <= 0) {
                System.out.println("Oops! Radius most be a positive number greater than 0.");
                radius = input.nextDouble();
            }
            double area = Circle.getArea(radius);
            System.out.println("The area of a circle with radius " + radius + " is: " + area);
        } catch(Exception e) {
            System.out.println("Error! Invalid input.");
        }
        input.close();
    }

}
