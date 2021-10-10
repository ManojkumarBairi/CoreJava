package Programs;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
   Random r=new Random();
  int random= r.nextInt(100);
  boolean aswon=false;
  System.out.println("You need to guess a number between 0 to 100 in 10 chances");
  System.out.println("Try to guess It");
  for(int i=10;i>0;i--)
  {
	  System.out.println("You have "+i+" chances left try again");
  int guess=s.nextInt();
  if(random>guess)
  {
	  System.out.println("Its greater than "+guess);
  }
  else if(random<guess)
  {
	  System.out.println("Its smaller than "+guess);
  }
  else if(random==guess)
  {
	  
	 // System.out.println("You;r guess is correct");
	  aswon=true;
	  break;
  }
  }
  if(aswon)
  {
	 System.out.println("COrrect YOU WIN"); 
  }
  else
  {
	  System.out.println("GAME OVER: The random number was "+random);
  }
	}

}
