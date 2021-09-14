package day9;

public class PrimeNumber {

	public static void main(String[] args) {
		int counter = 0;
		
		for(int n =2; n<=1000; n++) {
			int i;
			for(i=2; i<n; i++) {
				counter++;
				if(n%i==0)
					break;
			}
			if(n==i) {
				System.out.println(n);
			}
		}
		System.out.println("ÃÑ ³ª´°¼À È½¼ö :   "+ counter);
	}
}
/*°á°ú
2
3
5
..
ÃÑ ³ª´°¼À È½¼ö :   78022
*/