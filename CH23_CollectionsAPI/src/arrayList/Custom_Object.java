package arrayList;

import java.util.ArrayList;

//������ �����ϵ��� comparable �������̽��� �����Ѵ�.
public class Custom_Object  {
	
public static void main(String[] args) {
	ArrayList<Person> people = new ArrayList<>();
	
	people.add(new Person("���"));
	people.add(new Person("�浿"));
	people.add(new Person("���̾�"));
	people.add(new Person("�Ѹ�"));
	
	people.set(1, new Person("����Ŭ"));
	
	people.forEach(System.out::println);
	}
}
	