package application;

import java.util.Scanner;

public class J04_3 {

	public static void main(String[] args) {
		// if-else��
		System.out.println("���ڸ� �ϳ� �Է��ϼ���.>");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt(); // ȭ���� ���� �Է¹��� ���ڸ� input�� ����
		
		if(input == 1) {
			System.out.println("�Է��Ͻ� ���ڴ� 1�Դϴ�.");
		} else {
			System.out.println("�Է��Ͻ� ���ڴ� 1�̾ƴմϴ�.");
		}
	}
}
