import java.util.*;


public class TaskEight {
	static Scanner input = new Scanner(System.in);
	
	public static void main() {
	
	int sum = 0;
	
	System.out.println("Enter the scores below: ");
	
	
	for(int counter= 0; counter < 10; counter++)
	  {
	    int score = input.nextInt();
	    if(score >= 0 && score <= 100)
	      {
	        sum += score;
	      } else { System.out.println("Invalid score");}
	  }
	  
	  evenScoreAverage = evenScoreSum/evenScoreCounter;
	System.out.println("The sum of scores is: " + sum);
	}
}
