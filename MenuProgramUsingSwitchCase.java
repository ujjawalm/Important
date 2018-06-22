package com.ujjawal.conditionals;

import java.util.Scanner;

public class MenuProgramUsingSwitchCase {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number 1:");
		int number1 = scanner.nextInt();
		System.out.println("Enter number 2:");
		int number2 = scanner.nextInt();
		System.out.println("Select your Choice");
		System.out.println("1-ADDITION");
		System.out.println("2-SUBSTRACTION");
		System.out.println("3-MULTIPLICATION");
		System.out.println("4-DIVISION");
		System.out.println("Enter Your Choice:");
		int choice = scanner.nextInt();
		System.out.println("number1-" + number1);
		System.out.println("number2-" + number2);
		System.out.println("Choice-" + choice);
		switch (choice) {
		case 1:
			System.out.println("Result" + (number1 + number2));
			break;
		case 2:
			System.out.println("Result" + (number1 - number2));
			break;
		case 3:
			System.out.println("Result" + (number1 * number2));
			break;
		case 4:
			System.out.println("Result" + (number1 / number2));
			break;
		default:
			System.out.println("Sorry Wrong Choice");
			break;
		}

	}

}
