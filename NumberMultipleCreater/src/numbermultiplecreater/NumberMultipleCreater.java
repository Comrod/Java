package numbermultiplecreater;

import java.util.ArrayList;
import java.util.Scanner;

public class NumberMultipleCreater {

	static ArrayList<Integer> multiplesFound = new ArrayList<Integer>();
	static int baseMultiple;
	public static void main(String[] args) {
		
		
		int numberOfMultiples;
		
		System.out.println("What number would you like to generate multiples of? ");
		Scanner scan1 = new Scanner(System.in);
		baseMultiple = scan1.nextInt();
		
		System.out.println("How many multiples would you like to generate?");
		numberOfMultiples = scan1.nextInt();
		
		findMultiples(baseMultiple, numberOfMultiples);
	
		scan1.close();
	}
	
	public static void findMultiples(int multiple, int numOfMult)
	{
		int counter = 1;
		while (counter<=numOfMult)
		{
			multiple = baseMultiple*counter;
			multiplesFound.add(multiple);
			counter++;
		}
		
		System.out.println("Multiples: " + multiplesFound);
		
	}
	
}
