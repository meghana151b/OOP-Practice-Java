package polymorphism;

public class CompileTimePolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calculate =new Calculator();
		System.out.println("Addition of two integers"+calculate.add(5, 10));	
		 System.out.println("Addition of three integers: " + calculate.add(5, 10, 15));
		 System.out.println("Addition of two doubles: "+ calculate.add(5.5, 10.2));
		 

	}

}
