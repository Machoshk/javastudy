package Application;

public class StringArray2 {

	public static void main(String[] args) {
		//String�� �⺻ �ڷ����� �ƴ� ���� �ڷ���, ���� ������ �⺻������ �ּҰ��� ���´�.
		String text = null; //���� ���������� �ּҰ��� ����
		//text = new String("Hello!"); new�� �޸𸮿� ���ڿ� ������ ����
		text = "��ο�!";
		System.out.println(text);
		
		String[] texts = null;
		System.out.println(texts);
		
		texts = new String[3]; // 3���� ���ڿ� �迭���� ����
		System.out.println(texts); // �迭�� �ּҰ��� ���
		
		System.out.println();
		
		texts[0] = new String("����!");
		texts[1] = new String("�ȳ�?");
		texts[2] = new String("�� ����!");
		
		for(String word: texts) {
			System.out.println(word);
		}
	}

}
