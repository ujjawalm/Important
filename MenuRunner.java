package com.ujjawal.conditionals;

import java.util.Scanner;

public class MenuRunner {

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
		programUsingSwitch(number1, number2, choice);
	}

	private static void programUsingNestedIfElse(int number1, int number2, int choice) {
		if (choice == 1) {
			int sum = number1 + number2;
			System.out.println("sum is  " + sum);// System.out.println("Result"+(number1+number2);
		} else if (choice == 2) {
			int difference = number1 - number2;
			System.out.println("Difference is " + difference);// System.out.println("Result"+(number1-number2);
		} else if (choice == 3) {
			int product = number1 * number2;
			System.out.println("Product is " + product);// System.out.println("Result"+(number1*number2);
		} else if (choice == 4) {
			int divide = number1 / number2;
			System.out.println("Division is " + divide);// System.out.println("Result"+(number1/number2);
		}
		else {
			System.out.println("Invalid Operation");
		}
	}

	private static void programUsingSwitch(int number1, int number2, int choice) {
		switch (choice) {
		case 1:
			System.out.println("Result " + (number1 + number2));
			break;
		case 2:
			System.out.println("Result " + (number1 - number2));
			break;
		case 3:
			System.out.println("Result " + (number1 * number2));
			break;
		case 4:
			System.out.println("Result " + (number1 / number2));
			break;
		default:
			System.out.println("Sorry Wrong Choice");
			break;
		}

	}

}
