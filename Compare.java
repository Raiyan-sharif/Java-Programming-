class Compare{
	int result;
	Compare(){
		this.result =0;
	}
	public int largerNumber(int a,int b){
		if(a>b){
			this.result = a;
			System.out.println("The largest number between "+a+" and "+b+" is "+this.result);
		}
		else if(b>a){
			this.result = b;
			System.out.println("The largest number between "+a+" and "+b+" is "+this.result);
		}
		else{
			System.out.println("The numbers "+a+" and "+b+" are equal");
			this.result =a;
		}
		return this.result;
	}
	public static void main(String args[]){
		Compare c=  new Compare();
		c.largerNumber(9987,9897);
		
	}
	
	
}