package com.reachrk;

public class ArraysEvenNumbersCount {

	public static void main(String[] args) {
		int[] nums= {437,315,322,431,686,264,442};
		System.out.println( findNumbers(nums));
	}
	
	public static int findNumbers(int[] nums) {
		int evenDigitsCount = 0;
		for (int i : nums) {
			int elligibleCheck = 0;
			while (i > 0) {
				i = i / 10;
				elligibleCheck++;
			}
			if (elligibleCheck % 2 == 0) {
				evenDigitsCount++;
			}
		}
		return evenDigitsCount;
	}
}
