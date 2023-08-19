package week1.day1.assignments;

public class Mobile {
	

	public void makeCall() {
		String model ="Oppo";
		float weight =1.267f;
		System.out.println(1.267f);
		
	}
	public void sendSms() {
		boolean isFullCharged = true;
		int cost = 500000;
		System.out.println("This is my mobile");
	}

	public static void main(String[] args) {
		Mobile phone = new Mobile();
		phone.makeCall();
		phone.sendSms();
		

	}

}
