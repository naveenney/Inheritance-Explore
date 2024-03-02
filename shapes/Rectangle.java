package shapes;

public class Rectangle implements Shape{

	private int length;
	private int width;
	
	Rectangle(int length,int width)
	{
		this.length=length;
		this.width=width;
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
    	System.out.println(length+" "+width);
    }
}
