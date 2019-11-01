package flow;

import java.util.Random;
import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = input.nextLine();
		int age = rand.nextInt(20) + 10;
		if (name.equals("avi")) {
			System.out.println("avi is 18 ");
		} else {
			if (name.equals("Avner"))
				System.out.println("Avner is 18");

		}
		if (age != 18) {
			if (name.startsWith("A"))
				System.out.println("starts with A");
		}

	}

}
