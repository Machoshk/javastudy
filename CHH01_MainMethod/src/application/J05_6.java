package application;

public class J05_6 {

	public static void main(String[] args) {
		// 
		String[] name = {"Kim","Jin","Park"};
		
		for(int i = 0; i < name.length;i++)
			System.out.println("names[" + i + "]:"+ name[i]);
		
		String tmp = name[2]; // �迭 names�� �� ��° ��Ҹ� tmp�� ����
		System.out.println("tmp : " + tmp);
		name[0] = "Yu"; // �迭 name�� ù ��° ��Ҹ� Yu�� ����
		
		for(int i=0; i < name.length; i++)
			System.out.println(name[i]);
	}
}
