package operators;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your namer: ");
		String name = input.nextLine();
		System.out.println("Enter your age: ");
		int age = input.nextInt();
		System.out.println("Are you cool? ");
		Boolean cool = input.nextBoolean();
		if (cool) {

			System.out.printf("Your name is %s, your age is %d, You are cool  ", name, age);
		} else {

			System.out.printf("Your name is %s, your age is %d, You are cool  ", name, age);
		}
		input.close();
	}

}
