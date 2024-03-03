package multiLevelInheritance;

public class ExploreStatic {

	public static void main(String[] args)
	{
	    Bag b1=new Bag();
		
            b1.eraser();
	   	
	    Box b4=new Bag();
	    
	    b4.eraser();
	    
	    /*
	     * box class and bag class both have eraser method 
	     * i assign bag class reference to box class(parent class) object
	     * Normally bag class eraser method is called this scenario
	     * but one important thing to note i declared static non access modifier to both eraser method 
	     * so this scenario box class eraser method called because static method doesn't care about references 
	     */
	    
	    
	}
}
