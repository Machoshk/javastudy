package arrayList;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		// arrayList
		ArrayList<Integer> list = new ArrayList<>();
		
		// �Է�
		list.add(7);
		list.add(9);
		list.add(123);
		
		// ���
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
	}

}
