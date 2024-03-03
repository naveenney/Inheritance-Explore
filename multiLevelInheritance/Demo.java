package multiLevelInheritance;

public class Demo {

	public static void main(String[] args)
	{
	  Pen p=new Pen();
		
		p.colour();
		
		p.size();
		
		p.write();
		
		p.shape();
		
		p.close();
		
		Box b=new Box();
		
		b.colour();
		
		b.shape();
		
		b.state();
		
		b.write();
		
		b.size();
		
		b.open();
		
		b.close();
		
		b.isTheft();
		
		Bag b1=new Bag();
		
		b1.colour();
		
		b1.shape();
		
		b1.size();
		
		b1.state();
		
		b1.open();
		
		b1.close();
		
		b1.store();
		
		b1.clean();
		
	        b1.isTheft();
	    
	        b1.write();
	    
	    
	}
}
