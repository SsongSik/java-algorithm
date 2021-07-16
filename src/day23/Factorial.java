package day23;

import java.util.Scanner;

public class Factorial {
	
	static int factorial(int n) {
		if(n>0)
			return n * factorial(n-1);
		else
			return 1;
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� �� �Է� : ");
		int x = scan.nextInt();
		
		System.out.println(x+"�� ���丮�� ���� ? :"+factorial(x));

	}

}
