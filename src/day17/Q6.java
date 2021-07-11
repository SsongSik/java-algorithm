package day17;

import java.util.Arrays;
import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("요솟 수 : ");
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
		
		System.out.print("검색할 값 : ");
		int key = scan.nextInt();
		
		int idx = Arrays.binarySearch(x, key);
		
		if(idx<0) {
			System.out.println("삽입 포인트 값 : "+idx);
		}
		else {
			System.out.println(key+"값은 x["+idx+"] 에 있습니다.");
		}
	}
}
