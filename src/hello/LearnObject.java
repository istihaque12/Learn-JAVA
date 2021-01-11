package hello;

public class LearnObject {




// Creating a Object
	
	// className objectName = new constructorOfClass();
	
	
	int num1= 20;
	int num2= 30;
	
	
	
	public static void main(String[]args) {
		
		LearnObject learn= new LearnObject();
		
		int total= learn.num1+learn.num2;
		
		System.out.println("Total value is "+total);
		
		
		LearnObject obj=new LearnObject();
		obj.num1=10;
		obj.num2=20;
		int output=obj.num1*obj.num2;
		System.out.println("output is "+output);
				
		
		
		
		
	}




}
