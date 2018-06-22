package com.ujjawal.datatypes;

public class MyChar {

	private char ch;

	public MyChar(char ch) {
		this.ch = ch;
	}

	public boolean isVowel() {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			return true;
		}
		if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
			return true;
		}
		return false;


	}

	public boolean isDigit() {
		if (ch >= 48 && ch <= 57) {
			return true;
		}
		return false;
	}


	public boolean isAlphabet() {
		if (ch >= 97 && ch <= 122) {// BETWEEN 'a'to 'z'
			return true;
}
		if (ch >= 65 && ch <= 90) {// BETWEEN 'a'to 'z'
			return true;
	}
		return false;
	}


	public boolean isConsonent() {
		if (isAlphabet()&&!isVowel()) {
			return true;
		}
		return false;
	}

	public static void printLowerCaseAlphabates() {

		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(ch);
		}
	}

	public static void printUpperCaseAlphabates() {
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);
		}

	}

	}


