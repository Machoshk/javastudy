package list_interface;

import java.util.ArrayList;
import java.util.List;

public class App2 {

	public static void main(String[] args) {
		// ����Ʈ �������̽��� addAll(����Ʈ) �߰�
		List<Integer> list1 = new ArrayList<>();
		
		list1.add(5);
		list1.add(7);
		list1.add(8);
		list1.add(4);

		displayList(list1);	// ����Ʈ ������ ����ϴ� �޼ҵ�
		
		System.out.println();
		
		List<Integer> list2 = new ArrayList<>();
		
		list2.addAll(list1);
		list2.add(4);
		list2.add(5);
		
		displayList(list2);
	}

	private static void displayList(List<Integer> list) {
		// �Ű������� ����Ʈ ��ü�� �Է�
		list.forEach(System.out::println);
	}
}
