package shapes;

import football.Barcelona;
import football.Football;
import football.ParisSaintGermain;
import football.RealMadrid;
import interfaceInheritance.InterfaceInheritance;

public class Demo {

	public static void main(String[] args)
	{
		Square sq=new Square(5,6);
		
		sq.display();
		
		Rectangle rec=new Rectangle(4,5);
		rec.display();
		
		rec.area();
		
		sq.area();
Football f=new ParisSaintGermain();
		
		Football f1=new RealMadrid();
		
		Football f2=new Barcelona();
		
       f.club();
       
       f1.club();
       
       f2.club();
		
	}
}
