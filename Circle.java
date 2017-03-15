
public class Circle{
	private double radius=1.0;
	private String color ="red";
	Circle(){
		this.radius = 1.0;
		this.color = "red";
		
	}
	Circle(double radius,String color){
		this.radius = radius;
		this.color = color;
		
	}
        public double getRadius(){
		return this.radius;
	}
	public String getColor(){
		return this.color;
	}
	public double getArea(){
		double area=3.14*this.radius*this.radius;
		return area;

	}
	public static void main(String args[]){
		Circle c1 = new Circle(2.0,"blue");
		Circle c2 = new Circle(2.0,"red");
		Circle c3 = new Circle(1.0,"blue");
		TestCircle t = new TestCircle();
		t.display(c1);
		t.display(c2);
		t.display(c3);
		
	}
	
}