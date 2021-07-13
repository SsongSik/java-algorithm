package day20;

import java.util.Scanner;

import day19.IntStack;

public class Q1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		IntStack s = new IntStack(64);
		
		while(true) {
			System.out.println("���� �������� �� :"+s.size()+"/"+s.capacity());
			System.out.print("(1)Ǫ��  (2)��  (3)��ũ (4)���� (5)Ŭ���� (6)ã�� �� (0)����");
			
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
				
			case 5:
				s.clear();
				break;
				
			case 6 :
				System.out.print("ã�� ������ �� �Է� : ");
				data = scan.nextInt();
				System.out.println(data+"�� ��ġ :" +s.indexOf(data));
				break;
			}
		}

	}

}
