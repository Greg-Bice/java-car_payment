package car_finace;
import java.util.Scanner;

public class Finance {
	
	static Scanner input = new Scanner( System.in );
	
	public static void main( String[] args ) {
		
		System.out.println( "This prorgram will calculate the total Car and Interest payment for your car." );
		
		double cp = QueryAssign( "What is the total price of the car?");
		double li = QueryAssign( "What is the annual percentage of the loan?" );
		double ll = QueryAssign( "How long, in months, is your loan?" );
		
		Car newCar = new Car( cp, li, ll );
		newCar.PrintFinances();
		
	}
	
	private static double QueryAssign( String query ) {
			
		System.out.println( query );
		
		while( !input.hasNextDouble() ) {
			System.out.println( "Invalid response; try again." );
			input.next();
		}
		
		return input.nextDouble();
			
	}

}
