package day27;

import java.util.Scanner;

public class Q6 {

	static void move(int no, int x, int y) {
		String[] name = {"a±âµÕ", "b±âµÕ", "c±âµÕ"};
		
		if(no>1)
			move(no-1, x, 6-x-y);
		
		System.out.println("¿ø¹Ý["+no+"]À» "+name[x-1]+"±âµÕ¿¡¼­ "+name[y-1]+"±âµÕÀ¸·Î ¿Å±è ");
		
		if(no>1)
			move(no-1, 6-x-y, y);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("ÇÏ³ëÀÌÀÇ Å¾");
		System.out.print("¿ø¹Ý °¹¼ö : ");
		
		int num = scan.nextInt();
		
		move(num, 1, 3);

	}
}
