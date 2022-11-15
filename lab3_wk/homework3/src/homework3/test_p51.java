package homework3;

public class test_p51 {
	public static void main(String[] args) {
		
		car51[] car;
		car=new car51[3];
		
		for(int i=0;i<car.length;i++)
		{
			car[i]=new car51();
			
		}
		
		car[0].setcar(1234,20.5);
		car[1].setcar(2345,30.5);
		car[2].setcar(3456,40.5);
		
		for(int i=0;i<car.length;i++) {
			car[i].show();
		}
	}

}

class car51{
	
	int num;
	double gas;
	
	public car51() {
		
		num=0;
		gas=0;
		System.out.println("生產了車子");
	}
	
	public void setcar(int n,double g) {
		num=n;
		gas=g;
		System.out.println("將車號設為"+num+"汽油量設為"+gas);
	}
	
	public void show() {
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
}