package day3;

import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a;
		
		do {
			
			System.out.println("a �Է�s : ");
			a = scan.nextInt();
		}while(a<10 || a>99);
		
		System.out.println("a�� ���� : "+ a);

	}

}
