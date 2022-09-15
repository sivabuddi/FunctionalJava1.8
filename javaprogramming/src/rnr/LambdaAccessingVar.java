package rnr;

public class LambdaAccessingVar {
	
	int x = 20;
	
	public void method() {
		
		int x =10;
		
		Runnable runnable = () -> {System.out.println("Local variable ="+x);
								   System.out.println("Member variable="+this.x);};
								   
		
		Thread t = new Thread(runnable);
		t.start();
	}
	

	public static void main(String[] args) {
		 LambdaAccessingVar lamdba = new LambdaAccessingVar();
		 lamdba.method();
	}

}
