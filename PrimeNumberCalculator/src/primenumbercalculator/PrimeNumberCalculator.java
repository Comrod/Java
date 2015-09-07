package primenumbercalculator;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumberCalculator {

	public static void main(String[] args) {
		
		
		float divider = 0;
		float counter = 0;
		float counterForDividers = 0;
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number, and I will determine if it is prime (maximum 10 digits). ");
		String input = scan.nextLine();
		
		float startTime = System.nanoTime();
		
		
		float inputFloat = Float.parseFloat(input);
		
		ArrayList<Float> divisibleBy = new ArrayList<Float>();
		while (divider <= inputFloat)
		{
			
			if(inputFloat%divider == 0){ //checks to see if the answer is a whole number
				divisibleBy.add(divider);
				counter++;
				divider++;
			}
			else{
				divider++;
			}
			
			//System.out.println("Numbers checked: " + divider);
			counterForDividers++;
			
			if (counterForDividers == 1000000){
				float percentage = (divider/inputFloat)*100;
				System.out.println("Percentage of calculations completed: " + percentage + "%.");
				counterForDividers = 0;
			}
		}	
		float elapsedTime = System.nanoTime() - startTime;
		float elapsedTimeMili = elapsedTime/1000000;
		System.out.println("Calculation time: " + elapsedTimeMili + " miliseconds.");
		
		if (counter > 2)
		{
			System.out.print("The number " + inputFloat + " is not prime. ");
		}
		else
		{
			System.out.print("The number " + inputFloat + " is prime. ");
		}
		
		System.out.print("The factors of " + inputFloat + ": " + divisibleBy);
		
		
		
		scan.close();
	}

}
