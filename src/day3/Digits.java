package day3;

import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a;
		
		do {
			
			System.out.println("a 입력s : ");
			a = scan.nextInt();
		}while(a<10 || a>99);
		
		System.out.println("a의 값은 : "+ a);

	}

}
