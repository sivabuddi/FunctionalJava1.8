package javabasics;

class A{
	int a;
	int b;
	
	public A() {
		System.out.println("Im in A");
		
	}
	public void test_a() {
		System.out.println("im in test A");
	}
	
	
}


class B extends A{
	int c; 
	int d;
	
	public B() {
		
		System.out.println("Im in B");
		
	}
	
	public void test_b() {
		System.out.println("im in test B");
	}
	
	
}

public class Inheri {
	
	public static void main(String[] args) {
		
//		A a = new A();
//		B b = new B();
//		a = b;// specialization
//		// b = a;// generalzation
//		a.test_a();
//	   // b.test_a();
		
		
		// Generalziation or  Up casting i.e, converting subclass type into super class (Widening)
		
		A a1;	
		a1 = (A) new B();
		a1.test_a();
		
		// Specialization or Down casting  i,e, converting superclass in to sub class type (Narrowing)
		
		B b1;
		b1 = (B) new A();// error
		// b1.test_a(); error
		// b1.test_b(); error
		
	}

}
