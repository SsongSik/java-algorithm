package day21;

import java.util.Scanner;

public class IntQueueTester {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Q4 s = new Q4(64);
		
		while(true) {
			System.out.println("현재 데이터의 수 :"+s.size()+"/"+s.capacity());
			System.out.print("(1)푸시  (2)팝  (3)피크 (4)덤프 (0)종료");
			
			int menu = scan.nextInt();
			if(menu==0) break;
			
			int x;
			switch(menu) {
			case 1:
				System.out.print("데이터 : ");
				x= scan.nextInt();
				try {
					s.enque(x);
				}catch(Q4.OverflowIntStackException e) {
					System.out.println("스택 가득 참");
				}
				break;
				
			case 2:
				try {
					x=s.deque();
					System.out.println("팝한 데이터는 : "+x);
				}catch(Q4.EmptyIntStackException e){
					System.out.println("스택이 비어있음");
				}
				break;
				
			case 3:
				try {
					x=s.peek();
					System.out.println("피크한 데이터는 : "+x);
				}catch(Q4.EmptyIntStackException e) {
					System.out.println("스택이 비어있습니다.");
				}
				break;
			
			case 4:
				s.dump();
				break;
			}
		}

	}

}
