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
		
		System.out.print("요솟 수 : ");
		int num = scan.nextInt();
		
		int x[] = new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("x["+i+"] : ");
			x[i]=scan.nextInt();
		}
		
		System.out.print("검색할 값 : ");
		int ky = scan.nextInt();
		
		int index = seqSearch(x, num, ky);
		
		if(index==-1)
			System.out.println("검색 실패 ");
		else
			System.out.println(ky+"값은 x["+index+"]"+"에 있습니다.");
	}

}
