import java.util.*;


public class TaskSeven {
	static Scanner input = new Scanner(System.in);
	
	public static void main() {
	
	int evenScoreSum = 0;
	double evenScoreAverage = 0;
	int evenScoreCounter = 0;
	
	System.out.println("Enter the scores below: ");
	
	
	for(int counter= 0; counter < 10; counter++)
	  {
	    int score = input.nextInt();
	    if(score % 2 == 0)
	      {
	        evenScoreSum += score;
	        evenScoreCounter++;
	      } else { }
	  }
	  
	  evenScoreAverage = evenScoreSum/evenScoreCounter;
	System.out.println("The sum of even scores is: " + evenScoreSum);
	}
}
