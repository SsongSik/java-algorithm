package day5;

import java.util.Random;
import java.util.Scanner;

public class MaxOfAraryRand {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("사람 수 : ");
		int a = scan.nextInt();
		
		int [] height = new int[a];
		
		for(int i=0; i<height.length; i++) {
			height[i] = 100 + rand.nextInt(90);
			System.out.println("height["+i+"] :"+height[i]);
		}
		
		System.out.println("최댓값 : "+maxOf(height));

	}
	
	static int maxOf(int [] a) {
		int max = a[0];
		
		for(int i=1; i<a.length; i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		return max;
	}

}	
