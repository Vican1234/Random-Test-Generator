import java.util.Random;



//Author 			: Cillían Vickers
//Date 			    : April-2023
//Purpose 			: Will generate the random values for testing
public class randomTest {
	
	Random randTest = new Random();	

	// variables holds for tests
		int intTest;
		float floatTest;
		long longTest;
		double doubleTest;

	public int createIntTest()
	{
		// to set the max value for the random number
		int maxInt = 9999;
		
		// generating a random number
		intTest = randTest.nextInt(maxInt);
		
		// returns the value
		return intTest;
	}
	
	public float createFloatTest()
	{
		// to set the max value for the random number
		float maxFloat = 9999.99f;
		
		// generating a random number
		floatTest = randTest.nextFloat(maxFloat);
		
		// returns the value
		return floatTest;
	}
	
	public long createLongTest()
	{
		// to set the max value for the random number
		long maxLong = 9999;
		
		// generating a random number
		longTest = randTest.nextLong(maxLong);
		
		// returns the value
		return longTest;
	}
	
	public double createDoubleTest()
	{
		// to set the max value for the random number
		double maxDouble = 9999.99;
		
		// generating a random number
		doubleTest = randTest.nextDouble(maxDouble);
		
		// returns the value
		return doubleTest;
		
	}
	
	public char createCharTest()
	{
		char charTest;
		// creates a random value
		int randomChar = randTest.nextInt(52);
		charTest = (randomChar < 26) ? 'A' : 'a';

		return (char) (charTest + randomChar % 26);
	}

	public String createStringTest()
	{
		String wordBuildChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		// sets limit to amount of characters in string
		int maxStringTests = 10;
		// creates a base and builds a string from the characters provided
		StringBuilder randomString = new StringBuilder(maxStringTests);

		for(int counter = 0; counter < maxStringTests; counter++){
			randomString.append(wordBuildChars.charAt(randTest.nextInt(wordBuildChars.length())));
		}

		return randomString.toString();
	}

}
