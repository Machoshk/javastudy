package Application;

import java.util.Scanner;

public class CheckPassword {

	public static void main(String[] args) {
		// 유저가 입력한 패스워드를 설정한 패스워드와 비교
		final String USER_PASSWORD = "Hello";
		
		System.out.println("Enter password >");
		
		Scanner scanner = new Scanner(System.in);
		String password = scanner.nextLine();
	
		
		if(password.equals(USER_PASSWORD)) {
			System.out.println("접속 승인.");
		}
		else {
			System.out.println("접속 불가.");
		}	
	}

}
