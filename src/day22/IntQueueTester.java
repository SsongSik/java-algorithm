package day22;

import java.util.Scanner;

public class IntQueueTester {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		IntQueue s = new IntQueue(8);
		
		while(true) {
			System.out.println("현재 데이터의 수 :"+s.size()+"/"+s.capacity());
			System.out.print("(1)인큐  (2)디큐  (3)피크 (4)덤프 (5)인덱스 찾기 (6)순서 찾기 (0)종료");
			
			int menu = scan.nextInt();
			if(menu==0) break;
			
			int x;
			switch(menu) {
			case 1:
				System.out.print("데이터 : ");
				x= scan.nextInt();
				try {
					s.enque(x);
				}catch(IntQueue.OverflowIntQueueException e) {
					System.out.println("큐 가득 참");
				}
				break;
				
			case 2:
				try {
					x=s.deque();
					System.out.println("디큐한 데이터는 : "+x);
				}catch(IntQueue.EmptyIntQueueException e){
					System.out.println("큐가 비어있음");
				}
				break;
				
			case 3:
				try {
					x=s.peek();
					System.out.println("피크한 데이터는 : "+x);
				}catch(IntQueue.EmptyIntQueueException e) {
					System.out.println("스택이 비어있습니다.");
				}
				break;
			
			case 4:
				s.dump();
				break;
				
			case 5:
				System.out.print("찾을 값 입력 : ");
				x = scan.nextInt();
				int y = s.indexOf(x);
				System.out.println(x+"값은 "+y+"에 있습니다.");
				
			case 6:
				System.out.print("찾을 값 입력 : ");
				x = scan.nextInt();
				int z = s.search(x);
				System.out.println(x+"값은 "+z+"에 있습니다.");
			}
		}

	}

}
