package application;

import java.util.Scanner;

public class J04_6 {

	public static void main(String[] args) {
		// Switch���� ��������
		// 1. switch���� ���ǽ� ����� ���� �Ǵ� ���ڿ��̾�� �Ѵ�.
		// 2. case���� ���� ���� ���(���� ����), ���ڿ��� �����ϸ�, �ߺ����� �ʾƾ� �Ѵ�.
		System.out.println("���� ���� �Է��ϼ���.>");
		
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		
		switch(month) {
		case 3: case 4: case 5:
			System.out.println("������ ������ ���Դϴ�.");
			break;
		case 6: case 7: case 8:
			System.out.println("������ ������ �����Դϴ�.");
			break;
		case 9: case 10: case 11:
			System.out.println("������ ������ �����Դϴ�.");
			break;
		default:
	//	case 12: case 1: case 2:
			System.out.println("������ ������ �ܿ��Դϴ�.");
		}
	}

}
