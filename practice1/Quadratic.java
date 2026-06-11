package practice1;
import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = b * b - (double)4.0F * a * c;
        if (d < (double)0.0F) {
            System.out.println("d is negative");
        } else {
            double sqrtD = Math.sqrt(d);
            double x1 = (-b + sqrtD) / ((double)2.0F * a);
            double x2 = (-b - sqrtD) / ((double)2.0F * a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }
}

