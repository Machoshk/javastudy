package Application;

import java.util.Scanner;

public class CheckPassDoWhile {

	public static void main(String[] args) {
		// �н����带 �Է¹޾� do while������ �´��� �˻��Ѵ�. �н����尡 ������ �ݺ����� ������
		final String USER_PASSWORD = "Hello";
		
		Scanner scanner = new Scanner(System.in);
		
		String password = "";
		do {
			System.out.print("Enter password >");
			password =scanner.nextLine();
			
		} while(!password.equals(USER_PASSWORD));
		
		scanner.close();
		System.out.print("���� ����.");
		
	}

}
