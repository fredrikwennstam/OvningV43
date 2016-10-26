import java.util.Scanner;

public class GitFirst {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int age;
		
		System.out.print("Enter age: ");
		age = input.nextInt();
		
		System.out.println("Your age is: " + age);
		
		
		input.close();
	}

}
