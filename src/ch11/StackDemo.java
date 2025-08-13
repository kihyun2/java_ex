package ch11;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		System.out.println(stack.size());
		System.out.println(stack.empty());
		stack.push("사과");
		stack.push("바나나");
		stack.push("체리");
		System.out.println(stack);
		System.out.println(stack.search("체리"));
		System.out.println(stack.search("사과"));

//		System.out.println(stack.pop());
//		System.out.println(stack);
//		System.out.println(stack.pop());
//		System.out.println(stack);
//		System.out.println(stack.pop());
//		System.out.println(stack);
//		while (!stack.empty()) {
//			System.out.println(stack.pop());
//		}
		System.out.println(stack.get(0));

	}
}
