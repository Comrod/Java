package tenniswinprobability;

import java.util.Scanner;

public class TennisWinProbability {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		
		//Win Likelihood
		System.out.println("Enter number of forced errors: ");
		float forcedErrors = scan.nextFloat();
		
		System.out.println("Enter number of winners: ");
		float winners = scan.nextFloat();
		
		System.out.println("Enter number of unforced errors: ");
		float unforcedErrors = scan.nextFloat();
		
		float winLikelihood = (winners + forcedErrors)/unforcedErrors;
		
		//Win Probability
		System.out.println("Enter number of points won: ");
		float pointsWon = scan.nextFloat();
		
		System.out.println("Enter total number of points: ");
		float totalPoints = scan.nextFloat();
		
		float winningProbability = pointsWon/totalPoints;
		float winningPercentage = winningProbability*100;
		
		System.out.println("Likelihood of winning: " + winLikelihood);
		System.out.println("Probability of winning: " + winningPercentage + "%");
		
		
		scan.close();
	}

}
