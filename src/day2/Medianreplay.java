package day2;

public class Medianreplay {

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
		System.out.println("Áß¾Ó°ª : "+med3(3,2,1));
		System.out.println("Áß¾Ó°ª : "+med3(3,2,2));
		System.out.println("Áß¾Ó°ª : "+med3(3,1,2));
		System.out.println("Áß¾Ó°ª : "+med3(3,1,1));
		
		System.out.println("Áß¾Ó°ª : "+med3(2,3,1));
		System.out.println("Áß¾Ó°ª : "+med3(2,3,2));
		System.out.println("Áß¾Ó°ª : "+med3(1,3,2));
		System.out.println("Áß¾Ó°ª : "+med3(1,3,1));
		
		System.out.println("Áß¾Ó°ª : "+med3(1,2,3));
		System.out.println("Áß¾Ó°ª : "+med3(1,2,3));
		System.out.println("Áß¾Ó°ª : "+med3(1,2,3));
		
	}

}
