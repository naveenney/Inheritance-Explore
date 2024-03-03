package multiLevelInheritance;

public class Box extends Pen{

	void colour()
	{
		System.out.println("Box Colour method calling");
	}
	
	void size()
	{
		System.out.println("Box Size method calling");
	}
	
	void shape()
	{
		System.out.println("Box Shape method calling");
	}
	
	void state()
	{
		System.out.println("Box State Method is calling");
	}
	void open()
	{
		System.out.println("Box open method calling");
	}
	
	void close()
	{
		System.out.println("Box close method calling");
	}

	void isTheft()
	{
		System.out.println("Box Theft Method is calling");
	}
	
	static void eraser()
	{
		System.out.println("eraser method in Box class");
	}
	
	static void pencil()
	{
		System.out.println("box class pencil method calling");
	}
}
