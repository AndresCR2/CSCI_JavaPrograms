/*
* PP5_15.java
* Description:  This program opens a text file and reads diffrent values, keeps track, and accumulates how many times the
*               variable is used in the text file.
*Author: Roy Andres Corrales Ramirez
*Creation Date:3/27/2019
*/
import java.io.*;
import java.util.Scanner;

public class PP5_15{
 public static void main(String[]args)throws IOException{
   
   File filename = new File("Chp5.txt"); //Allows the text file to be inseted in memory. 
   String line = null;
   Scanner scan = new Scanner(filename);
   scan.useDelimiter(""); //Ignores white spaces and continues until the end of the txt file.
   
   int leftparent = 0, rightparent = 0, commas = 0, periods = 0, exclamation = 0, question = 0, hashtag = 0, vowels = 0, count = 0;
   
   while(scan.hasNext()) { 
   String sc = scan.next();
      
      if(sc.equals("(")) //Looks for any ( in the txt file.
           leftparent++; //Increments by 1 everytime the condition is satisfied.
       
      else if(sc.equals(")"))
           rightparent++;
   
      else if(sc.equals(","))
           commas++;
      
      else if(sc.equals("."))
           periods++;
   
      else if(sc.equals("!"))
           exclamation++;
 
      else if(sc.equals("?"))
           question++;

      else if(sc.equals("#"))
           hashtag++;
      
      else if (sc.equalsIgnoreCase("a") || sc.equalsIgnoreCase("e") || sc.equalsIgnoreCase("i") || sc.equalsIgnoreCase("o") || sc.equalsIgnoreCase("u")) //Creates and OR to determine which of the 5 vowels are used
           vowels++;
  
      else if (scan.hasNextInt()) 
           count++;
     }             
   System.out.println("Left Parenthesis: " + leftparent); //Outputs the saveed data from each variable
   System.out.println("Right Parenthesis: " + rightparent);
   System.out.println("Commas: " + commas);
   System.out.println("Periods: " +periods);
   System.out.println("Exclamation Points: " + exclamation);
   System.out.println("Question Marks: " + question);
   System.out.println("Hashtags: " + hashtag);
   System.out.println("Vowels: " + vowels);
   System.out.println("Total Numbers: " + count);
 }
}
   
   