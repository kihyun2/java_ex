package ch06;

public class BoxDemo {
	public static void main(String[] args) {
		ColoredBox cb = new ColoredBox();
	}
}

class Box {
	public Box() {

	}

	public Box(String color) {
		System.out.println("Box가 생성되었습니다.");
	}

	public Box(int a, int b) {
	}
}

class ColoredBox extends Box {
	String color;

//	public ColoredBox() {
//		super(3, 1);
//		System.out.println("ColoredBox가 생성되었습니다.");
//	}
//
//	public ColoredBox(String color) {
//		this.color = color;
//		System.out.println(color + "색 박스가 생성되었습니다.");
//	}
}
