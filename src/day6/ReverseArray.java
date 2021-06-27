package day6;

import java.util.Scanner;

public class ReverseArray {

	static void swap(int [] a, int index1, int index2) {
		int t=a[index1];
		a[index1] = a[index2];
		a[index2] = t;
	}
	
	static void reverse(int [] a) {
		for(int i=0; i<a.length/2; i++) {
			swap(a, i, a.length-i-1);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("¿ä¼Ú ¼ö  : ");
		
		int a = scan.nextInt();
		
		int[] x = new int[a];
		
		for(int i=0; i<x.length; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = scan.nextInt();
		}
		
		reverse(x);
		
		for(int i=0; i<x.length; i++) {
			System.out.println(x[i]);
		}
	}

}
