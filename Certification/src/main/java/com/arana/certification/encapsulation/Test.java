package com.arana.certification.encapsulation;

class Test {
	public static void main(String[] args){
		int numbers[] = {12, 13, 42, 32, 15, 156, 23, 51, 12};
		int max = findMax(numbers);
		System.out.println("Max :" + max);
	}

	static int findMax(int[] numbers) {
		int max = 0;
		max = numbers[0];
		return max;
	}
}
