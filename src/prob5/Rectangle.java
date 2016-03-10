package prob5;

// 직사각형 클래스
public class Rectangle extends Shape implements Resizable {
	private double width;
	private double height;

	public Rectangle(double width, double height) {
		super(4);
		this.width = width;
		this.height = height;		
	}
	
	@Override
	public void resize(double rate) {
		this.width *= rate;
		this.height *= rate;
	}

	@Override
	double getArea() {	// 직사각형 넓이
		double area = width * height;
		return area;
	}

	@Override
	double getPerimeter() {	// 직사각형 둘레
		double perimeter = 2 * (width + height);
		return perimeter;
	}
	
	

}
