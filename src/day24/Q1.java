package day24;

import java.util.Scanner;

public class Q1 {

	static int factorial(int n) {
		
		int fact = 1;
		if(n>0) {
			for(int i=1; i<=n; i++) {
				fact = fact * i;
			}
			return fact;
		}
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
