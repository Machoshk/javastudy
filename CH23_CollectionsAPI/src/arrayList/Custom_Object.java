package arrayList;

import java.util.ArrayList;

//정렬이 가능하도록 comparable 인터페이스를 구현한다.
public class Custom_Object  {
	
public static void main(String[] args) {
	ArrayList<Person> people = new ArrayList<>();
	
	people.add(new Person("펭수"));
	people.add(new Person("길동"));
	people.add(new Person("라이언"));
	people.add(new Person("둘리"));
	
	people.set(1, new Person("마이클"));
	
	people.forEach(System.out::println);
	}
}
	