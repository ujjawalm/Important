package com.ujjawal.datatypes;

public class ExerciseOnCharRunner {

	public static void main(String[] args) {
		MyChar mychar = new MyChar('0');
		System.out.println(mychar.isVowel());
		System.out.println(mychar.isDigit());
		System.out.println(mychar.isConsonent());
		System.out.println(mychar.isAlphabet());
		MyChar.printLowerCaseAlphabates();
		MyChar.printUpperCaseAlphabates();
	}

}
