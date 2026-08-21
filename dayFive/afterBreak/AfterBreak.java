//After Break
import java.util.*;


public class AfterBreak {
  public static void main() {
  //Question 1
  int sumOfDigitsCaller = sumOfDigits(38);
  //Question 2
  int[] numbers = {2,2,1};
  int leastOccuringElementCaller = leastOccuringElement(numbers);
  //Question 3
  String[] words = {"flower","flow","flight"};
  }
  
  //Question 1
  public static int sumOfDigits(int number) 
  {
    while(number > 10)
      {
        if(number > 10)
          {
        number = (number % 10) + (number / 10);
          }
      }
      System.out.println(number);
    
  return number;
  }
  
  //Question 2
  public static int leastOccuringElement(int[] numbers)
  {
    int index = 0;
    for(; index < numbers.length - 1; index++)
      {
        if(numbers[index] == numbers[index+1])
          {
            
          } else 
            {
              System.out.println(numbers[index]);
            }
      }
  
  return numbers[index];
  }
  
  //Question 3
  public static String longestCommonPrefix(String[] words) 
  {
    String randomHolder = " ";
    for(String word : words)
      {
        for(int index = 0; index < word.length(); index++)
          {

          
          }
      }
  
  
  return randomHolder;
  }
}
