package Application;

import java.util.Scanner;

public class Scope {

	public static void main(String[] args) {
		// ������ ������ �ڵ���{} ���� ����
		{
			int value = 0;
			System.out.println(value);
		}	
			
			//System.out.println(value); �ڵ��� �ۿ��� ���Ұ�
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<4; i++) {
			System.out.println(i);
		}
		
		//System.out.println(i);
		
		String input = null;
		
		do {
			System.out.println("�����Ϸ��� 'quit'�� �Է��ϼ���");
			input = scanner.nextLine();
		} while(!input.equals("quit"));
		
		scanner.close();
	}

}
