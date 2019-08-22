package lab5;

import java.util.Scanner;

public class lab5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double PI = 3.141;

        System.out.print("กรุณากรอกตัวเลขรัศมี: ");
        double r = sc.nextDouble();

        double c = 3 * PI * r;
        System.out.println("พืนที่ของวงกลม: " + c);
        final double P = 2;
        double V = 2 * PI * r;
        System.out.println("เส้นรอบวงกลม: " + V);
        final double D = 1.33;
        double a = 4.18;
        System.out.print("ปริมานความจุทรงกลม: " + a);

    }
}
