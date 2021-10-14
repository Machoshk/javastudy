package Application;

import java.util.Scanner;

public class Scope {

	public static void main(String[] args) {
		// 변수의 범위는 코드블록{} 으로 결정
		{
			int value = 0;
			System.out.println(value);
		}	
			
			//System.out.println(value); 코드블록 밖에서 사용불가
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<4; i++) {
			System.out.println(i);
		}
		
		//System.out.println(i);
		
		String input = null;
		
		do {
			System.out.println("종료하려면 'quit'를 입력하세요");
			input = scanner.nextLine();
		} while(!input.equals("quit"));
		
		scanner.close();
	}

}
