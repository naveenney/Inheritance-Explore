package interfaceInheritance;

public class Smartphone implements WireLessFeatures{


    public void connectBluetooth()
	{
        System.out.println("Bluetooth connected");
         }
 
    public void disconnectBluetooth() 
	{
        System.out.println("Bluetooth disconnected");
           }
 
    public void enableHotspot()
	{
        System.out.println("Hotspot enabled");
        }

    public void disableHotspot() 
	{	
        System.out.println("Hotspot disabled");
	}
 
	
	
	
}
