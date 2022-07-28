package fizzBuzz;
import java.util.Scanner;

public class fizzbuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This game Enter the maximum is known as fizzbuzz");
        System.out.println(" if an integer is divisible by 3, 'Buzz' if an integer is divisible by 5");
        System.out.println("and “FizzBuzz” if an integer is divisible by both 3 and 5");
        System.out.print("Come on let's get started, \nEnter the number\n>>");
        int number = input.nextInt();
       
      do{
        
        if(number % 3 ==0 && number % 5 ==0){
            System.out.println("FizzBuzz");                
        }
        else if(number % 3 ==0){
            System.out.println("Buzz");
        }
        else if(number % 5 == 0){
            System.out.println("Fizz");
        }
        else{
            System.out.println("none just" + number);
        }
        
        System.out.print("\nEnter the number or -1 to quit game\n>>");
        number = input.nextInt();

      }while(number!=-1);
      //pause
      System.out.println("Terminating the game--");
      wait(3000);
      System.out.println("Game succesfully terminated");
      
    input.close();
    }

    public static void wait(int ms)
    {
        try
        {
            Thread.sleep(ms);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }
}
