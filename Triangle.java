class Triangle{
	private int x;
	private int y;
	private int z;
	Triangle(){
	    x =0;
		y =0;
		z = 0;
		
	}
	Triangle(int x,int y,int z){
		this.x=x;
		this.y=y;
		this.z=z;
	}
	void showInfo(){
		System.out.println("x: "+x);
		System.out.println("y: "+y);
		System.out.println("z: "+z);
	}
	void testTriangle(){
	    if(x==y&&y==z&&x==z){
		    System.out.println("the triangle is equilateral");
		}
		else if((x==y&&x!=z)||(x==z&&x!=y)||(y==z&&y!=x)){
		    System.out.println("the triangle is isosceles");
		}
		else{
		    System.out.println("the triangle is  scalene");
		}
	
	}
	
	
	
	public static void main(String args[]){
		Triangle obj1 = new Triangle();
		obj1.showInfo();
		
		Triangle obj2 = new Triangle(23,23,23);
		obj2.showInfo();
		obj2.testTriangle();
		Triangle obj3 = new Triangle(29,43,23);
		obj3.showInfo();
		obj3.testTriangle();
		Triangle obj4 = new Triangle(23,43,23);
		obj4.showInfo();
		obj4.testTriangle();
		
		
       		
	}
	
}
