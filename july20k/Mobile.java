package july20k;

public class Mobile {
	public void sendMessage() {
		System.out.println("sendMessage");
}
	public void shareDocument() {
		System.out.println("shareDocument");
}
	public void call() {
		System.out.println("call");
	}

	public static void main(String[] args) {
		Mobile mob= new Mobile();
		mob.sendMessage();
		mob.shareDocument();
		mob.call();
		
	}
}
