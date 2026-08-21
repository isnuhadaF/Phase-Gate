
public class PhaseGate {
	public static void main(String[] args) {
    //Question 1
    String Question1Result = Question1("Hello", "World");
    //Question 2
		int Question2Result = Question2();
		//Question 3
		int Question3Result = Question3();
		//Question 4
		int Question4Result = Question4();
		//Question 5 
		String Question5Result = Question5();
		//Question 6
		int Qusetion6Result = Question6();
		}
		
	//Question 1
	public static String Question1(String text_1, String text_2)
	  {
	  String combinedText = text_1 + text_2;
	  System.out.println(combinedText);
	  
	  return combinedText;
	  }
	//Question 2
	public static int Question2() 
	  {
	  //given
	  int number1 = 98;
	  int number2 = 102;
	  int number3 = 42;
	  int median = 0;
	  int mean = (number1+number2+number3)/3;
    if(number2 > number1 && number2 < number3 || (number2 < number1 && number2 > number3))
      {
      median = number2;
      } else if(number1 > number2 && number1 < number3 || (number1 < number2 && number1 > number3))
        {
        median = number1;
        } else if(number3 > number1 && number3 < number2 || (number3 < number1 && number3 > number2))
          {
          median = number3;
          }
        
        System.out.println("Median = " + median);
        System.out.println("Mean = " + mean);
      return median;
	  }
	//Question 3
	public static int Question3()
	  {
	  int i = 1;
	  for(; i < 100; i++)
	    {
	    if(i > 10)
	      {
	      if(((i / 10) + (i % 10)) % 3 == 0)
	        {
	        System.out.println("Skip");
	        } else {System.out.println(i);}
	      } else {System.out.println(i);}
	      
	    }
	  
	  return i;
	  }
	//Question 4
	public static int Question4()
	  {
	  int i = 1;
	  String reversed = "";
	  for(; i < 100; i++)
	    {
	      if(i % 3 == 0)
	        {
	        System.out.println("hello");
	        } else if(i % 5 == 0)
	          {
	          System.out.println("world");
	          } else if(i % 7 == 0) 
	              {
	              System.out.println("orion");
	              } else 
	                {
	                if(i > 10)
	                  {
	                  reversed += i % 10;
	                  System.out.println(i);
	                  }
	                System.out.println(i);
	                }      
	    }
	  
	  return i;
	  }
	  //Question 5
	  public static String Question5()
	    {
	    //Given
	    String number = "1122333145";
	    int runLength = 0;
	    for(int i = 0; i < number.length(); i++)
	      {
	      if(Character.getNumericValue(i) % 10 > 0)
	        {
	        System.out.println(number.charAt(i));
	        }
	      }
	    return number;
	    }
	    
	  //Question 6
	  public static int Question6() 
	    {
	    //Given
	    int palindromePrime = 1551;
	    int tempHolder = 0;
	    int divisor = 1000;
	    //Check if a palindrome
	    for(int i = 0; i < 4; i++)
	      {
	      if(palindromePrime % 10 > 0)
	        {
	        palindromePrime = palindromePrime / 10;
	        tempHolder += (palindromePrime % 10) * divisor;
	        divisor /= 10;
	        }
	      if(palindromePrime == tempHolder)
	        {
	        System.out.println(palindromePrime + " is a palindrome");
	        }

	      }
	      System.out.println();
	      

	    return palindromePrime;
	    }
	
}
