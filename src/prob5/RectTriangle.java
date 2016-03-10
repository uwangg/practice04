package prob5;

// 직각 삼각형 클래스
public class RectTriangle extends Shape {
	private double width;
	private double height;

	public RectTriangle(double width, double height) {
		super(3);
		this.width = width;
		this.height = height;
	}

	@Override
	double getArea() {	// 직각삼각형의 넓이
		double area = 0.5 * width * height;
		return area;
	}

	@Override
	double getPerimeter() {	// 직각삼각형의 둘레
		// TODO Auto-generated method stub
		double perimeter = width + height + Math.sqrt(Math.pow(width, 2)+Math.pow(height, 2));
		return perimeter;
	}

}
