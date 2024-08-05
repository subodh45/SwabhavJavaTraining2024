package comps.Aurionpro.Homework;
import java.util.*;

public class GuessWordGame {
  public static void main(String[] args) {
	
	 String Words[] ={"Subodh", "Rahul" ,"Rohit", "Cricket"};
	 Scanner sc = new Scanner(System.in);
	 
	 String word ="orange";
	 
	 System.out.println("Welcome to Word Guessing Game :");
	
	 int life =word.length();
	 
	 StringBuffer Guess = new StringBuffer("------");
	 StringBuffer Guess2 = new StringBuffer("------");
	 
	 System.out.println(Guess);
	  
	
	 while(life>=1)
	 {  while(!Guess.equals("orange") && life>0) {
		 if(Guess.equals("orange"))
		 {
		   System.out.println("Yes ! u guess orange correctly");
		   System.out.println(Guess);
		   break;
		 }
		 else
		 { System.out.println("Guess Any letter of Word :"+ "Life remaining is "+ life );
		   char letter = sc.next().charAt(0);
		   if(letter == 'a')
		   {Guess.replace(2,3,"a");
		    Guess2.replace(2,3,"a");
		    System.out.println("Yes ! u guess a correctly");
		    System.out.println(Guess);
		    continue;
		   }else  if(letter == 'o')
		    {Guess.replace(0,1,"o");
		     Guess2.replace(0,1,"o");
		     System.out.println("Yes ! u guess o correctly");
		     System.out.println(Guess);
		     continue;
		    }else  if(letter == 'r')
		     {Guess.replace(1,2,"r");
		     Guess2.replace(1,2,"r");
		     System.out.println("Yes ! u guess r correctly");
		     System.out.println(Guess);
		     continue;
		    }else  if(letter == 'n')
		     {Guess.replace(3,4,"n");
		     Guess2.replace(3,4,"n");
		     System.out.println("Yes ! u guess n correctly");
		     System.out.println(Guess);
		     continue;
		    }else  if(letter == 'g')
		     {Guess.replace(4,5,"g");
		      Guess2.replace(4,5,"g");
		      System.out.println("Yes ! u guess g correctly");
		      System.out.println(Guess);
		      continue;
		    }else  if(letter == 'e')
		     {Guess.replace(5,6,"e");
		      Guess2.replace(5,6,"e");
		     System.out.println("Yes ! u guess e correctly");
		     System.out.println(Guess);
		     continue;
		    }else 
		     {
			  System.out.println("Wrong Guess ! You lose one life.");
			  System.out.println(Guess);
			 
			  life--;
			  continue;
		 }
		   
		 }
	 }		
	 }
	 
	 System.out.println("Failed to Guess word ! ");
	 
	 	 
}
}
