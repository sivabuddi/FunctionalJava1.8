package higherorderfunctions;

@FunctionalInterface
interface I{
	
	int m1();
	
}


@FunctionalInterface
interface J{
	
	int m2();
	
}


@FunctionalInterface
interface K{
	
	 void  m3(I a, J b);
	
}


@FunctionalInterface
interface A{
	
	  int  m5();
	
}


@FunctionalInterface
interface L{
	
	  A m4(I a, J b);
	
}

public class HigerOrderFunctions {
	
	public static void main(String[] args) {
		 // case 1: Functions which accepts another functions as argument and return nothing
		
		I obj1 = () -> {return 111;};
		J obj2 = () -> {return 222;};
		
		K obj3 = (I x, J y) -> {
			System.out.println(obj1.m1()+ obj2.m2());
		};
		
		obj3.m3(obj1, obj2);
		
		// case 2: Functions which accepts another functions as an arugument and returns another functions as output
		
		I obj4 = () ->  {return 555;};
		J obj5 = () ->  {return 555;};
		
		L obj6 = (I x, J y)->{
				//A obj7 = () ->{System.out.println("Im in m5() of A interface");};
			A obj7 = () ->{return 777;};
			//System.out.println(obj7.m5());
			return obj7;
		};
		
		obj6.m4(obj4, obj5);
		A obj8 = obj6.m4(obj4, obj5);// Functions which accepts functions as an argument and returns another functions as output.
		System.out.println(obj8.m5());// returns functions as return value
		
		
		
		
	}

}
