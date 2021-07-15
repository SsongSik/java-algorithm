package day22;

import java.util.Scanner;

public class IntQueueTester {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		IntQueue s = new IntQueue(8);
		
		while(true) {
			System.out.println("���� �������� �� :"+s.size()+"/"+s.capacity());
			System.out.print("(1)��ť  (2)��ť  (3)��ũ (4)���� (5)�ε��� ã�� (6)���� ã�� (0)����");
			
			int menu = scan.nextInt();
			if(menu==0) break;
			
			int x;
			switch(menu) {
			case 1:
				System.out.print("������ : ");
				x= scan.nextInt();
				try {
					s.enque(x);
				}catch(IntQueue.OverflowIntQueueException e) {
					System.out.println("ť ���� ��");
				}
				break;
				
			case 2:
				try {
					x=s.deque();
					System.out.println("��ť�� �����ʹ� : "+x);
				}catch(IntQueue.EmptyIntQueueException e){
					System.out.println("ť�� �������");
				}
				break;
				
			case 3:
				try {
					x=s.peek();
					System.out.println("��ũ�� �����ʹ� : "+x);
				}catch(IntQueue.EmptyIntQueueException e) {
					System.out.println("������ ����ֽ��ϴ�.");
				}
				break;
			
			case 4:
				s.dump();
				break;
				
			case 5:
				System.out.print("ã�� �� �Է� : ");
				x = scan.nextInt();
				int y = s.indexOf(x);
				System.out.println(x+"���� "+y+"�� �ֽ��ϴ�.");
				
			case 6:
				System.out.print("ã�� �� �Է� : ");
				x = scan.nextInt();
				int z = s.search(x);
				System.out.println(x+"���� "+z+"�� �ֽ��ϴ�.");
			}
		}

	}

}
