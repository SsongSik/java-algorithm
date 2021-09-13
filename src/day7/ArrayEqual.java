package day7;

import java.util.Scanner;

public class ArrayEqual {

	static boolean equals(int[] a, int[] b) {
		if(a.length!=b.length) {
			return false;
		}
		for(int i=0; i<a.length; i++) {
			if(a[i]!=b[i]) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("요숏 수 : ");
		int an = scan.nextInt();
		
		int[] a = new int[an];
		
		for(int i=0; i<a.length; i++) {
			System.out.print("a["+i+"] : ");
			a[i]=scan.nextInt();
		}
		
		System.out.print("요숏 수 : ");
		int bn = scan.nextInt();
		
		int[] b = new int[bn];
		
		for(int i=0; i<b.length; i++) {
			System.out.print("b["+i+"] : ");
			b[i]=scan.nextInt();
		}
		
		System.out.println("두 배열은 "+(equals(a,b) ? "같습니다." : "같지 않습니다."));
	}

}
