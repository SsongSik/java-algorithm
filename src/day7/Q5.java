package day7;

import java.util.Scanner;

public class Q5 {

	static void rcopy(int[] a, int[] b) {
		for(int i=0; i<a.length; i++) {
			b[i]=a[i];
		}
		for(int i=0; i<b.length/2; i++) {
			swap(b, i, b.length-i-1);
		}
	}
	
	static void swap(int[] b, int index1, int index2){
		int t=b[index1];
		b[index1]=b[index2];
		b[index2]=t;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("¿ä¼Ú ¼ö : ");
		int an = scan.nextInt();
		
		int[] a = new int[an];
		
		for(int i=0; i<a.length; i++) {
			System.out.print("a["+i+"] : ");
			a[i] = scan.nextInt();
		}

		int[] b = new int[an];
		
		rcopy(a, b);
		
		for(int i=0; i<b.length; i++) {
			System.out.println(b[i]);
		}
	}


}
