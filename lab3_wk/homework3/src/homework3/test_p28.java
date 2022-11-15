package homework3;

public class test_p28 {

	public static void main(String[] args) {
		
		car28 car1;
		car1=new car28();
		car1.show();
		
		car28 car2;
		car2=new car28(1234,25);
		car2.show();
		
	}
}

class car28{
	
	private int num;
	private double gas;
	
	public car28() {
		
		num=0;
		gas=0;
		System.out.println("生產了車子");
		
	}
	
	public car28(int n,double g) {
		
		this();
		num=n;
		gas=g;
		System.out.println("生產了車號為"+num+"汽油量為"+gas+"的車子");
		
	}
	
	public void show() {
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
	
}