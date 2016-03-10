package prob5;

public class ShapeTest {
	public static void main(String args[]) {
		Shape rtangle = new Rectangle(5,6);
		Shape rtriangle = new RectTriangle(6,2);
		
		Shape sp[] = new Shape[2];
		sp[0] = rtangle;
		sp[1] = rtriangle;
		
		for(int i=0 ; i<sp.length ; i++)
		{
			System.out.println("area: "+sp[i].getArea());
			System.out.println("perimeter: "+sp[i].getPerimeter());
			if(sp[i] instanceof Rectangle)
			{
				Rectangle tmp = (Rectangle)sp[i];
				tmp.resize(0.5);
				System.out.println("new area: "+ sp[i].getArea());
				System.out.println("new perimeter: "+sp[i].getPerimeter());
			}
		}
			
	}
}
