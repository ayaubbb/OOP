package practice1;
import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        double area = a * a;
        double perimeter = (double)4.0F * a;
        double diagonal = a * Math.sqrt((double)2.0F);
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
        System.out.println("Diagonal = " + diagonal);
    }
}