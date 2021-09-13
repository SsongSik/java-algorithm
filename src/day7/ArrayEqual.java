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
		
		System.out.print("��� �� : ");
		int an = scan.nextInt();
		
		int[] a = new int[an];
		
		for(int i=0; i<a.length; i++) {
			System.out.print("a["+i+"] : ");
			a[i]=scan.nextInt();
		}
		
		System.out.print("��� �� : ");
		int bn = scan.nextInt();
		
		int[] b = new int[bn];
		
		for(int i=0; i<b.length; i++) {
			System.out.print("b["+i+"] : ");
			b[i]=scan.nextInt();
		}
		
		System.out.println("�� �迭�� "+(equals(a,b) ? "�����ϴ�." : "���� �ʽ��ϴ�."));
	}

}
