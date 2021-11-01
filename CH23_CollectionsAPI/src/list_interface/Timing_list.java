package list_interface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Timing_list {

	public static void main(String[] args) {
		// arraylist VS linkedlist
		List<Integer> arrayList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();
		// 클래스 가져올때 단축기 ctrl + space , 여러개 한번에 가져올때는 ctrl + shift + o
		long duration = timeOperations(arrayList);
		
		System.out.println("측정시간 : " + duration);
	}

	public static long timeOperations(List<Integer> list) {
		// 입력받은 리스트로 실행시간을 측정해서 리턴
		long start = System.currentTimeMillis();
		
		for(int i = 0; i < 100000; i++) {
			list.add(0, i);
		}
		
		return System.currentTimeMillis() - start;
	}
}
