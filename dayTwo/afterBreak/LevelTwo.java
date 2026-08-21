
public class LevelTwo {
	
	
	public static int fireDrillOne(int fathersAge, int sonsAge)
	  {
    int yearCount = 0;
    for(; yearCount < 1000; yearCount++)
      {
      if(fathersAge / sonsAge != 2 && fathersAge % sonsAge != 0)
        {      
      fathersAge++;
      sonsAge++;
        } else 
          {
          System.out.println(yearCount);
          break;
          }
      }
      System.out.println(yearCount);
	  return yearCount;
	  }
	
	public static char fireDrillTwo(int score1, int score2, int score3)
	  {
	  int average = (score1 + score2 + score3)/3;
	  char grade = 'X';
	  if(average <= 100 && average >= 90)
	    {
	    grade = 'A';
	    System.out.println(grade);
	    } else if(average < 90 && average >= 80)
	        {
	        grade = 'B';
	        System.out.println(grade);
	        } else if(average < 80 && average >= 70)
	            {
	            grade = 'C';
	            System.out.println(grade);
	            } else if(average < 70 && average >= 60)
	              {
	              grade = 'D';
	              System.out.println(grade);
	              } else if(average < 60 && average >= 0)
	                {
	                grade = 'F';
	                System.out.println(grade);
	                }
	  return grade;
	  }
	
	public static String[] fireDrillThree(String[] names)
	  {
	  int likes = 0;
	  int i = 0;
	  for(; i < names.length ; i++)
	    {
	    likes += 1;
	    System.out.println(names[i] + " liked this post");
	    }
	    
	  return names;
	  }
	public static void main() {	
	  //Question 1
	  int fireDrillOneResult = fireDrillOne(15, 40);
	  //Question 2
	  char fireDrillTwoResult = fireDrillTwo(90, 80, 65);
	  //Question 3
	  String[] names = {"Ahlaja", "WinnieFred", "BlackestRose"};
	  String[] fireDrillThreeResult = fireDrillThree(names);
	}
}
