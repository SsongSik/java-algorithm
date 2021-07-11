package day18;

import java.util.Arrays;
import java.util.Scanner;

public class StringBinarySearch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] x = {
				"abstract", "assert", "case", "catch", "int"
		};
		
		System.out.print("ã�� �� : ");
		
		String text = scan.next();
		
		int idx = Arrays.binarySearch(x, text);
		
		if(idx<0)
			System.out.println("����");
		else
			System.out.println(text+"���� x["+idx+"]�� �ֽ��ϴ�.");

	}

}
