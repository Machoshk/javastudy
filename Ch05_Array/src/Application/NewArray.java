package Application;

import java.util.Scanner;

public class NewArray {

	public static void main(String[] args) {
		// new 키워드로 배열 생성
		// int[] numbers = {}; 초기값을 바로 넣는 방법
		final int NUM = 3;
		
		Scanner scanner = new Scanner(System.in);
		
		int[] numbers = new int[NUM];
		
		for(int i=0; i<NUM; i++) {
			System.out.println("숫자를 입력: ");
			
			numbers[i] = scanner.nextInt();
		}

		scanner.close();
		
		System.out.println("입력한 값은: ");
		
		int total = 0;
		
		for(int i = 0; i<NUM; i++) {
			System.out.println(numbers[i]);
			
			total += numbers[i];
		}
		
		System.out.println("Total : " + total);
	}

}
