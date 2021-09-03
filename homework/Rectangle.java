package homeworks21090302;

public class Rectangle extends Shape {
	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
		this.height = height;
		this.width = width;
	}
	@Override
	public double area() {
		return height*width;
	}
	@Override
	public double perimeter() {
		return (2*height)+(2*width);
	}
	@Override
	public String toString() {
		return "도형의 종류: 삼각형, [넓이=" + area() + ", 둘레=" + perimeter() + "]";
	}
	
}
