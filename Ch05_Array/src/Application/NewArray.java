package Application;

import java.util.Scanner;

public class NewArray {

	public static void main(String[] args) {
		// new Ű����� �迭 ����
		// int[] numbers = {}; �ʱⰪ�� �ٷ� �ִ� ���
		final int NUM = 3;
		
		Scanner scanner = new Scanner(System.in);
		
		int[] numbers = new int[NUM];
		
		for(int i=0; i<NUM; i++) {
			System.out.println("���ڸ� �Է�: ");
			
			numbers[i] = scanner.nextInt();
		}

		scanner.close();
		
		System.out.println("�Է��� ����: ");
		
		int total = 0;
		
		for(int i = 0; i<NUM; i++) {
			System.out.println(numbers[i]);
			
			total += numbers[i];
		}
		
		System.out.println("Total : " + total);
	}

}
