/*
 * 2) จงเขียนโปรแกรมเพื่อรับค่า 3 ค่าจากแป้นพิมพ์ในฟังก์ชันหลัก 
 * จากนั้นให้ใช้ฟังก์ชันในการหาว่าค่าใดมากที่สุด ค่าใดน้อยที่สุด 
 * ผลลัพธ์จากการนำค่ามากที่สุดบวกกับค่าน้อยที่สุด 
 * แล้วกลับมาแสดงผลตามตัวอย่างที่กำหนดให้ในฟังก์ชันหลัก 
 * โดยให้เขียนฟังก์ชันตามการประกาศฟังก์ชันดังนี้
mymax(int, int, int);
mymin(int, int, int);

 */
package maxmin2;

import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        System.out.print("Enter last number: ");
        int c = scanner.nextInt();
        scanner.close();

        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));
        int total = max + min;
        System.out.println("Max value: " + max + "\nMin value: " + min);
        System.out.print("Total Max plus Min is " + total);
    }
}
