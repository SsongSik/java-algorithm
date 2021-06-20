package day3;

import java.util.Scanner;

public class SunforPos {

	public static void main(String[] args) {
		Scanner scan = new  Scanner(System.in);
		
		int n;
		
		do {
			System.out.print("n값 입력 : ");
			n = scan.nextInt();
		}while(n<=0);
		
		int sum = 0;
		
		for(int i=0; i<=n; i++) {
			sum= sum+ i;
		}
		System.out.println(n+"까지의 합 : "+sum);
	}

}
