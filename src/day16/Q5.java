package day16;

import java.util.Scanner;

public class Q5 {

	static int binSearch(int[] a, int n, int ky) {
		int pl=0;
		int pr=n-1;
		
		do {
			int pc=(pr+pl)/2;
			
			if(a[pc]==ky) {
				for (; pc > pl; pc--) 
					if (a[pc - 1] < ky)
						break;
				return pc; 
			}
			else if(a[pc]<ky) {
				pl=pc+1;
			}
			else {
				pr=pc-1;
			}
		}while(pl<=pr);
		
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("��� �� : ");
		int num = scan.nextInt();
		int[] x = new int[num];
		
		System.out.print("x["+0+"] : ");
		x[0]=scan.nextInt();
		
		for(int i=1; i<num; i++) {
			do {
				System.out.print("x["+i+"] : ");
				x[i]=scan.nextInt();
			}while(x[i]<x[i-1]);
		}
		
		System.out.print("�˻��� �� : ");
		int key = scan.nextInt();
		
		int idx = binSearch(x, num, key);
		
		if(idx==-1) {
			System.out.println("ã�� ���߽��ϴ�.");
		}
		else {
			System.out.println(key+"���� x["+idx+"] �� �ֽ��ϴ�.");
		}
		
	}

}
