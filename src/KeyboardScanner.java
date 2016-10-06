import java.math.BigDecimal;
import java.util.Scanner;

public class KeyboardScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a integer:");
		int num1 = input.nextInt();
		System.out.println("Enter a float point number:");
		double num2 = input.nextDouble();
		System.out.println("Enter a you name:");
		String name = input.next();
		
		int num3 = ((int)(num1*num2)+1);
		BigDecimal b = new BigDecimal(num3);
		
		
		System.out.printf("\nHi " + name + ", the multiplication of " + num1 + " and " + num2 + " is %.2e." ,b);
		 
	}

}
