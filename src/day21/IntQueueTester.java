package day21;

import java.util.Scanner;

public class IntQueueTester {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Q4 s = new Q4(64);
		
		while(true) {
			System.out.println("���� �������� �� :"+s.size()+"/"+s.capacity());
			System.out.print("(1)Ǫ��  (2)��  (3)��ũ (4)���� (0)����");
			
			int menu = scan.nextInt();
			if(menu==0) break;
			
			int x;
			switch(menu) {
			case 1:
				System.out.print("������ : ");
				x= scan.nextInt();
				try {
					s.enque(x);
				}catch(Q4.OverflowIntStackException e) {
					System.out.println("���� ���� ��");
				}
				break;
				
			case 2:
				try {
					x=s.deque();
					System.out.println("���� �����ʹ� : "+x);
				}catch(Q4.EmptyIntStackException e){
					System.out.println("������ �������");
				}
				break;
				
			case 3:
				try {
					x=s.peek();
					System.out.println("��ũ�� �����ʹ� : "+x);
				}catch(Q4.EmptyIntStackException e) {
					System.out.println("������ ����ֽ��ϴ�.");
				}
				break;
			
			case 4:
				s.dump();
				break;
			}
		}

	}

}
