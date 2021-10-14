package method;

public class App {

	public static void main(String[] args) {
		// 세상의 모든 사물은 객체이고 new 클래스() 로 메모리에 새로운 객체를 생성한다.
		Person p1 = new Person();
		
		System.out.println(p1.name);
		System.out.println(p1.age);
		p1.sayHello();
		
		p1.name = "펭수";
		p1.age =7;
		
		System.out.println(p1.name);
		System.out.println(p1.age);
	}
}
