package arrayList;

import java.util.ArrayList;

public class Iterating {

	public static void main(String[] args) {

		// �ݺ������� �ڷḦ ������ ���
		ArrayList<Integer> list = new ArrayList<>();

		list.add(7);
		list.add(9);
		list.add(123);
		
		for(Integer n: list) {
			System.out.println(n);
		}
		System.out.println();
		
		for(int i = 0; i < list.size(); i++) {
			Integer n = list.get(i);
			
			System.out.println(i + ": " + n);
		}
		
		System.out.println();
		
		list.forEach(System.out::println);
		
		System.out.println();
		
		list.forEach(e->{
			System.out.println(e);
		});
	}
}