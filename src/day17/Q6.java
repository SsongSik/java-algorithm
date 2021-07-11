package day17;

import java.util.Arrays;
import java.util.Scanner;

public class Q6 {

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
			}while(x[i]<=x[i-1]);
		}
		
		System.out.print("�˻��� �� : ");
		int key = scan.nextInt();
		
		int idx = Arrays.binarySearch(x, key);
		
		if(idx<0) {
			System.out.println("���� ����Ʈ �� : "+idx);
		}
		else {
			System.out.println(key+"���� x["+idx+"] �� �ֽ��ϴ�.");
		}
	}
}
