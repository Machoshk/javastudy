package Application;

import java.util.Scanner;

public class CheckPassLimit {

	public static void main(String[] args) {
		// �н����尡 Ʋ������ 3�� �Է��� �� �ִ� ��ȸ�� �ش�.
		// �н����尡 ������ '���ӽ���' ����ϰ� �ݺ����� ��������
		// �н����� 3ȸ Ʋ���� '���Ӱź�'

		final String USER_PASSWORD = "hello";

		Scanner scanner = new Scanner(System.in);

		String password = "";

		System.out.println("Enter password >");
		password = scanner.nextLine();
		
		for (int i = 1; i <= 3; i++);
			System.out.println("��й�ȣ �Է�: ");
			password = scanner.nextLine();

			if(password.equals(USER_PASSWORD)) {
				System.out.println("���ӽ���");
				boolean accessOK = true; // flag : �Ҹ������� ���¿� ���� ó���帧 ����
				break;
			} else {
				System.out.println("����� Ʋ�Ƚ��ϴ�.");
			}
		}
				

		if (!accessOK) {
			System.out.println("���Ӱź�");
		}
	}
}


