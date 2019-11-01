package flow;

import java.util.Random;

public class ifStatement {

	public static void main(String[] args) {

		Random rand = new Random();
		int age = 0;
		while (age != 18) {
			age = rand.nextInt(51) + 10;
			switch (age) {
			case 18:
				System.out.println(age + " enough for amry");
				break;
			case 19:
			case 20:
			case 21:
				System.out.println(age + " enough for army");
				break;
			case 22:
			case 23:
			case 24:
				System.out.println(age + " in india");
				break;
			default:
				System.out.println("default");
			}

		}

		// exercise2
//		Random rand = new Random();
//		int age = 0;
//		int counter = 0;
//		while (age != 40) {
//
//			age = (int) rand.nextInt(51) + 10;
//			String message = age < 18 ? age + " " + "cant drive \n"
//					: age >= 18 && age < 21 ? age + " " + "can drive in army \n"
//							: age >= 21 && age < 24 ? age + " " + "in india \n" : age + " " + "ping pong player \n";
//			System.out.println(message);
//			counter++;
//		}
//		System.out.println("number of time " + counter);
//		

		// excersise1
		// Random rand = new Random();
		// for (int i = 0; i < 40; i++) {
//			int age = rand.nextInt(60);
//			if (age < 18) {
//				System.out.println(age + " " + "can't drive ");
//			} else {
//				if (age < 21)
//					System.out.println(age + " " + "can drive in army");
//				else {
//					if (age >= 21 && age <= 24) {
//						System.out.println(age + " " + "in india");
//					} else {
//						System.out.println(age + " " + "ping pong player");
//					}
//				}
//
//			}
//		}

		// Random shit
		// Random rand = new Random();
//		int random = (int) (Math.random() * 10) + 1;
//		while (random != 5) {
//			System.out.println(random + "\n again");
//			random = (int) (Math.random() * 10) + 1;
//
//		}
//		System.out.println("Finally random is " + random);
	}

}
