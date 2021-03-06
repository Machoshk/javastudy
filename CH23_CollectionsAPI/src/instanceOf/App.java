package instanceOf;

import java.io.Serializable;

// creature 클래스는 시리얼인터페이스를 구현하여 디폴트 id를 만들었음 
class Creature implements Serializable{
	private static final long serialVersionUID = 1L;
}
// cat 클래스는 creature클래스를 상속해서 디폴트 id 생성했음
class Cat extends Creature{
	private static final long serialVersionUID = 1L;
}

public class App {

	public static void main(String[] args) {
		// 객체의 타입을 판별한다.
		Creature c1 = new Creature();
		Object c2 = c1;	//Object는 최상위 클래스 타입으로 어느 클래스 타입에도 선언가능(업캐스팅)
		
		Cat c3 = new Cat();
		
		Serializable c4 = (Serializable)c3;
		
		System.out.println(c2 instanceof Object); //object는 최상이 클래스이므로
		
		System.out.println(c2 instanceof Serializable);	//serializable 인터페이스 구현했기 때문에 true
		
		System.out.println(c2 instanceof Creature);	// creature 클래스의 객체
		
		System.out.println(c2 instanceof Cat);	// c1은 캣 클래스는 아니므로 false
		
		
	}

}
