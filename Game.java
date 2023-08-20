
import java.util.Random;
import java.util.Scanner;

 class Guess 
{
      int c;
      public Guess()
      {
    	  Random r = new Random();
    	  c =r.nextInt(100);
    	  System.out.println("guess the number from 1 to 100");
    	  
      }
      public int compNo()
      {
    	  return c;
	  }
}
      public class Game
      {
    	  static int takeUserInput()
    	  {
    		  int user;
    		  System.out.println("Enter ");
    		  Scanner sc=new Scanner (System.in);
    		  user = sc.nextInt();
    		  return user;
    	  }
    	  static void isCorrectNumber(int i,int j)
    	  {
    		  if(i==j)
    		  {
    			  System.out.println("Correct Number Guess");
    		  }
    		  else if(i>j)
    		  {
    			  System.out.println("Your Number is Bigger than Computer Guess");
    		  }
    		  else
    		  {
    			  System.out.println("Your Number is lesser than Computer Guess");
    		  }
    	  }
    	  public static void main(String [] args)
    	  {
    		  int user=0;
    		  int computer=0;
    		  int iteration=0;
    		  Guess g = new Guess();
    		  do
    		  {
    			  user = takeUserInput();
    			  computer = g.compNo();
    	 //System.out.println(user);
    	//System.out.println(computer);
    			  isCorrectNumber(user,computer);
    			  iteration++;
    		  }while(user!=computer);
    		  System.out.println("YOU GUESS NO IN "+ iteration+ "ITERATIONS");
    		  }
		}
	
   
      

