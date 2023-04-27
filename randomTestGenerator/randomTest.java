package randomTestGenerator;
import java.util.Random;



//Author 			: Cillían Vickers
//Date 			    : April-2023
//Purpose 			: Will generate the random values for testing
public class randomTest {
	
	
	public static void main(String Args[]) {
		// variables holds for tests
		int intTest;
		float floatTest;
		long longTest;
		double doubleTest;
		char[] charTests = new char[5];
		String[] stringTests = new String[5];
		int wordPosition;
		
		// Array Values
		charTests[0] = 'a';
		charTests[1] = 'b';
		charTests[2] = 'c';
		charTests[3] = 'd';
		charTests[4] = 'e';
		
		stringTests[0] = "Apple";
		stringTests[1] = "Orange";
		stringTests[2] = "Pear";
		stringTests[3] = "Bannana";
		stringTests[4] = "Kiwi";
		
		// upper limits to variables
		int maxInt = 9999;
		float maxFloat = 9999.99f;
		long maxLong = 9999;
		double maxDouble = 9999.99;
		int wordTests = 5;
		
		// main body
		Random randTest = new Random();		
		intTest = randTest.nextInt(maxInt);
		floatTest = randTest.nextFloat(maxFloat);
		longTest = randTest.nextLong(maxLong);
		doubleTest = randTest.nextDouble(maxDouble);
		wordPosition = randTest.nextInt(wordTests);
		
		// temporary output for self testing purposes
		System.out.println("Test int: " + intTest);
		System.out.println("Test float: " + floatTest);
		System.out.println("Test long: " + longTest);
		System.out.println("Test double: " + doubleTest);
		System.out.println("Test char: " + charTests[wordPosition]);
		System.out.println("Test string: " + stringTests[wordPosition]);
	}

}
