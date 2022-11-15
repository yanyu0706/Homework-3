package homework3;

public class test_p31 {

	public static void main(String[] args) {
		
		car31.showsum();
		
		car31 car1;
		car1=new car31();
		car1.setcar(1234, 20.5);
		
		car31.showsum();
		
		car31 car2;
		car2=new car31();
		car2.setcar(4567, 30.5);
		
	}
}

class car31{
	
	public static int sum=0;
	
	private int num;
	private double gas;
	
	public car31() {
		
		num=0;
		gas=0;
		sum++;
		System.out.println("生產了車子");
	}
	
	public void setcar(int n,double g) {
		num=n;
		gas=g;
		System.out.println("將車號設為"+num+"汽油量設為"+gas);
	}
	
	public static void showsum() {
		System.out.println("車子總共有"+sum+"台");
	}
	public void show() {
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
}