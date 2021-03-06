package primenumberlister;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumberLister {

	static double numberOfPrimesInput;
	static ArrayList<Double> primesFound = new ArrayList<Double>();
	
	
	public static void main(String[] args) {
		
		System.out.println("How many primes would you like to generate? ");
		Scanner scan = new Scanner(System.in);
		
		
		
		numberOfPrimesInput = scan.nextFloat();
		float startTime = System.nanoTime();
		
		searchForPrimes(numberOfPrimesInput);//Search for primes

		float elapsedTime = System.nanoTime() - startTime;
		float elapsedTimeMili = elapsedTime/1000000;
		float elapsedTimeSec = elapsedTimeMili/1000;
		if (elapsedTimeSec > 0.1)
		{
			System.out.println("Calculation time: " + elapsedTimeSec + " seconds.");
		}
		else
		{
			System.out.println("Calculation time: " + elapsedTimeMili + " miliseconds.");
		}
		System.out.println("Primes found: " + primesFound);
		
		scan.close();
	}
	
	public static void searchForPrimes(double numberOfPrimes){
		
		double numOfPrimesFound = 0;
		double numOPFPercent = 0;
		double numberTested = 2;
		
		
		while (numOfPrimesFound < numberOfPrimes) //while the amount of primes found is less than the number of primes requested
		{		
			if(isPrime(numberTested))
			{
				primesFound.add(numberTested); //add number to list of primes
				
				numOfPrimesFound++;
				numOPFPercent++;
			}
			numberTested++; //moves to the next number
			
			if (numOPFPercent == 100){
				double percentage = (numOfPrimesFound/numberOfPrimesInput)*100;
				System.out.println("Percentage of calculations completed: " + percentage + "%.");
				numOPFPercent = 0;
			}
			
		}	
	}
	
	public static boolean isPrime(double numTested){ //checks to see if number is prime
		
		double divider = 1;		
		
		double factorCounter = 0;
			
		while (divider <= numTested)
		{

			if (numTested%divider == 0){
				factorCounter++;
			}
			divider++;
		}
		
		
		if (factorCounter < 3) //if the number is prime
		{
			divider = 1; //reset divider
			factorCounter = 0;
			return true;
		}
		else{ //if the number isn't prime
			divider = 1; //reset divider
			factorCounter = 0;
			return false;
		}
		
	}

}
