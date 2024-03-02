package shapes;

public class Rectangle implements Shape{

	Rectangle()
	{
	   System.out.println("rectangle constructor is calling");
	}
	
	public void calculateArea()
	{
		System.out.println("calculate rectangle area method is calling");
		
	}
	
    public void area()
    {
    	System.out.println("Rectangle Formula:length*width");
    }
	
    public void shape()
    {
    	System.out.println("recrangle shape");
    }
    
    public void display()
    {
    	System.out.println("rectangle display method calling");
    }
}
