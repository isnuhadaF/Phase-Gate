import java.util.*;


public class TaskTen {
	static Scanner input = new Scanner(System.in);
	
	public static void main() {
	
	int validSum = 0;
	int validAverage = 0;
	
	System.out.println("Enter the scores below: ");
	
	int counter= 0;
	for(; counter < 10; counter++)
	  {
	    int score = input.nextInt();
	    if(score >= 0 && score <= 100)
	      {
	        validSum += score;
	      } else { System.out.println("Invalid score");}
	  }
	  
	  validAverage = validSum/counter;
	System.out.println("The average of even scores is: " + validAverage);
	}
}
