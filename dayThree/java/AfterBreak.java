//After Break
//Write a function that takes a string and returns the count of case sensitive alphabetic characters and numeric digits that occurs more than once in the inputted string. The input string ca be assumed to contain any alphabet, both upper or lower case

public class AfterBreak {
  public static void main() {
   int characterCounterResult = characterCounter("a111BAcb");
  }
  
  public static int characterCounter(String string)
    {
    int characterCount = 0;
    char[] characters = string.toCharArray();
    int index = 0;
    for(; index < characters.length-1; index++)
      {
      if(characters[index] == '1' || characters[index] == '2' || characters[index] == '3' || characters[index] == '4' || characters[index] == '5' || characters[index] == '6' || characters[index] == '7' || characters[index] == '8' || characters[index] == '9')
        {
        characterCount++;
        } 
      }
      System.out.println(characterCount);
      
    return characterCount;
    }
}
