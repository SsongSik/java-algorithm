package day14;

import java.util.Scanner;

public class SeqSearchSen {

	static int seqSearch(int[] a, int n, int key) {
		int i=0;
		
		a[n] = key;
		
		while(true) {
			if (a[i]==key)
				break;
			i++;
		}
		return i==n ? -1 : i;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("요솟 수 : ");
		int num = scan.nextInt();
		
		int x[] = new int[num+1];
		
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
