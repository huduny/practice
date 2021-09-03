package homeworks21090302;

public class Triangle extends Shape {
	private double side;
	
	public Triangle(double side) {
		this.side = side;
	}
	@Override
	public double area() {
		return Math.sqrt(3)*side*side;
	}
	@Override
	public double perimeter() {
		return 3*side;
	}
	@Override
	public String toString() {
		return "도형의 종류: 삼각형, [넓이=" + area() + ", 둘레=" + perimeter() + "]";
	}
	
}
