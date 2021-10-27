package application;

public class J05_6 {

	public static void main(String[] args) {
		// 
		String[] name = {"Kim","Jin","Park"};
		
		for(int i = 0; i < name.length;i++)
			System.out.println("names[" + i + "]:"+ name[i]);
		
		String tmp = name[2]; // 배열 names의 세 번째 요소를 tmp에 저장
		System.out.println("tmp : " + tmp);
		name[0] = "Yu"; // 배열 name의 첫 번째 요소를 Yu로 변경
		
		for(int i=0; i < name.length; i++)
			System.out.println(name[i]);
	}
}
