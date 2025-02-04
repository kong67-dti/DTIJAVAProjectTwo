package com.sau.workshop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AreaProject02 {
    public static void main(String[] args) throws IOException {
        double width, length, rectangle, base, height, triangle, radius, circle;

        System.out.println("--------------------------");
        System.out.println("  Shape Area Program");
        System.out.println("--------------------------");
        System.out.println("1 | Rectangle Area");
        System.out.println("2 | Triangle Area");
        System.out.println("3 | Circle Area");
        System.out.print("Select menu: ");

        BufferedReader menu = new BufferedReader(new InputStreamReader(System.in));
        int choiceMenu = Integer.parseInt(menu.readLine());

        switch (choiceMenu) {
            case 1:
                System.out.println("--------------------------");
                System.out.print("Input width: ");
                width = Double.parseDouble(menu.readLine());
                System.out.print("Input length: ");
                length = Double.parseDouble(menu.readLine());
                rectangle = width * length;
                System.out.println("Area of Rectangle is" + String.format(" %.2f", rectangle));
                System.out.println("--------------------------");
                break;
            case 2:
                System.out.println("--------------------------");
                System.out.print("Input base: ");
                base = Double.parseDouble(menu.readLine());
                System.out.print("Input height: ");
                height = Double.parseDouble(menu.readLine());
                triangle = (base * height) / 2;
                System.out.println("Area of Triangle is" + String.format(" %.2f", triangle));
                System.out.println("--------------------------");
                break;
            case 3:
                System.out.println("--------------------------");
                System.out.print("Input radius: ");
                radius = Double.parseDouble(menu.readLine());
                circle = 3.14159 * radius * radius;
                System.out.println("Area of Circle is" + String.format(" %.2f", circle));
                System.out.println("--------------------------");
                break;
            default:
                System.out.println("--------------------------");
                System.out.println("Invalid menu choice. Please try again.");
                System.out.println("--------------------------");
                break;
        }
    }
}
