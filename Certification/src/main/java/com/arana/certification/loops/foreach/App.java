package com.arana.certification.loops.foreach;

public class App {

	public static void main(String[] args) {
		int numbers[] = new int[10];
		
		for(int i = 0; i < 10; i++){
			numbers[i] = i;
		}
		
		for(int element: numbers){
			System.out.print(element + " ");
		}
		System.out.println();
		
		for(int element: numbers){
			if(element == 5){
				element = -5;
			}
		}
		
		for(int element: numbers){
			System.out.print(element + " ");
		}
		System.out.println();

	}

}
