package car_finace;

public class Car {
	
	double price;
	double downPayment;
	
	double loanInterest;
	int loanLength;
	
	public Car ( double cp, double dp, double li, double ll ) {
		
		price = cp;
		downPayment = dp;
		loanInterest = li / 100;
		loanLength = (int) ll;
		
		System.out.println( String.format( "Created a new instance of Car %f, %f, %f, %f", this.price, this.downPayment, this.loanInterest, this.loanLength ) );
		
	}
	
	public double CarPayment() { 
		return 0.0;
	}
	
	public double InterestPayment() {
		
		return 0.00;
	}
	
	public void PrintFinances() {
	
		System.out.println( String.format( "The total payment on your car is %.4f", this.CarPayment() ) );
		System.out.println( String.format( "The total interest payment on your car is %.4f", this.InterestPayment() ));
		
	}

}
