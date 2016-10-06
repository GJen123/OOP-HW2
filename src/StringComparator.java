import java.util.Scanner;

public class StringComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string 1:");
		String string1 = input.next();
		System.out.println("Enter a string 2:");
		String string2 = input.next();
		if(string1.equalsIgnoreCase(string2)){
			System.out.println("The two strings are the same.");
		}else{
			System.out.println("The two strings are not the same.");
		}
	}

}
