package linklist;

import java.util.Stack;

public class UseStack {

	public static void main(String[] args) {
		Stack<String> stack= new Stack();
		stack.add("ny");
		stack.add("pa");
		stack.add("fl");
		stack.add("ca");
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.push("az"));
		System.out.println(stack.peek());
	}

}
