package day11;

import java.util.Scanner;

public class DayOfYear {

	static int[][] mdays = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
	};
	
	static int isLeap(int year) {
		return (year%4==0 && year%100!=0 || year%400 ==0) ? 1:0;
	}
	
	static int dayOfYear(int y, int m, int d) {
		int days= d;
		
		for(int i=1; i<m; i++)
			days+=mdays[isLeap(y)][i-1];
		return days;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�� �� ��� �ϼ��� ���մϴ�.");
		
		System.out.print("�� : "); int year = scan.nextInt();
		System.out.print("�� : "); int month = scan.nextInt();
		System.out.print("�� : "); int day = scan.nextInt();
		
		System.out.println(dayOfYear(year, month, day));
		
	}

}
