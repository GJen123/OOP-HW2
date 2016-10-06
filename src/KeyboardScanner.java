import java.util.Scanner;

public class KeyboardScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a integer:");
		int num1 = input.nextInt();
		System.out.println("Enter a float point number:");
		float num2 = input.nextFloat();
		System.out.println("Enter a you name:");
		String name = input.next();
		
		float num3 = num1*num2;

		System.out.printf("\nHi " + name + ", the multiplication of " + num1 + " and " + num2 + " is %.2e." ,num3);
		 
	}

}
