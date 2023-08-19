package week1.day1;

public class Mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int price = 50000;
			boolean smartPhone = true;
			String name ="iphone";
			char logo ='A';
			float storage = 32.5678f;
			
		/**	System.out.println("Price="+price);
			System.out.println("Smartphone:"+smartPhone);
			System.out.println("Name:"+name);
			System.out.println("Logo:"+logo);
			System.out.println("Storage="+storage); 
			**/
			Mobile mobile = new Mobile();
			mobile.sendSms();
			System.out.println(mobile.makeCall(1234567890L));
	}
	
	public void sendSms() {
		System.out.println("From oppo");
	}
	public Long makeCall(Long phno) {
		return phno;
	}
}
