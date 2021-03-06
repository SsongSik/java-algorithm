package day21;

public class Q4 {
	private int max;
	private int num;
	private int[] que;
	
	public class EmptyIntStackException extends RuntimeException{
		public EmptyIntStackException() { }
	}
	
	public class OverflowIntStackException extends RuntimeException{
		public OverflowIntStackException() { }
	}
	
	public Q4(int capacity) {
		num = 0;
		max = capacity;
		try {
			que = new int[capacity];
		}catch(OutOfMemoryError e) {
			max = 0;
		}
	}
	
	public int enque(int x) throws OverflowIntStackException{
		if(num>=max)
			throw new OverflowIntStackException();
		return que[num++] = x;
	}
	
	public int deque() throws EmptyIntStackException{
		if(num<=0)
			throw new EmptyIntStackException();
		int x = que[0];
		for(int i=0; i<num; i++) {
			que[i]=que[i+1];
		}
		num--;
		return x;
	}
	
	public int peek() throws EmptyIntStackException{
		if(num <=0)
			throw new EmptyIntStackException();
		return que[num-1];
	}
	
	public int indexOf(int x) {
		for(int i=num-1; i>=0; i--)
			if(que[i]==x)
				return i;
		return -1;
	}
	
	public void clear() {
		num=0;
	}
	
	public int capacity() {
		return max;
	}
	
	public int size() {
		return num;
	}
	
	public boolean isEmpty() {
		return num <= 0;
	}
	
	public boolean isFull() {
		return num>=max;
	}
	
	public void dump() {
		if(num<=0)
			System.out.println("스택이 비어있습니다.");
		else {
			for(int i=0; i<num; i++)
				System.out.print(que[i]+"  ");
			System.out.println();
		}
	}
}
