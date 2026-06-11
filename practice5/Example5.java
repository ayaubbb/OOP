package practice5;

import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Example5 {
	
	static void evaluate(String expression) {
		StringTokenizer tokenizer = new StringTokenizer(expression, "+-*/", true);
		
		try {
			String leftString= tokenizer.nextToken();
			String operator = tokenizer.nextToken();
			String rightString = tokenizer.nextToken();
			
			double leftOperand;
			try {
				leftOperand = Double.parseDouble(leftString.trim());
			} catch (NumberFormatException nfe) {
				System.out.println("Left opeand "+ leftString.trim()+ " is not number");
				return;
			}
			
			double rightOperand;
			try {
				rightOperand = Double.parseDouble(rightString.trim());
			} catch (NumberFormatException nfe) {
				System.out.println("Right opeand "+ rightString.trim()+ " is not number");
				return;
			}
			
			double result;
			switch(operator.trim()) {
				case "+": result = leftOperand + rightOperand; break;
	            case "-": result = leftOperand - rightOperand; break;
	            case "*": result = leftOperand * rightOperand; break;
	            
	            case"/": 
	            	if (rightOperand == 0) {
                        System.out.println("Error division by zero in expression " + expression);
                        return;
                    }
                    result = leftOperand / rightOperand;
                    break;
                default:
                    System.out.println("Unknown operator " + operator);
                    return;
			}
			System.out.println("Result " + expression.trim() + " = " + result);
		} catch (NoSuchElementException nsee) {
            System.out.println("Invalid syntax in expression '" + expression.trim() + "'");
        }
	}

	public static void main(String[] args)
    {
		Scanner in = new Scanner(System.in);
        System.out.println("Enter expressions separated by spaces");
        
        String line = in.nextLine();
        StringTokenizer expressions = new StringTokenizer(line, " ");
        
        while (expressions.hasMoreTokens()) {
            String expr = expressions.nextToken();
            evaluate(expr);
        }
    }

}
