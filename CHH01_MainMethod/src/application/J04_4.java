package application;

import java.util.Scanner;

public class J04_4 {

	public static void main(String[] args) {
		// if-else if�� ����
		int score = 0; // ������ �����ϱ� ���� ����
		char grade = ' '; // ������ �����ϱ� ���� ����, �������� �ʱ�ȭ�Ѵ�.
		
		System.out.println("What's your score?>\nMajor ");
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt(); // ȭ���� ���� �Է¹��� ���� score�� ����
		
		if(score >= 95) {
			grade = 'A';
		} else if(score >= 80) {
			grade = 'B';
		} else if(score >= 70) {
			grade = 'C';
		} else {
			grade = 'D';
	}
		System.out.println("����� ������ " + grade + "�Դϴ�.");
	}
}
// ������ 90�� �̸��̰�, 80�� �̻�
