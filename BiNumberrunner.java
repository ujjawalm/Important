package com.ujjawal.datatypes;

public class BiNumberrunner {

	public static void main(String[] args) {
		BiNumber numbers = new BiNumber(55, 50);

		System.out.println(numbers.sum());
		System.out.println(numbers.multiply());
       numbers.doublevalue();
		System.out.println(numbers.getNumber1());
		System.out.println(numbers.getNumber2());
	}
}
