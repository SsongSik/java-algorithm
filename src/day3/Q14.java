package day3;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		
		for(int i = 1; i<=a; i++) {
			for(int j = 1; j<=a; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
