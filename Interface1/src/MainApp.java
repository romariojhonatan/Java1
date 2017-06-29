
public class MainApp {

	public static void main(String[] args) {

		Shape[] shapes = new Shape[5];
		
		shapes[0] = new Square(10);
		shapes[1] = new Square(10);
		shapes[2] = new Triangulo(3, 4, 3, 4);
		shapes[3] = new Triangulo(3, 4, 3, 4);
		shapes[4] = new Square(10);
		
		for (Shape shape : shapes) {
			System.out.println(shape.getArea());
		}
	}
}
