import java.util.*;


public class TaskThree {
	static Scanner input = new Scanner(System.in);
	
	public static void main() {
	
	int sum = 0;
	double averageScore = 0;
	
	System.out.println("Enter the scores below: ");
	int counter= 0;
	
	for(; counter < 10; counter++)
	  {
	    int score = input.nextInt();
	    sum += score;
	  }
	  
	  averageScore = sum/counter;
	System.out.println("The sum of scores is: " + sum);
	System.out.println("Average score is: " + averageScore);
	}
}
