package day2;

public class Qprac9 {

	
	static int sumof(int a, int b) {
		int sum=0;
		
		if(a<b) {
			while(a<=b) {
				sum=sum+a;
				a++;
			}
			return sum;
		}
		else if(a>b) {
			while(b<=a) {
				sum=sum+b;
				b++;
			}
			return sum;
		}
		else {
			return a+b;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(sumof(6,4));
	}

}
