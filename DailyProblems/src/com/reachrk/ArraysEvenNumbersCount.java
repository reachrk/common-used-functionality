package com.reachrk;

public class ArraysEvenNumbersCount {

	public static void main(String[] args) {
		int[] nums= {437,315,322,431,686,264,442};
		System.out.println( findNumbers(nums));
	}

	/*
	 * Given an array nums of integers, return how many of them contain an even
	 * number of digits. 
	 * Input: nums = [555,901,482,1771]
	 * Output: 1 
	 * Explanation: Only 1771 contains an even number of digits.
	 */
	
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
