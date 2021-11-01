package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// 스캐너 사용해 리스트에 실수를 입력해 출력
		Scanner scanner = new Scanner(System.in);

		ArrayList<Double> numbers = new ArrayList<>();
		
		double total = 0;
	
		while (true) {
			System.out.println("숫자 또는 'q' 입력 >");
			String input = scanner.nextLine(); // 엔터전까지 입력한 문자열을 저장
			input = input.trim(); // 만약 공백이 앞 뒤에 있으면 제거

			if(input.equalsIgnoreCase("q")) {	// 대소문자 동일
				break;
			}
			
			try {
				double value = Double.parseDouble(input); // 문자열 숫자를 => 실수로 변
				numbers.add(value); // 입력한 실수를 리스트에 저장
				total = total + value;
			} catch (NumberFormatException e) {
				// 실수를 변환할때 발생한 예외
				System.out.println("숫자가 아닙니다.");
				continue;
			}
		}

		scanner.close();

		System.out.println();
		
	
		if(numbers.size()>0) {	// 입력된 실수가 있다.
		System.out.println("입력된 숫자 : ");
		
		Collections.sort(numbers);	// 리스트를 정렬한다.
		for (Double number : numbers) {
			System.out.printf("%.2f\n", number);
		}
		System.out.println();
		System.out.printf("평균값 : %.2f", total / numbers.size());// 실수를 소수점 2자리까지 출력
		
	}	else {
		System.out.println("실수가 입력되지 않았습니다.");
	}
}
}