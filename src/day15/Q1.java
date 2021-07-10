package day15;

import java.util.Scanner;

public class Q1 {

	static int seqSearch(int[] a, int n, int key) {
		int j=0;
		
		a[n] = key;
		
		for(j=0; j<n; j++) {
			if (a[j]==key)
				break;
		}
		return j==n ? -1 : j;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("��� �� : ");
		int num = scan.nextInt();
		
		int x[] = new int[num+1];
		
		for(int i=0; i<num; i++) {
			System.out.print("x["+i+"] : ");
			x[i]=scan.nextInt();
		}
		
		System.out.print("�˻��� �� : ");
		int ky = scan.nextInt();
		
		int index = seqSearch(x, num, ky);
		
		if(index==-1)
			System.out.println("�˻� ���� ");
		else
			System.out.println(ky+"���� x["+index+"]"+"�� �ֽ��ϴ�.");
	}
}