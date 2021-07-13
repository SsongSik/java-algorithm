package day20;

public class IntStack2 {
	private int max;
	private int ptr;
	private int[] stk;
	
	public class EmptyIntStackException extends RuntimeException{
		public EmptyIntStackException() { }
	}
	
	public class OverflowIntStackException extends RuntimeException{
		public OverflowIntStackException() { }
	}
	
	public IntStack2(int capacity) {
		ptr = capacity-1;
		max = capacity/2;
		try {
			stk = new int[capacity];
		}catch(OutOfMemoryError e) {
			max = 0;
		}
	}
	
	public int push(int x) throws OverflowIntStackException{
		if(ptr<=max)
			throw new OverflowIntStackException();
		return stk[ptr--] = x;
	}
	
	public int pop() throws EmptyIntStackException{
		if(ptr<=0)
			throw new EmptyIntStackException();
		return stk[++ptr];
	}
	
	public int peek() throws EmptyIntStackException{
		if(ptr <=0)
			throw new EmptyIntStackException();
		return stk[ptr+1];
	}
	
//	public int indexOf(int x) {
//		for(int i=ptr-1; i>=0; i--)
//			if(stk[i]==x)
//				return i;
//		return -1;
//	}
//	
//	public void clear() {
//		ptr=0;
//	}
//	
//	public int capacity() {
//		return max;
//	}
//	
//	public int size() {
//		return ptr;
//	}
//	
//	public boolean isEmpty() {
//		return ptr <= 0;
//	}
//	
//	public boolean isFull() {
//		return ptr>=max;
//	}
	
//	public void dump() {
//		if(ptr>=64)
//			System.out.println("스택이 비어있습니다.");
//		else {
//			for(int i=max; i>max; i--)
//				System.out.print(stk[i]+"  ");
//			System.out.println();
//		}
//	}
}
