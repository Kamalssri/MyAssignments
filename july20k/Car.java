package july20k;

public class Car {

	public void applyBrake() {
		System.out.println("applyBrake");
		
	}
   public void applyGear() {
	   System.out.println("applyGear");
   }
    public void switchOnAc() {
    	System.out.println("switchOnAc");
    }	
    public void applyAcclerate() {
    	System.out.println("applyAcclerate");
    }
    public static void main(String[] args) {
    	Car obj= new Car(); 
	    obj.applyBrake();
	    obj.applyGear();
	    obj.applyAcclerate();
	    obj.switchOnAc();
	    

    }
	}


