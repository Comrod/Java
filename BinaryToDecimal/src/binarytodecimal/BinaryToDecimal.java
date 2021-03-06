package binarytodecimal;

import java.util.Scanner;

public class BinaryToDecimal{
	
	public static void main(String args[]){
	
	int inputLCount = 0;
	int count = 0;
	int column = 0;
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter some binary: ");
	String input = scan.nextLine(); //Get the binary input
	
		//Loop that checks each digit of the string to see if it is a zero or a one and adds to the count as a result
		for (int i=1; i <= input.length(); i++){
			
			inputLCount = input.length() - i; //integer that allows if statement to evaluate part of what is inputed
			if(input.charAt(inputLCount) == '1'){
				count = (int) (count + Math.pow(2, column)); //adds the value of whatever column to the current count (e.g. count = count + 2^5)
				column++; //Moves the column along
			}
			else if (input.charAt(inputLCount) == '0'){
				//Nothing is done except moving the column along if a zero is found
				column++;
			}
		}
		
	scan.close(); //Closes the scanner so there is no resource leak
	System.out.println("Decimal Answer is: " + count);
	}	
}