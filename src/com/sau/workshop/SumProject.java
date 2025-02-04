package com.sau.workshop;
    import java.util.Scanner;
public class SumProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;

        while (sum <= 500) {
            System.out.println("Number1: "); int num1 = sc.nextInt();
            System.out.println("Number2: "); int num2 = sc.nextInt();
            sum = num1 + num2;
            System.out.println("SUM : " + sum);
            System.out.println("================================");
            if (sum > 500) {
                break;
            }
        }
    }
}
