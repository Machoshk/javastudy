package application;

import java.util.Scanner;

public class J04_5 {

	public static void main(String[] args) {
		// ���� 4-5
		int score = 0;
		char grade = ' ', opt = '0';
		
		System.out.println("������ �Է��� �ּ���.>");
		
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();
		
		System.out.printf("����� ������ %d�Դϴ�.%n", score);
		
		if(score >= 90) { 			// score�� 90�� ���� ���ų� ũ�� A����(grade)
			grade = 'A';
			if(score >= 98) {		// 90�� �̻� �߿����� 98�� �̻��� A+
				opt = '+';
			} else if (score < 94) {	// 90�� �̻� 94�� �̸��� A-
				opt = '-';
			}
		} else if (score >= 80) {	// score�� 80�� ���� ���ų� ũ�� B����(grade)
			grade = 'B';
			if (score >= 88) {
				opt = '+';
			} else if (score < 84) {
				opt = '-';
			}
		} else {					// �������� C����(grade)
			grade = 'C';
		}
		System.out.printf("����� ������ %c%c�Դϴ�.%n", grade, opt);
	}
}
