package Application;

import java.util.Scanner;

public class CheckPassword {

	public static void main(String[] args) {
		// ������ �Է��� �н����带 ������ �н������ ��
		final String USER_PASSWORD = "Hello";
		
		System.out.println("Enter password >");
		
		Scanner scanner = new Scanner(System.in);
		String password = scanner.nextLine();
	
		
		if(password.equals(USER_PASSWORD)) {
			System.out.println("���� ����.");
		}
		else {
			System.out.println("���� �Ұ�.");
		}	
	}

}
