package day1;

public class Median {

	static int med3(int a, int b, int c) {
		if(a>=b) {
			if(b>=c) {
				return b;
			}
			else if(a<=c) {
				return a;
			}
			else {
				return c;
			}
		}
		else if(a>c) {
			return a;
		}
		else if(b>c) {
			return c;
		}
		else return b;
	}
	
	public static void main(String[] args) {
		System.out.println(med3(4,2,3));
		System.out.println(med3(3,4,2));
		System.out.println(med3(4,3,2));
		System.out.println(med3(4,3,1));
	}

}
