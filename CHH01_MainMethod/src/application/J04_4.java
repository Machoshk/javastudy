package application;

import java.util.Scanner;

public class J04_4 {

	public static void main(String[] args) {
		// if-else if문 예제
		int score = 0; // 점수를 저장하기 위한 변수
		char grade = ' '; // 학점을 저장하기 위한 변수, 공백으로 초기화한다.
		
		System.out.println("What's your score?>\nMajor ");
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt(); // 화면을 통해 입력받은 숫자 score에 저장
		
		if(score >= 95) {
			grade = 'A';
		} else if(score >= 80) {
			grade = 'B';
		} else if(score >= 70) {
			grade = 'C';
		} else {
			grade = 'D';
	}
		System.out.println("당신의 학점은 " + grade + "입니다.");
	}
}
// 점수가 90점 미만이고, 80점 이상
