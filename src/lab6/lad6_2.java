package lab6;

import java.util.Scanner;

public class lad6_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double i;
        System.out.print("Input length in inch");
        i = scanner.nextDouble();
        double m = i * 0.0254;

        System.out.print(i + "inch is equal to " + m + " meters. ");


    }
}
