package day27;

import java.util.Scanner;

public class Q6 {

	static void move(int no, int x, int y) {
		String[] name = {"a���", "b���", "c���"};
		
		if(no>1)
			move(no-1, x, 6-x-y);
		
		System.out.println("����["+no+"]�� "+name[x-1]+"��տ��� "+name[y-1]+"������� �ű� ");
		
		if(no>1)
			move(no-1, 6-x-y, y);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�ϳ����� ž");
		System.out.print("���� ���� : ");
		
		int num = scan.nextInt();
		
		move(num, 1, 3);

	}
}
