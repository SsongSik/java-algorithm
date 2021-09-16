package day14;

import java.util.Scanner;

public class SeqSearch {

	static int seqSearch(int[] a, int n, int key) {
		
		for(int i=0; i<n; i++) {
			if(a[i]==key)
				return i;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("��� �� : ");
		int num = scan.nextInt();
		
		int x[] = new int[num];
		
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
