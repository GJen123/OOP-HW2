import java.util.Scanner;

public class CheckOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a integer:");
		int num1 = input.nextInt();
		if(num1%2==0){
			System.out.println("This is Even Number");
		}else{
			System.out.println("This is Odd Number");
		}
	}

}
