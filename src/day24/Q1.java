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
		
		System.out.print("정수 값 입력 : ");
		int x = scan.nextInt();
		
		System.out.println(x+"의 팩토리얼 값은 ? :"+factorial(x));

	}

}
