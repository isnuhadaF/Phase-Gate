import java.util.*;


public class TaskFour {
	static Scanner input = new Scanner(System.in);
	
	public static void main() {
	
	int evenIndexSum = 0;
	
	System.out.println("Enter the scores below: ");
	int counter= 0;
	
	for(; counter < 10; counter++)
	  {
	    int score = input.nextInt();
	    if(counter != 0 && counter % 2 == 0)
	      {
	        evenIndexSum += score;
	      } else { }
	  }
	  
	System.out.println("The sum of even-index scores is: " + evenIndexSum);
	}
}
