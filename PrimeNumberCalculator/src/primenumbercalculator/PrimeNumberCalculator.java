package primenumbercalculator;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumberCalculator {

	public static void main(String[] args) {
		
		
		double divider = 0;
		double counter = 0;
		double counterForDividers = 0;
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number, and I will determine if it is prime (maximum 10 digits). ");
		double input = scan.nextDouble();
		
		float startTime = System.nanoTime();
		
		
		double inputDub = input;
		
		ArrayList<Double> divisibleBy = new ArrayList<Double>();
		while (divider <= inputDub)
		{
			
			if(inputDub%divider == 0){ //checks to see if the answer is a whole number
				divisibleBy.add(divider);
				counter++;
				divider++;
			}
			else{
				divider++;
			}

			counterForDividers++;
			
			if (counterForDividers == 1000000){
				double percentage = (divider/inputDub)*100;
				System.out.println("Percentage of calculations completed: " + percentage + "%.");
				counterForDividers = 0;
			}
		}	
		float elapsedTime = System.nanoTime() - startTime;
		float elapsedTimeMili = elapsedTime/1000000;
		System.out.println("Calculation time: " + elapsedTimeMili + " miliseconds.");
		
		if (counter > 2)
		{
			System.out.print("The number " + inputDub + " is not prime. ");
		}
		else
		{
			System.out.print("The number " + inputDub + " is prime. ");
		}
		
		System.out.print("The factors of " + inputDub + ": " + divisibleBy);
		
		
		
		scan.close();
	}

}
