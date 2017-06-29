
public class Triangle implements Shape{

	private int baseLength;
	private int side1Lenght;
	private int side2Lenght;
	private int height;
	
	public Triangle(int baseLength, int side1Lenght, int side2Lenght, int height) {
		super();
		this.baseLength = baseLength;
		this.side1Lenght = side1Lenght;
		this.side2Lenght = side2Lenght;
		this.height = height;
	}
	
	public int getBaseLength() {
		return baseLength;
	}

	public void setBaseLength(int baseLength) {
		this.baseLength = baseLength;
	}

	public int getSide1Lenght() {
		return side1Lenght;
	}

	public void setSide1Lenght(int side1Lenght) {
		this.side1Lenght = side1Lenght;
	}

	public int getSide2Lenght() {
		return side2Lenght;
	}

	public void setSide2Lenght(int side2Lenght) {
		this.side2Lenght = side2Lenght;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public float getArea() {
		return (baseLength*height)/2;
	}
	@Override
	public int getPerimeter() {
		return 0;
	}
	
}