package shapes;

public class Square extends Rectangle{
   
	int length1=4,width1=4;
	Square(int length1,int width1) {
		super(length1, width1);
		System.out.println("Super constructor is calling");
	}
    
		public void display1()
       {
    	    this.display();
         }
	  
	   public void shape()
	   {
		   System.out.println("Square Shape");
	   }
       
	
}	

