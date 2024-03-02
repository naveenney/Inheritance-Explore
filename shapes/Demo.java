package shapes;

public class Demo {

	public static void main(String[] args)
	{
		Square sq=new Square(5,6);
		
		sq.display();
		
		Rectangle rec=new Rectangle(4,5);
		rec.display();
		
		rec.area();
		
		sq.area();
}
}
