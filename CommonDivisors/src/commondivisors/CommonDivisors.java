package commondivisors;

import java.util.*;

public class CommonDivisors {
	public static void main (String args[]){
	    Scanner scanner = new Scanner(System.in);

	    System.out.print("Enter the 1st number :  ");
	    int num1 = scanner.nextInt();
	    System.out.print("Enter the 2nd number : ");
	    int num2 = scanner.nextInt();

	    List<Integer> commonDivisor = getCommonDivisor(num1, num2);
	    System.out.println(commonDivisor);
	    
	    scanner.close();
	}

	public static List<Integer> getCommonDivisor(int num1, int num2) {

	    List<Integer> list = new ArrayList<Integer>();

	    int min = minimum(num1, num2);

	    for(int i = 1; i <= min / 2; i++) { 
	        if (num1 % i == 0 && num2 % i == 0) {
	            list.add(i);
	        }
	    }

	    if (num1 % min == 0 && num2 % min == 0) {
	        list.add(min);
	    }

	    return list;
	}

	public static int minimum(int num1, int num2) {
	    return num1 <= num2 ? num1 : num2;
	}
}
