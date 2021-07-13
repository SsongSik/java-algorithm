package day20;

import java.util.Scanner;

import day19.IntStack;

public class Q1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		IntStack s = new IntStack(64);
		
		while(true) {
			System.out.println("현재 데이터의 수 :"+s.size()+"/"+s.capacity());
			System.out.print("(1)푸시  (2)팝  (3)피크 (4)덤프 (5)클리어 (6)찾을 값 (0)종료");
			
			int menu = scan.nextInt();
			if(menu==0) break;
			
			int x;
			int data;
			switch(menu) {
			case 1:
				System.out.print("데이터 : ");
				x= scan.nextInt();
				try {
					s.push(x);
				}catch(IntStack.OverflowIntStackException e) {
					System.out.println("스택 가득 참");
				}
				break;
				
			case 2:
				try {
					x=s.pop();
					System.out.println("팝한 데이터는 : "+x);
				}catch(IntStack.EmptyIntStackException e){
					System.out.println("스택이 비어있음");
				}
				break;
				
			case 3:
				try {
					x=s.peek();
					System.out.println("피크한 데이터는 : "+x);
				}catch(IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어있습니다.");
				}
				break;
			
			case 4:
				s.dump();
				break;
				
			case 5:
				s.clear();
				break;
				
			case 6 :
				System.out.print("찾을 데이터 값 입력 : ");
				data = scan.nextInt();
				System.out.println(data+"의 위치 :" +s.indexOf(data));
				break;
			}
		}

	}

}
