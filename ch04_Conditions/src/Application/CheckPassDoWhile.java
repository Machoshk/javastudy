package Application;

import java.util.Scanner;

public class CheckPassDoWhile {

	public static void main(String[] args) {
		// 패스워드를 입력받아 do while문으로 맞는지 검사한다. 패스워드가 맞으면 반복문을 빠져나
		final String USER_PASSWORD = "Hello";
		
		Scanner scanner = new Scanner(System.in);
		
		String password = "";
		do {
			System.out.print("Enter password >");
			password =scanner.nextLine();
			
		} while(!password.equals(USER_PASSWORD));
		
		scanner.close();
		System.out.print("접속 승인.");
		
	}

}
