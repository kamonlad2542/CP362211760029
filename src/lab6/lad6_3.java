package lab6;

import java.util.Scanner;

public class lad6_3{
    public static void main(String[] args) {
        {
            //BMT = weight/(hight*hight)
            Scanner in = new Scanner(System.in);

            System.out.print("weight:");
            float weight = in.nextFloat();

            System.out.print("hight:");
            float hight = in.nextFloat();

            float bmi = weight / (hight * hight);
            System.out.print(bmi);
        }
    }
}