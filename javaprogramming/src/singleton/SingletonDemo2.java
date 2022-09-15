package singleton;

public class SingletonDemo2 {

	public static void main(String[] args) {
		 
		
		SingletonFirst instance1 = SingletonFirst.getSingletonDemos();
		SingletonFirst instance2 = SingletonFirst.getSingletonDemos();
		SingletonFirst instance3 = SingletonFirst.getSingletonDemos();
		
		
		instance1.s = (instance1.s).toUpperCase();
		
		System.out.println(instance1.s);
		System.out.println(instance2.s);
		System.out.println(instance3.s);
		
		
		instance2.s =(instance2.s).toLowerCase();
		
		
		System.out.println(instance1.s);
		System.out.println(instance2.s);
		System.out.println(instance3.s);
		
		

	}

}
