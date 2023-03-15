package MyPackage;

interface MyCamera1{
	
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

interface MyWifi1{
	
    String[] getNetworks();
    void connectToNetwork(String network);
    
}

class MyCellPhone1{
	
    void callNumber(int phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting... ");
    }

}

class MySmartPhone1 extends MyCellPhone1 implements MyWifi1, MyCamera1{
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


public class PolymorphismDemo {
	public static void main(String[] args) {
		
	MyCamera1 mc = new MySmartPhone1();	//this is a smartphone but, use it as a camera
	mc.record4KVideo();	//you can call only MyCamera1 class methods
	
	//mc.getNetworks();	-----> not allowed
	//mc.callNumber();	-----> not allowed
	
}
}
