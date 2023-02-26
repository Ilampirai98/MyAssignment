package week1.day1;

public class Mobile {

	public void sendSms () {
		System.out.println( "Hi How Are You");
	}
	
	private void takeSnapShot() {
		System.out.println("Please take snap shot");

	}
	
	public static void main(String[] args) {
		Mobile obj= new Mobile();
		obj.sendSms();obj.takeSnapShot();
	}
}
