package datastructures;

public class Stackv1 {
	static final int MAX = 1000;
	int[] array = new int[MAX];
	int top;

	public Stackv1() {

		top = -1;
	}

	boolean isEmpty() {
		return (top < 0);
	}

	void push(int a) {
		if(top==MAX)
			System.out.println("Maximum reached");
		else {
		top++;
		array[top] = a;
		}

	}

	int peek() {

		return array[top];
	}

	void pop() {
		if(top==-1)
			System.out.println("Stack underflow");
		else {
		array[top]=0;
		top--;
		}
	}

	void printStack() {
		for (int i = 0; i <= top; i++)
			System.out.print(array[i] + " ");
		System.out.println();

	}

	int length() {
		return top + 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stackv1 st = new Stackv1();
		
		st.push(5);
		st.push(6);
		st.push(7);
		st.printStack();
		
		st.pop();
		st.printStack();
		//jSystem.out.println(st.peek());
		//st.printStack();
		st.pop();
		st.printStack();
		System.out.println(st.isEmpty());

		st.pop();
		st.printStack();
		System.out.println(st.isEmpty());
		st.pop();

	}

}
