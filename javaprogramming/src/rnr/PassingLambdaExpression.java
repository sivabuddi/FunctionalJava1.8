package rnr;


public class PassingLambdaExpression {

	interface Circle{
		void calculate(double r);
	}

	
	void areaOfCircle(double radius, Circle circle) {
		
		circle.calculate(radius);	
	}
	
	
	public static void main(String[] args) {
		
		Circle circle = (r) -> { System.out.println("Area of a cirlce = "+Math.PI * r *r);};
		circle.calculate(2);

		
		
	}
	
	
	
}
