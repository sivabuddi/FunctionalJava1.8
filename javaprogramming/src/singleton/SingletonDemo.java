package singleton;
class SingletonDemo{
	
	
	public static void main(String[] args) {
	
		
		SingletonFirst instance1 = SingletonFirst.getSingletonDemos();
		SingletonFirst instance2 = SingletonFirst.getSingletonDemos();
		SingletonFirst instance3 = SingletonFirst.getSingletonDemos();
		
		
		System.out.println(instance1);
		System.out.println(instance2);
		System.out.println(instance3);
		
	}
}
