import java.util.*;


public class TaskOne {
	static Scanner input = new Scanner(System.in);
	
	public static void main() {
	
	int sum = 0;
	System.out.println("Enter the scores below: ");
	
	for(int counter= 1; counter <= 10; counter++)
	  {
	    int score = input.nextInt();
	    sum += score;
	  }
	System.out.println("Sum-total of the scores you input is: " + sum);
	}
}
