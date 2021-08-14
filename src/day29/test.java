package day29;

public class test {

	static void rea(int []b) {
		b[0] = 5;
	}
	
	public static void main(String[] args) {
		int[] a = new int[5];
		
		rea(a);
		
		for(int i=0; i<5; i++) {
			System.out.println(a[i]);
		}

	}

}
