package homework3;

public class test_p27 {

	public static void main(String[] args) {
		
		car27 car1;
		car1=new car27();
		
		car1.show();
		
		car27 car2;
		car2=new car27(1234,20.5);
		
		car2.show();
		
		
	}
	
}

class car27{
	
	private int num;
	private double gas;
	
	public car27() {
		num=0;
		gas=0;
		System.out.println("生產了車子");
	}
	public car27(int n,double g) {
		num=n;
		gas=g;
		System.out.println("生產了車號為"+num+" 汽油量為"+gas+"的車子");
	}
	public void show() {
		System.out.println("車號是"+num);
		System.out.println("汽油量"+num);
	}
}