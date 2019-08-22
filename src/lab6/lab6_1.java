package lab6;


import java.util.Scanner;
import java.util.concurrent.Callable;

public class lab6_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double c;
        System.out.println("Input a degree in celsius: ");
        c = sc .nextDouble();
        double f = (9*c+(32*5))/5;

        System.out.println(c+ "degerr celsius is egual to" +f+"in fahrenheit");

    }

    }




