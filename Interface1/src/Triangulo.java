
public class Triangulo implements Shape {

	private int baselenght;
	private int side1lenght;
	private int side2lenght;
	private int height;

	public Triangulo(int baselenght, int side1lenght, int side2lenght, int height) {
		super();
		this.baselenght = baselenght;
		this.side1lenght = side1lenght;
		this.side2lenght = side2lenght;
		this.height = height;
	}

	public int getBaselenght() {
		return baselenght;
	}

	public void setBaselenght(int baselenght) {
		this.baselenght = baselenght;
	}

	public int getSide1lenght() {
		return side1lenght;
	}

	public void setSide1lenght(int side1lenght) {
		this.side1lenght = side1lenght;
	}

	public int getSide2lenght() {
		return side2lenght;
	}

	public void setSide2lenght(int side2lenght) {
		this.side2lenght = side2lenght;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public float getArea() {

		return (baselenght * height) / 2;
	}

	@Override
	public int getPerimeter() {

		return baselenght + side1lenght + side2lenght;
	}

}
