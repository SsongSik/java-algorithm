package day3;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n;
		
		int a = scan.nextInt();
		int b;
		do {
			System.out.println("b�� �� ũ�� �Է��ϼ���.d");
			b=scan.nextInt();
			
		}while(a>b);

		System.out.println(b-a);
	}

}
