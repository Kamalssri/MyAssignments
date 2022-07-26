package week2day1k;

public class Employee {
      public void printEmployeeName(String name) {
      System.out.println(name);
 }
      public void printEmployeeId (int id) {
    	  System.out.println(id);
 }
      public void printEmployeeAddress(String address) {
    	  System.out.println(address);
 }
      public void printEmployeeSalary(double salary) {
    	  System.out.println(salary);
 }
      public void printEmployeeMobileNumber(long mobilenumber) {
    	  System.out.println(mobilenumber);                       
 }
      public static void main(String[] args) {
		Employee empl=new Employee();
		empl.printEmployeeName("mahe");
		empl.printEmployeeId(412);
		empl.printEmployeeAddress("chennai");
		empl.printEmployeeSalary(18000);
		empl.printEmployeeMobileNumber(8124431412l);
		
}
}
