package mutlipleInheritanceUsingInterface;

public class Explore {

	public static void main(String[] args)
	{
	      SmartPhone smartphone = new SmartPhone();
		    
	      System.out.println("Wireless:"+smartphone.isWireless());
	      
	      smartphone.enableNFC();
	        
	       smartphone.disableNFC();
	        
	       smartphone.enableInternet();
	        
	        smartphone.disableInternet();
	}
}
