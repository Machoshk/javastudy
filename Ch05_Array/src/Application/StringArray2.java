package Application;

public class StringArray2 {

	public static void main(String[] args) {
		//String은 기본 자료형이 아닌 참조 자료형, 참조 변수는 기본적으로 주소값을 갖는다.
		String text = null; //널은 참조변수에 주소값이 없음
		//text = new String("Hello!"); new는 메모리에 문자열 공간을 만듬
		text = "헬로우!";
		System.out.println(text);
		
		String[] texts = null;
		System.out.println(texts);
		
		texts = new String[3]; // 3개의 문자열 배열공간 생성
		System.out.println(texts); // 배열의 주소값을 출력
		
		System.out.println();
		
		texts[0] = new String("하이!");
		texts[1] = new String("안녕?");
		texts[2] = new String("굿 바이!");
		
		for(String word: texts) {
			System.out.println(word);
		}
	}

}
