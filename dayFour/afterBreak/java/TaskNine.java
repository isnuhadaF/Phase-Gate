import java.util.*;


public class TaskNine {
	static Scanner input = new Scanner(System.in);
	
	public static void main() {
	
	int validSum = 0;
	
	System.out.println("Enter the scores below: ");
	
	
	for(int counter= 0; counter < 10; counter++)
	  {
	    int score = input.nextInt();
	    if(score >= 0 && score <= 100)
	      {
	        validSum += score;
	      } else { System.out.println("Invalid score");}
	  }
	  
	System.out.println("The sum of valid scores is: " + validSum);
	}
}
