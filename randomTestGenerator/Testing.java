public class Testing {

	
	public static void main(String[] args) {
		int valOne = 5;
		int valTwo = 5;
		int total;
		
		exampleCalculator cal = new exampleCalculator();

		total = cal.additon(valOne,valTwo);

		// subtraction
		valOne = 10;
		valTwo = 3;

		total = cal.subtraction(valOne,valTwo);

		// division
		valOne = 60;
		valTwo = 3;

		total = cal.division(valOne,valTwo);

		// multiplication
		valOne = 7;
		valTwo = 4;

		total = cal.multiplication(valOne,valTwo);

	}


}
