package car_finace;

public class Car {
	
	// Defines attributes of the vehicle neede to caluclate interest and monthly payment
	double totalPrice;
	double loanInterest;
	double downPayment;
	
	int loanLength;
	
	public Car ( double cp, double dp, double li, double ll ) {
		
		this.totalPrice = cp; // Total price and down-payment/repayment are given values
		this.downPayment = dp;
		this.loanInterest = li / 100; // Percentage conversion
		this.loanLength = (int) ll; // Not looking at half months or days so casting to into will do maths too
		
	}
	
	public double CarPayment() { 
		
		double payment = ( this.loanInterest / 12 ) * this.totalPrice;
		payment = payment / ( 1 - Math.pow( ( 1 + ( this.loanInterest / 12 ) ), -this.loanLength ) );
	
		return payment;
		
	}
	
	public double InterestPayment() {
		
		
		double monthlyInterest = this.loanInterest / 12;
		double principle = this.totalPrice;
		double finalInterest = 0.00;
		
		for ( int i = 0; i < this.loanLength; i++  ) {
			
			double interestPaid = monthlyInterest * principle;
			
			finalInterest += monthlyInterest * principle;
			principle -= ( this.downPayment - interestPaid );
		}
		
		return finalInterest;
		
	}
	
	public void PrintFinances() {
		
		double ip = this.InterestPayment();
		double cp = this.CarPayment();
		
		System.out.printf( "Numbers should be ~ %.2f, %.2f, %.2f\n", 743.65, 291.68, 9618.79 );
		System.out.println( String.format( "The monthly payment on your car is $%.2f.", cp ) );
		System.out.println( String.format( "Over the course of %d months, you will have paid $%.2f in interest.", this.loanLength, ip ) );

	}

}
