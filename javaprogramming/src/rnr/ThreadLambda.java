package rnr;

public class ThreadLambda {

	public static void main(String[] args) {
		
		
		// Method 1
		Runnable runnable = () -> {System.out.println("Im in run method of Runnable Interface belongs to Method1");};
		Thread t = new Thread(runnable);
		t.start();
		
		// Method 2
		
		Thread thread2 = new Thread(() -> {System.out.println("Im in run method of Runnable Interface belongs to Method2");});
		thread2.start();
		
		
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Im in Runnable Inteface");
			}
		}).start();
 
	}

}
