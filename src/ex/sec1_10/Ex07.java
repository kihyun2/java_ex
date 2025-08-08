package ex.sec1_10;

public class Ex07 {
	public static void main(String[] args) {
		Point point = new Point(2, 3);
		MovablePoint movablePoint = new MovablePoint(4, 3, 1, 1);
		System.out.println(point.toString());
		System.out.println(movablePoint.toString());
	}
}

class Point {
	private int x, y;

	public Point() {
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {

		return String.format("point(%d, %d)", x, y);
	}

	// getter setter
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}

class MovablePoint extends Point {
	private int xSpeed, ySpeed;

	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		super(x, y);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	@Override
	public String toString() {
		return String.format("MovablePoint(%d, %d, %d, %d)", super.getX(), super.getY(), xSpeed, ySpeed);
	}

	// getter setter
	public int getxSpeed() {
		return xSpeed;
	}

	public void setxSpeed(int xSpeed) {
		this.xSpeed = xSpeed;
	}

	public int getySpeed() {
		return ySpeed;
	}

	public void setySpeed(int ySpeed) {
		this.ySpeed = ySpeed;
	}
}