import java.lang.Math;

public class Point {
	private String name;
	private int x;
	private int y;

	// Create a point
	public Point(String name, int x, int y) {
		this.name = name;
		this.x = x;
		this.y = y;
	}

	// Create a copy of a point that
	public Point(Point that) {
		this.name = that.name;
		this.x = that.x;
		this.y = that.y;
	}

	// Return distance between this point and given point that
	public double dist(Point that) {
		int xDiff = this.x - that.x;
		int yDiff = this.y - that.y;
		return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
	}

	// Return if this point is the same as that point
	public boolean equals(Point that) {
		if (!this.name.equals(that.name))
			return false;
		if (this.x != that.x)
			return false;
		if (this.y != that.y)
			return false;
		return true;
	}

	public String getName() {
		return name;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String toString() {
		return "(" + name + " " + x + " " + y + ")";
	}

	public static void main(String[] args) {
		// Constructing two points p1 and p2, then printing them
		Point p1 = new Point("A", 3, 4);
		Point p2 = new Point("B", 5, 6);
		System.out.println(p1 + "  " + p2);

		// Testing getters
		String n = p1.getName();
		int x = p1.getX();
		int y = p1.getY();
		System.out.println("(" + n + " " + x + " " + y + ")");

		// Testing dist and equals
		System.out.println(p1.dist(p2));
		System.out.println(p1.equals(p2));

		// Testing setters
		p2.setX(1);
		p2.setY(2);
		System.out.println(p2);

		// Testing copying constructor
		Point p3 = new Point(p1);
		System.out.println(p3);
	}

}
