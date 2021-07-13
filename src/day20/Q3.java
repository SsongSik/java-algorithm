package day20;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		IntStack s = new IntStack(64);
		IntStack2 s2 = new IntStack2(64);
		
		
		while(true) {
		System.out.print("���� : (1)s1  (2)s2");
		int num=scan.nextInt();
		
		if(num==1) {
		while(true) {
			System.out.print("(1)Ǫ��  (2)��  (3)��ũ (4)���� (0)����");
			
			int menu = scan.nextInt();
			if(menu==0) break;
			
			int x;
			int data;
			switch(menu) {
			case 1:
				System.out.print("������ : ");
				x= scan.nextInt();
				try {
					s.push(x);
				}catch(IntStack.OverflowIntStackException e) {
					System.out.println("���� ���� ��");
				}
				break;
				
			case 2:
				try {
					x=s.pop();
					System.out.println("���� �����ʹ� : "+x);
				}catch(IntStack.EmptyIntStackException e){
					System.out.println("������ �������");
				}
				break;
				
			case 3:
				try {
					x=s.peek();
					System.out.println("��ũ�� �����ʹ� : "+x);
				}catch(IntStack.EmptyIntStackException e) {
					System.out.println("������ ����ֽ��ϴ�.");
				}
				break;
				
			case 4:
				s.dump();
				break;
			}
			break;
		}
		}
		else {
			while(true) {
				System.out.print("(1)Ǫ��  (2)��  (3)��ũ (0)����");
				
				int menu = scan.nextInt();
				if(menu==0) break;
				
				int x;
				int data;
				switch(menu) {
				case 1:
					System.out.print("������ : ");
					x= scan.nextInt();
					try {
						s2.push(x);
					}catch(IntStack.OverflowIntStackException e) {
						System.out.println("���� ���� ��");
					}
					break;
					
				case 2:
					try {
						x=s2.pop();
						System.out.println("���� �����ʹ� : "+x);
					}catch(IntStack.EmptyIntStackException e){
						System.out.println("������ �������");
					}
					break;
					
				case 3:
					try {
						x=s2.peek();
						System.out.println("��ũ�� �����ʹ� : "+x);
					}catch(IntStack.EmptyIntStackException e) {
						System.out.println("������ ����ֽ��ϴ�.");
					}
					break;
				}
				break;
			}
		}
		}
	}

}
