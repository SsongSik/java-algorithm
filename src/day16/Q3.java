package day16;

import java.util.Scanner;

public class Q3 {
	
	static int searchIdx(int[] a, int n, int key, int[] y) {
	
		int counter=0;
		
		for(int i=0; i<n; i++) {
			if(a[i]==key)
				counter++;
		}	

		return counter;

	}
	
	static void searchIdx2(int[] a, int n, int key, int[] y) {
		
		int counter=0;
		
		for(int i=0; i<n; i++) {
			if(a[i]==key) {
				y[counter]=i;
				counter++;
			}
		}	
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.print("¿ä¼Ú ¼ö : ");
		int num=scan.nextInt();
		
		int[] x = new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("x["+i+"] : ");
			x[i]=scan.nextInt();
		}
		
		int[] y = new int[0];
		
		System.out.print("Ã£À» °ª : ");
		int key = scan.nextInt();
		
		int idx = searchIdx(x, num, key, y);
		
		y = new int[idx];
		
		searchIdx2(x, num, key, y);
		
		for(int i=0; i<idx; i++) {
			System.out.println("y["+i+"] : "+y[i]);
		}
		System.out.println("¿ä¼Ú ¼ö´Â : "+idx);
		
	}

}
