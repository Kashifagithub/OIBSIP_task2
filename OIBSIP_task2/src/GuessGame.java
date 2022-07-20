import java.util.*;
import java.lang.*;
public class GuessGame 
{
           public static void game()
    {
          Scanner sc=new Scanner(System.in);
          Random r = new Random();
          int correct_guess= r.nextInt(100)+1;
            
            System.out.println("***WELCOME TO NUMBER GUESSING GAME***");
            System.out.println("Rules of game :- ");
            System.out.println("1.You're gonna have 10 chances to guess the number...That number ranges between 1 and 100\n2.You are allowed to enter the number between 1 and 100 only\n3.If you enter the number less than 1 or greater than 100 you will be exited from game");
            System.out.println("So let's start the game....");
            System.out.println("Total no of chances : 10");
            System.out.println("You are left with 10 chances");
            
           
            int no_of_turns=1;
           
            int guess,value=0;
            boolean choice=false;
            while(choice==false)
            {
                    System.out.print("Choose any number between 1 and 100 : ");
                    guess=sc.nextInt();
                    
               if(no_of_turns<10)
               {
                    if(guess==correct_guess)
                        {
                            System.out.println("Congratulations....You won!!!!!");
                            System.out.println("Generated random number matches with your guess..The number is : "+correct_guess);
                            System.out.println("You have had "+no_of_turns+" to guess the number");
                            System.out.println("Final score : "+((10-no_of_turns)*10)+" out of total score 100");
                            choice=true;
                        }
           
                    else if (guess<correct_guess )       
                        {
                            if(guess<1)
                            {
                                System.out.println("Invalid!!!...Please choose number between 1 and 100 only");
                                return;
                            }
                            else
                            {
                            value=value+1;
                            System.out.println("Hey..your guess is lower than the generated random number ");
                            System.out.println("You are left with "+(10-value)+" turns");
                            }
                        }
                    else if (guess>correct_guess)
                        {
                            if(guess>100)
                            {
                                System.out.println("Invalid!!!...Please choose number between 1 and 100 only");
                                return;
                            }
                            else{
                            value=value+1;
                            System.out.println("Hey..your guess is higher than the generated random number ");
                            System.out.println("You are left with "+(10-value)+" turns");
                            }
                        }
                    
                }
                    
                else if(no_of_turns==10)
                {
                    if(guess==correct_guess)
                    {
                        System.out.println("Congratulations....You won!!!!!");
                        System.out.println("Generated random number matches with your guess..The number is : "+correct_guess);
                        System.out.println("You have had "+no_of_turns+" turns to guess the number");
                        System.out.println("Final score : "+((10-no_of_turns)*10)+" out of total score 100"); 
                        return;
                    }
                    if(guess!=correct_guess)
                    {
                        if(guess<1 || guess>100)
                        {
                            System.out.println("Invalid!!!...Please choose number between 1 and 100 only");
                            return;
                        }
                        else
                        {
                        System.out.println("Sorry...you lost");
                        System.out.println("Better luck next time..");
                        System.out.println("The right number is : "+correct_guess);
                        System.out.println("Final score : "+((10-no_of_turns)*10)+" out of total score 100"); 
                        return;
                        }
                        
                      
                    }
                    
                }
                    
                     no_of_turns++;
        
            }
       }
                
                
         public static void main(String[]args)
          {
              int n=3;
              System.out.println("You have only "+n+" attempts to play..");
              game();
              int m=1;
              
              while(m!=0)
              {
                  System.out.println("\n");
                  System.out.println("Do you want to continue the game?? if yes press '1' else to exit press '0' ");
                  Scanner sc=new Scanner(System.in);
                  m=sc.nextInt();
                  System.out.println("\n");
                  System.out.println("\n");
                  if(m==1 && n!=1)
                  {
                      
                      System.out.println("You have only "+(n-1)+" attempts to play..");
                      game();
                      n=n-1;
                      
                  }
                  else if(m==1 && n==1)
                  {
                      System.out.println("Sorry all your attempts are done...");
                      System.exit(0);
                  }
                  else 
                  {
                      System.out.println("You have chosen to exit the game!!!!");
                      System.exit(0);
                  }
              }
    }
                
      
}
