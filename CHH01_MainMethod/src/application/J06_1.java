package application;

public class J06_1 {

	public static void main(String[] args) {
		Tv t; // Tv�ν��Ͻ��� �����ϱ� ���� ���� t�� ����
		t = new Tv();	// Tv�ν��Ͻ��� �����Ѵ�.
		t.channel = 7;	// Tv�ν��Ͻ��� ������� channel�� ���� 7�� �Ѵ�.
		t.channelDown();	// Tv�ν��Ͻ��� �޼��� channelDown�� ȣ���Ѵ�.
		System.out.println("���� ü���� " + t.channel + "�Դϴ�.");
	}
}

class Tv{
	// Tv�� �Ӽ�(�ɹ�����)
	String color;	// ����
	boolean power;	// ��������(on/off)
	int channel;	// ä��

	// Tv�� ���(�޼���)
	void power() { power = !power;}	//Tv�� �Ѱų� ���� ����� �ϴ� �޼���
	void channelUp() { ++channel;}	//TV�� ü���� ���̴� ����� �ϴ� �޼���
	void channelDown() { --channel;}	//TV�� ü���� ���ߴ� ����� �ϴ� �޼��� 
}
