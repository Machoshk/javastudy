package method;

public class App {

	public static void main(String[] args) {
		// ������ ��� �繰�� ��ü�̰� new Ŭ����() �� �޸𸮿� ���ο� ��ü�� �����Ѵ�.
		Person p1 = new Person();
		
		System.out.println(p1.name);
		System.out.println(p1.age);
		p1.sayHello();
		
		p1.name = "���";
		p1.age =7;
		
		System.out.println(p1.name);
		System.out.println(p1.age);
	}
}
