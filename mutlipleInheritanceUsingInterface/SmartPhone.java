package mutlipleInheritanceUsingInterface;

public class SmartPhone implements Wireless{

    public void enableNFC() 
    {
        System.out.println("NFC enabled");
    }
 
    public void disableNFC() 
    {
        System.out.println("NFC disabled");
    }
 
    public void enableInternet() 
    {
        System.out.println("Internet enabled");
    }
 
    public void disableInternet() 
    {
        System.out.println("Internet disabled");
    }
 
    public boolean isWireless() 
    {
        return true;
    }
    

}