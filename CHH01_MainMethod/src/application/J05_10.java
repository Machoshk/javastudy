package application;

import java.util.Scanner;

public class J05_10 {

	public static void main(String[] args) {
		// 
		String[][] words = {
				{"charir","����"},
				{"computer","��ǻ��"},
				{"integer","����"}
			};
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<words.length;i++) {
			System.out.printf("Q%d. %s�� ����?", i+1, words[i][0]);
			
			String tmp = scanner.nextLine();
			
			if(tmp.equals(words[i][1])) {
				System.out.printf("�����Դϴ�.%n%n");
			} else {
				System.out.printf("Ʋ�Ƚ��ϴ�. ������ %s�Դϴ�. %n%n", words[i][1]);
			}
		} //for
	}// main��
}
