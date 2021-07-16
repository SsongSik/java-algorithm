package day24;

import java.util.Scanner;

public class Q2 {

	static int gcd(int x, int y) {
		int z = 0;
		while(y!=0) {
			z = y;
			y = x % y;
			x = z;
			
		}
		return x;
		
//		if(y==0)
//			return x;
//		else
//			return gcd(y, x%y);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("두 정수의 최대공약수를 구합니다.");
		System.out.print("정수를 입력 : ");
		int x = scan.nextInt();
		System.out.print("정수를 입력 : ");
		int y = scan.nextInt();
		
		System.out.println("최대 공약수는 "+gcd(x,y)+"입니다");

	}

}
