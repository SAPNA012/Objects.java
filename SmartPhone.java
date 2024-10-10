package basicJava.org.com;

public class SmartPhone {
     //Here we will discuss about the object and example of object
	//what is object?  >>  A real life entity that have characteristics and behaviors 	it is consider as object. 
	//In java,, objects are instances of a class which are created from a class in Java. They have states and behavior. 
	
	String BrandName="Samsung";
	String ModelName="Galaxy";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone sp=new SmartPhone();
		
		System.out.println("Brand Name:"+sp.BrandName+" "+"ModelName:"+sp.ModelName);
	}

}
