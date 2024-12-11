/*
 * 1) จงเขียนโปรแกรมเพื่อรับค่าจากแป้นพิมพ์ มาทำการคำนวนค่า Factorial และ Fibonanci โดยมีเงื่อนไขดังนี้
-การคำนวน ต้องเกิดจากการเรียกใช้ฟังก์ชัน Factorial และ Fibonanci จากฟังก์ชันหลักเท่านั้น
-กำหนดช่วงตัวเลขที่ใช้ในการคำนวน อยู่ระหว่าง 0 - 99 หากเกินช่วงที่กำหนด 
ให้โปรแกรมจบการทำงานทันที แต่ถ้าอยู่ในช่วงที่กำหนด ให้วนซ้ำเพื่อรับค่าจากแป้นพิมพ์และหาผลลัพธ์ต่อไป
-นำผลที่ได้จากค่า Factorial มาลบกับค่า Fibonanci  

 */
package factorialfibonanci1;

import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "";
    }

    public static void main(String[] args) {
        System.out.print(new App().getGreeting());
        Scanner scanIn = new Scanner(System.in);
        System.out.print("Enter number for calculate: ");
        int number = scanIn.nextInt();
        if (number < 0 || number > 99) {
            System.out.println("Calculation " + number + " Factorial");
            scanIn.close();
        }

        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            System.out.println(i + " ! = " + factorial);
            factorial += factorial * i;
        }

        System.out.println("\nCalculation Fibonanci number: " + number);
        int a = 0, Fibonacci = 1;
        if (number >= 0) {
            System.out.println("f0 = " + a);
        }
        if (number >= 1) {
            System.out.println("f1 = " + Fibonacci);
        }
        for (int i = 2; i <= number; i++) {
            int c = a + Fibonacci;
            a = Fibonacci;
            Fibonacci = c;
            System.out.println("f" + i + " = " + Fibonacci);
        }
        int total = factorial - Fibonacci;
        System.out.println(factorial + " Factorial minus Fibonanci number " + Fibonacci + " is " + total);
    }

}
