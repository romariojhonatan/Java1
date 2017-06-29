
public class Main {
	
	public static void main(String[] args) {
		Shape[] sp = new Shape[5];
		sp[0] = new Square(10);
		sp[1] =new Square(8);
		sp[2] =new Triangle(3, 4, 3, 4);
		sp[3] =new Triangle(3, 2, 3, 2);
		sp[4] =new Square(5);
		
		for (Shape shape : sp) {
			System.out.println(shape.getArea());
		}
	}
}
