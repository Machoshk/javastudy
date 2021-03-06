package application;

import collections.Wrapper;
import heirarchy.Cat;
import heirarchy.Creature;

public class App {

	public static void main(String[] args) {
		// 제네릭 타입 클래스는 객체를 만들때 타입을 지정한다.
		Wrapper<Cat> wrapper = new Wrapper<>();	//포장 클래스의 객체를 만듬
		Wrapper<Creature> wrapper2 = new Wrapper<>();
		
		Cat cat = new Cat("마틸다");
		Creature creature = new Creature("생물");
		
		wrapper.set(cat);
		wrapper2.set(creature);
		
		Cat r1 = wrapper.get();
		Creature r2 = wrapper2.get();
		
		System.out.println(r1);
		System.out.println(r2);

		r1.feed();
		r2.feed();
	}
}
