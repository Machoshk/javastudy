package application;

public class J06_14 {
	static {
		System.out.println("static { }");
	}
	
	{
		System.out.println("{}");
	}
	
	public J06_14() {
		System.out.println("생성자");
	}
	public static void main(String[] args) {
		// 맴버변수의 초기화 예제1
		System.out.println("J06_14 bt = new J06_14(); ");
		J06_14 bt = new J06_14();
		
		System.out.println("J06_14 bt2 = new J06_14();");
		J06_14 bt2 = new J06_14();
	}

}
