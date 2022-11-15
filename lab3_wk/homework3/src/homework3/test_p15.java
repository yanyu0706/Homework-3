package homework3;

public class test_p15 {

	public static void main(String[] args) {
		
		car15 car1;
		car1= new car15();
		
		int number=1234;
		double gasoline=20.5;
		
		car1.setnumgas(number, gasoline);
	}
}


class car15{
	
	int num;
	double gas;
	
	void setnumgas(int n,double g) {
		
		int num=n;
		double gas=g;
		
		System.out.println("將車號設為"+num+"將汽油量設為"+gas);
	}
	
	void show() {
		
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
	
}

