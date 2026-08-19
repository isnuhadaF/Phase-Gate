
public class DayThree {
	public static void main(){
		//Question 1
		String stringReversalResult = stringReversal("Abraham");
		//Question 2
		int integerReversalResult = integerReversal(265);
		//Question 3
		//Question 4
		//Question 5
		int positionOfFirstVowelInAStringResult = positionOfFirstVowelInAString("Oludotun");
		//Question 6
		//Question 7
		double averageOfNumbersResult = averageOfNumbers();
		//Question 8
		int divisorPrinterResult = divisorPrinter(145);
		//Question 9
		int divisorCounterResult = divisorCounter(200);
	}
	
	//Question 1: Reverse a given string using a for loop.
	public static String stringReversal(String string)
		{
		for(int i = randomWord.length()-1; i >= 0; i--)
			{
			System.out.print(string.charAt(i) + " ");
			}
		
		return string;
		}
  
  //Question 2: Print the reverse of an integer number.
  public static int integerReversal(int number)
    {
    int reversed = 0;
    int tempHolder = 0;
    while(number > 0)
      {
      tempHolder = number % 10;
      reversed = tempHolder * 10 + tempHolder;
      number = number / 10;
      }
      System.out.println(reversed);
      
    return reversed;
    }
    
  //Question 3: Count how many uppercase letters are in a string.
  //Question 4: Count how many lowercase letters are in a string.
  
  //Question 5: Find the position of the first vowel in a string.
  public static int positionOfFirstVowelInAString(String randomString) 
    {
    char vowel = ' ';
    int i = 0;
    for(; i < randomString.length(); i++)
      {
      if(randomString.charAt(i) == 'a' || randomString.charAt(i) == 'e' || randomString.charAt(i) == 'i' || randomString.charAt(i) == 'o' || randomString.charAt(i) == 'u' || randomString.charAt(i) == 'A' || randomString.charAt(i) == 'E' || randomString.charAt(i) == 'I' || randomString.charAt(i) == 'O' || randomString.charAt(i) == 'U')
        {
        vowel = randomString.charAt(i);
        System.out.println("The first vowel in your string is: " + vowel + " and its position is " + i);
        
        break;
        }
      }
    
    return i;
    }
  
  //Question 6: Print each character of a string with its ASCII value.
  //Question 7: Find the average of numbers from 1-10.
  public static double averageOfNumbers()
    {
    int sum = 0;
    int count = 1;
    for(; count <= 10; count++)
      {
      sum += count;
      }
      double average = sum/count;
      System.out.println(average);
    
    return average;
    }
  
  //Question 8: Print the divisors of a given number.
  public static int divisorPrinter(int number)
    {
    for(int i = 1; i < number; i++)
      {
      if(number % i == 0)
        {
        System.out.println(i + " is a divisor of " + number);
        }
      }
      
    return number;
    }
  
  //Question 9: Count the number of divisors of a given number.
  public static int divisorCounter(int number)
    {
    int divisorCount = 0;
    int i = 1;
    for(; i < number; i++)
      {
      if(number % i == 0)
        {
        divisorCount ++;
        }
      }
      System.out.println(number + " has " + divisorCount + " divisors." );
      
    return divisorCount;
    }
}
