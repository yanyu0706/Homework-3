package homework3;

public class test_p24 {

	public static void main(String[] args) {
		
		car24 car;
		car=new car24();
		
		car.setCar(1234,20.5);
		car.show();
		
		System.out.println("只變更車號");
		car.setCar(2345);
		car.show();
		
		System.out.println("只變更汽油量");
		car.setCar(50.5);
		car.show();
		
	}
}

class car24{
	
	private int num;
	private double gas;
	
	public void setCar(int n) {
		num=n;
		System.out.println("將車號設為"+num);
	}
	
	public void setCar(double g)
	{
		gas =g;
		System.out.println("將汽油量設為"+gas);
	}
	
	public void setCar(int n,double g) {
		num=n;
		gas=g;
		System.out.println("將車號設為"+num+" 汽油量設為"+gas);
	}
	
	public void show() {
		
		System.out.println("車號是"+this.num);
		System.out.println("汽油量是"+this.gas);
	}
	
}
