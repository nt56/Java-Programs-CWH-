package MyPackage;
 /*
interface Bicycle{
	//int a =10;
	void applyBreak(int decrement);
	void speedUp(int increment);
}

interface HornBicycle{
	void horn();
	void greet();
}

class AvonCycle implements Bicycle,HornBicycle{
	
	int speed = 7;
	
	public void applyBreak(int decrement) {
		speed = speed - decrement;
		System.out.println("applying break: " +speed);
	}
	
	public void speedUp(int increment) {
		speed = speed + increment;
		System.out.println("Applying speed: " +speed);
	}
	
	public void horn() {
		System.out.println("Horn Please....");
	}
	
	public void greet() {
		System.out.println("Good Morning.....");
	}
}

public class InterFaceDemo {

	public static void main(String[] args) {
		
		AvonCycle ac = new AvonCycle();
		ac.applyBreak(5);
		ac.speedUp(5);
		ac.horn();
		ac.greet();
		
		//System.out.println(ac.a);	//you can create the a properties in interface
		
		//ac.a = 20;	-----> //you cannot modify the properties in interface as they are final
		

		
	}

}
*/

//all method which defined in interface you have implement these as public in other class
//you can implement interface as you can
//you cannot extend abstract class more than one



interface MyCamera{
	
    void takeSnap();
    void recordVideo();
    
    private void greet(){
        System.out.println("Good Morning");
    }
    
    default void record4KVideo(){
        greet();
        System.out.println("Recording in 4k...");
    }
    
}

interface MyWifi{
	
    String[] getNetworks();
    void connectToNetwork(String network);
    
}

class MyCellPhone{
	
    void callNumber(int phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting... ");
    }

}

class MySmartPhone extends MyCellPhone implements MyWifi, MyCamera{
    public void takeSnap(){
        System.out.println("Taking snap");
    }
    public void recordVideo(){
        System.out.println("Taking snap");
    }
    
    public String[] getNetworks(){
        System.out.println("Getting List of Networks");
        String[] networkList = {"Harry", "Prashanth", "Anjali5G"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to " + network);
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        ms.record4KVideo();
        String[] ar = ms.getNetworks();
        for (String item: ar) {
            System.out.println(item);
        }
    }
}

