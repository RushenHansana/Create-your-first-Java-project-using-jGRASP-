/*
This is a program that outputs my name, age, and hobby
*/
import java.util.Scanner;

public class MyDetails
{
   // this is the entry of a Java program
   public static void main(String arg[])
   {
     //variables
     String name = "Rushen Hansana",hobby = "Hiking";;
     int bornyear = 2000, age = 23, currentyear = 2023;
     boolean older_21 = true;
     double sum=0, prereq_marks, averagescore = 67.345; 
     Scanner input = new Scanner(System.in);
     
     
     // User input
     System.out.println("What is your name?");
     name = input.nextLine();
     
     System.out.println("What is your hobby? - type in one word");
     hobby = input.next();// only one word
     
     System.out.println("Which year were you born?");
     bornyear = input.nextInt();
     
     //System.out.println("What is the averagescore?");
     //averagescore = input.nextDouble();
     
     for(int i = 1; i <= 3 ; i++)
     {
      do
      {
      System.out.println("Enter marks between 50 and 100 for course "+ i);
      prereq_marks = input.nextDouble();
      
      }while(prereq_marks<50 || prereq_marks>100);
      sum += prereq_marks;
      
     }
     //processing details
     averagescore = sum/3;
     age = currentyear - bornyear;
     
     if(age<21)
      older_21 = false;
     
     
     
     
     
     //Output
     System.out.println("My Details");
     System.out.println("---------");
     System.out.print("Name : "+ name);
     System.out.print("  Hobby : "+ hobby);
     System.out.println();
     System.out.println("Year of Birth : "+ bornyear);
     System.out.printf("Average score %.1f" ,averagescore);
     System.out.println();
     if(older_21 == true)
      System.out.println("You are enrolled!");
     else
      System.out.println("You are younger than 21 - sorry you are not enrolled");
     
   }
}