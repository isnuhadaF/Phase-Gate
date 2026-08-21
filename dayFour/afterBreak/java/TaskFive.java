import java.util.*;


public class TaskFive {
	static Scanner input = new Scanner(System.in);
	
	public static void main() {
	
	int evenScoreSum = 0;
	
	System.out.println("Enter the scores below: ");
	int counter= 0;
	
	for(; counter < 10; counter++)
	  {
	    int score = input.nextInt();
	    if(score % 2 == 0)
	      {
	        evenScoreSum += score;
	      } else { }
	  }
	  
	System.out.println("The sum of even scores is: " + evenScoreSum);
	}
}
