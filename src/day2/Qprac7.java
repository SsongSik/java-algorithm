package day2;

import java.util.Scanner;

public class Qprac7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int sum = 0;
		
		for(int i=1; i<=a; i++) {
			
			sum=sum+i;
			if(i==a) {
				System.out.println(i+"="+sum);
			}
			else {
				System.out.print(i+"+");
			}
		}

	}

}
