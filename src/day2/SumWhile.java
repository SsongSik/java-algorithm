package day2;

import java.util.Scanner;

public class SumWhile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int sum=0;
		
		int i=1;
		while(i<=a) {
			sum=sum+i;
			i++;
		}
		System.out.println(a+"까지의 합은 : "+sum);
	}

}
