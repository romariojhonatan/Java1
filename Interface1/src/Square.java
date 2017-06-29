
public class Square implements Shape {

	private int sideLenght=2;
	private static final int sides = 2;

	
	public Square(int sideLenght) {
		super();
		this.sideLenght = sideLenght;
	}

	public int getSideLenght() {
		return sideLenght;
	}

	public void setSideLenght(int sideLenght) {
		this.sideLenght = sideLenght;
	}

	public static int getSides() {
		return sides;
	}

	@Override
	public float getArea() {
		
		return sideLenght * sideLenght;
	}

	@Override
	public int getPerimeter() {
		return sides * sideLenght/2;
	}

}
