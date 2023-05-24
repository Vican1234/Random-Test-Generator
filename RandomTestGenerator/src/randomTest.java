package src;
import java.net.URL;
import java.util.Random;

import java.lang.reflect.*;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

import java.net.URLClassLoader;

import java.io.IOException;

//Author 			: Cillían Vickers
//Date 			    : April-2023
//Purpose 			: Will generate the random values for testing
public class randomTest {
	
	Random randTest = new Random();	

	// variables holds for tests
		int intTest;
		float floatTest;
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
		floatTest = randTest.nextFloat();
		floatTest = floatTest*maxFloat;
		// returns the value
		return floatTest;
	}
	
	public long createLongTest()
	{
		return Long.valueOf(createIntTest());
	}
	
	public double createDoubleTest()
	{
		// to set the max value for the random number
		double maxDouble = 9999.99;
		
		// generating a random number
		doubleTest = randTest.nextDouble();
		doubleTest = doubleTest*maxDouble;
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

	public static void StringTestMethod(Object classIn, String methodIn){
		try {
			Class<?> testingClass = classIn.getClass();
			Method testingMethod = testingClass.getDeclaredMethod(methodIn);
			testingMethod.setAccessible(true);
			testingMethod.invoke(classIn);
		}
		catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e){
			e.printStackTrace();
		}
	}

	public static void TestMethod(String fileLocation){

		URLClassLoader testFile = URLClassLoader.newInstance(new URL[]{fileLocation.toURI().toURL()});
	}
	public static void fileOpener(String fileLocation)
	{
		String codeTest = fileLocation;
		try{
			ProcessBuilder fileBuild = new ProcessBuilder("java", "-jar", codeTest);
			Process process = fileBuild.start();
			process.waitFor();
		}
		catch(IOException | InterruptedException e){
			e.printStackTrace();
		}
	}

}
