package day18;

import java.util.Arrays;
import java.util.Scanner;

public class StringBinarySearch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] x = {
				"abstract", "assert", "case", "catch", "int"
		};
		
		System.out.print("찾을 값 : ");
		
		String text = scan.next();
		
		int idx = Arrays.binarySearch(x, text);
		
		if(idx<0)
			System.out.println("없음");
		else
			System.out.println(text+"값은 x["+idx+"]에 있습니다.");

	}

}
