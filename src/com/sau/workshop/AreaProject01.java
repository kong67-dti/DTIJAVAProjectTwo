package com.sau.workshop;

import java.util.Scanner;

public class AreaProject01 {
    public static void main(String[] args) {
        double widths, longs, square, bases, highs, triangle, radius, circle;

        System.out.println("--------------------------");
        System.out.println("  Shape Area Program");
        System.out.println("--------------------------");
        System.out.println("1 | Square Area");
        System.out.println("2 | Triangle Area");
        System.out.println("3 | Circle Area");
        System.out.print("Select menu: ");

        Scanner menu = new Scanner(System.in);
        int choiceMenu = menu.nextInt();

        switch (choiceMenu) {
            case 1:
                System.out.println("--------------------------");
                System.out.print("Input widths: ");
                widths = menu.nextDouble();
                System.out.print("Input longs: ");
                longs = menu.nextDouble();
                square = widths * longs;
                System.out.println("Area of Square is" + String.format(" %.2f", square));
                System.out.println("--------------------------");
                break;
            case 2:
                System.out.println("--------------------------");
                System.out.print("Input bases: ");
                bases = menu.nextDouble();
                System.out.print("Input highs: ");
                highs = menu.nextDouble();
                triangle = (bases * highs) / 2;
                System.out.println("Area of Triangle is" + String.format(" %.2f", triangle));
                System.out.println("--------------------------");
                break;
            case 3:
                System.out.println("--------------------------");
                System.out.print("Input radius: ");
                radius = menu.nextDouble();
                circle = 3.14159 * radius * radius;
                System.out.println("Area of Circle is" + String.format(" %.2f", circle));
                System.out.println("--------------------------");
                break;
            default:
                System.out.println("--------------------------");
                System.out.println("Thank you Bey....Bey.....");
                System.out.println("--------------------------");
                break;
        }
    }
}
