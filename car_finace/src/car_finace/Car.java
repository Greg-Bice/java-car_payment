package car_finace;

public class Car {
	
	double totalPrice;
	double loanInterest;
	
	int loanLength;
	
	public Car ( double cp, double li, double ll ) {
		
		totalPrice = cp;
		loanInterest = li / 100;
		loanLength = (int) ll;
		
		System.out.println( String.format( "Created a new instance of Car %.2f, %.2f, %d", this.totalPrice, this.loanInterest, this.loanLength ) );
		
	}
	
	public double CarPayment() { 
		
		double payment = ( this.loanInterest / 12 ) * this.totalPrice;
		payment = payment / ( 1 - Math.pow( ( 1 + ( this.loanInterest / 12 ) ), -this.loanLength ) );
		
	
		return payment;
		
	}
	
	public double InterestPayment() {
		
		return 0.0;
		
	}
	
	public void PrintFinances() {
		
		System.out.printf( "Numbers should be ~%d, %d, %d", 743.65, 291.68, 9618.79 );
		System.out.println( String.format( "The total payment on your car is %.2f", this.CarPayment() ) );
		System.out.println( String.format( "The total interest payment on your car is %.2f", this.InterestPayment() ));
		
	}

}
