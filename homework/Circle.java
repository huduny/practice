package homeworks21090302;

public class Circle extends Shape{
	private double radius;
	
	public Circle(double radius){
		this.radius =radius;
	}
	@Override
	public double area() {
		return Math.PI*radius*radius;
	}
	@Override
	public double perimeter() {
		return 2*Math.PI*radius;
	}
	public String toString() {
		return "도형의 종류: 원 [넓이=" + area() + ", 둘레=" + perimeter() + "]";
	}
	
}
