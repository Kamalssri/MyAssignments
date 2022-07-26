package week2day1k;

public class Calculator {
      public void add() {
    	  int a=50;
    	  int b=70;
    	  int c=a+b;
    	  System.out.println(c);
}
      public void sub() {
          int e=110;
          int f=86;
          int g=e-f;
          System.out.println(g);
 }
      public void multiple() {
    	  double i=56;
    	  double j=12;
    	  double k=i*j;
    	  System.out.println(k);
 }
      public void division() {
    	  float x=178;
    	  float y=22;
    	  float z=x/y;
    	  System.out.println(z);
 }
      public static void main(String[] args) {
		Calculator cals=new Calculator();
		cals.add();
		cals.sub();
		cals.multiple();
		cals.division();
}
 }
