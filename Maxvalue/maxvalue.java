package Maxvalue;

import java.util.Scanner;

public class maxvalue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input value A: ");
        int A = scanner.nextInt();
        System.out.print("Input value B: ");
        int B = scanner.nextInt();
        System.out.print("Input value C: ");
        int C = scanner.nextInt();
        if (A >= B && A >= C) {
            System.out.println("Max value is A");
        } else if (B >= A && B >= C) {
            System.out.println("Max value is B");
        } else {
            System.out.println("Max value is C");
        }
        scanner.close();
    }
}