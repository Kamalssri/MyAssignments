package bank;

public class Students {
    public void getStudentsInfo( int id) {
    	System.out.println(id);
   }
    public void getStudentsInfo( int id, String name) {
    	System.out.println(id+ " " +name);
    	
    }
    public void getStudentsInfo( String email, long phonenumber) {
    	System.out.println(email+ " "+phonenumber);
    }
    public static void main(String[] args) {
		Students details=new Students ();
		details.getStudentsInfo(122);
		details.getStudentsInfo(122, "kamal");
		details.getStudentsInfo("kamalnpc122@gmail.com", 8220351671l);
	}
}
