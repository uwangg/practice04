package prob5;

public abstract class Shape {
	private int countSides;	// 변의 수
	
	public Shape(int countSides) {
		this.countSides = countSides;
	}
	
	public int getCountSide() {
		return this.countSides;
	}
	
	abstract double getArea();	// 넓이
	abstract double getPerimeter();	// 둘레길이
}
