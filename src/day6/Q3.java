package day6;

import java.util.Scanner;

public class Q3 {

	static int sumOf(int[] a) {
		int sum=0;
		
		for(int i=0; i<a.length; i++) {
			sum+=a[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		
		int[] x = new int[a];
		
		for(int i=0; i<x.length; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = scan.nextInt();
		}

		System.out.println("배열요소의 총 합은 ? :"+sumOf(x));
	}

}
