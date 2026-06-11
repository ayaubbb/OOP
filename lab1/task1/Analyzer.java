package lab1.task1;

import java.util.Scanner;

public class Analyzer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		Data data = new Data();
		
		while(true) {
			System.out.print("Enter number (Q to quit):");
			
			String input = sc.next();
			
			if(input.equals("Q")) {
				break;
			}
			
			try {
				double value = Double.parseDouble(input);
				data.addValue(value);
			}
			catch (NumberFormatException e) {
				System.out.println("Invalid input! Please enter a number or Q.");
			}
		}
		System.out.println("Average = " + data.getAvg());
		System.out.println("Largest number is = " + data.getLargest());
		
	}

}
