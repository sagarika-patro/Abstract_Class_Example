package test;

public abstract class AClass {

	public int a;
	
	public double result;
	
	 public AClass(int a) {
		  
		 this.a=a;
	 }
	
	public void calculate() {
		
		result =Math.pow(a, 2);
		
		
	}
	
	public abstract void getResult();
	
}
