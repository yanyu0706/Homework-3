package homework3;

public class test_p12 {
	
	public static void main(String[] args ) {
		
		car12 car1;
		car1=new car12();
		
		car1.num=1234;
		car1.gas=20.5;
			
	}
}

class car12{
	
	int num;
	double gas;
	
	void show()
	{
		System.out.println("車號是"+this.num);
		System.out.println("汽油量是"+this.gas);
	}
	
	void showcar()
	{
		System.out.println("開始顯示車子資料");
		this.show();
	}
}

