package week2assignments;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int a1= 153;
		int a2=a1;
		int arm=0;
		while (a1>0) {
			int rem=a1%10;
			a1=a1/10;
			arm=arm+(rem*rem*rem);
			
			
		}
		if (arm==a2) {
			System.out.println("it is armstrong number");
			
		} else {
            System.out.println("it is not armstrong number");
		}
		
		
	}

}
