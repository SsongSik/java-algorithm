package day1;

public class min3m {

	static int min3(int a, int b, int c) {
		int min = a;
		if(b<min) {
			min=b;
		}
		if(c<min) {
			min=c;
		}
		
		return min;
	}
	public static void main(String[] args) {
		System.out.println("ÃÖ¼Ú°ªÀº : "+min3(3, 5, 1));
		System.out.println("ÃÖ¼Ú°ªÀº : "+min3(4, 5, 1));
		System.out.println("ÃÖ¼Ú°ªÀº : "+min3(1, 2, 5));
		System.out.println("ÃÖ¼Ú°ªÀº : "+min3(2, 1, 4));
	}

}
