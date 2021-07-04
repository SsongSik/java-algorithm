package day11;

import java.util.Scanner;

public class Q9 {

	static int[][] mdays = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
	};
	
	static int isLeap(int year) {
		return (year%4==0 && year%100!=0 || year%400 ==0) ? 1:0;
	}
	
	static int dayOfYear(int y, int m, int d) {
		int days= d;
		int days2 = 0;
		for(int j=1; j<13; j++)
			days2+=mdays[isLeap(y)][j-1];
		for(int i=1; i<m; i++)
			days+=mdays[isLeap(y)][i-1];
		return days2-days;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("남은 일 수를 구합니다.");
		
		System.out.print("년 : "); int year = scan.nextInt();
		System.out.print("월 : "); int month = scan.nextInt();
		System.out.print("일 : "); int day = scan.nextInt();
		
		System.out.println(dayOfYear(year, month, day));
		
	}

}
