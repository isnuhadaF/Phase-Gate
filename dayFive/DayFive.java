//PhaseGate Day 5
import java.lang.Math;

public class DayFive {
  public static void main() {
    //Question 1
    int sumOfwoNumbersCaller = sumOfwoNumbers(10,20);
    //Question 2
    boolean evenCheckerCaller = evenChecker(17);
    //Question 3
    int squareOfNumberCaller = squareOfNumber(5);
    //Question 4
    double celsiusConverterCaller = celsiusConverter(17);
    //Question 5
    boolean primeCheckerCaller = primeChecker(20);
    //Question 6
    int largestOfThreeNumbersCaller = largestOfThreeNumbers(44,12,64);
    //Question 7
    double simpleInterestCaller = simpleInterest(50000, 3.75, 2.5);
    //Question 8
    double areaOfRectangleCaller = areaOfRectangle(10, 8);
    //Question 9
    int reverseOfNumberCaller = reverseOfNumber(132);
    //Question 10
    
  }
  //Question 1
  public static int sumOfwoNumbers(int number1, int number2) 
  {
    int sum = 0;
    sum = number1 + number2;
    System.out.println(number1 + " + " + number2 + " = " + sum);
  
  return sum;
  }
  
  //Question 2
  public static boolean evenChecker(int number) 
  {
    boolean isEven = false;
    if(number % 2 == 0)
      {
        isEven = true;
        System.out.println(number + " is an even number");
      } else { System.out.println(number + " is not an even number");}
  
  return isEven;
  }
  
  //Question 3 
  public static int squareOfNumber(int number)
    {
    int square = number * number;
    
  return square;
  }
  
  //Question 4
  public static double celsiusConverter(double celsius)
  {
    double fahrenheit = celsius * (9/5) + 32;
    System.out.println(celsius + " degrees celsius is equivalent to " + fahrenheit + " degrees Fahrenheit.");
    
  return fahrenheit;
  }
  
  //Question 5
  public static boolean primeChecker(int number)
  {
    boolean isPrime = false;
    
    for(int counter = 2; counter < 10; counter++)
      {
        if(number % counter > 0)
          {
            isPrime = true;
            
          }
      }
      System.out.println(number + " is a prime number.");
  
  return isPrime;
  }
  
  //Question 6
  public static int largestOfThreeNumbers(int number1, int number2, int number3)
  {
    int largest = 0;
    if(number1 > number2 && number1 > number3)
      {
        largest = number1;
      } else if(number2 > number1 && number2 > number3)
        {
          largest = number2;
        } else if(number3 > number1 && number3 > number2)
          {
            largest = number3;
          }
          
          System.out.println(largest + " is the largest number");
          
    return largest;
  }
  
  //Question 7
  public static double simpleInterest(double principal, double rate, double time)
  {
    double simple_interest = (principal * rate * time)/100;
    System.out.println("Simple interest = " + simple_interest);
  
  return simple_interest;
  }
  
  
  //Question 8
  public static double areaOfRectangle(int length, int width)
  {
    int area = length * width;
    System.out.println("Area of the rectangle = " + area);
    
  return area;
  }
  
  //Question 9
  public static int reverseOfNumber(int number)
  {
    String converter = String.valueOf(number);
    int reversed = 0;
    double multiplier = Math.pow(10, converter.length());
        
      for(int index = 0; index < converter.length(); index++)
        {
          reversed += (number % 10) * multiplier;
          multiplier /= 10;
          number = number / 10;
        }
        System.out.println(reversed);
        
  return reversed;
  }
  
  //Question 10
  public static int characterCounter(String word)
  {
    int count = 0;
    for(int index = 0; index < word.length()-1; index++)
      {
      
      }
      
  return count;
  }
}
