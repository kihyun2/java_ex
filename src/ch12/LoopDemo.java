package ch12;

import java.util.stream.Stream;

public class LoopDemo {
	public static void main(String[] args) {
		int i = 0;
		Stream<Nation> peek = Nation.nations.stream().filter(n -> n.isIsland()).peek(x -> System.out.print(x));
		System.out.println("ㅎㅇ");
		peek.forEach(Util::printWithParenthesis);

	}
}
