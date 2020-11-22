/*
* PP2_11.java
* Description: This program prompts for user input of a monetary value, then is converted into the indibidual bills
* and cents which are later printed out witht eh total amount of pennies, and quarters are in the user input.
*
*Author: Roy Andres Corrales Ramirez
*Creation Date:2/10/19
*/

import java.util.Scanner;

public class PP2_11 {
  
  public static void main(String[]args){
  
  final int FIFTY = 50; final int TWENTY = 20; final int TEN = 10; final int FIVE = 5; final int ONE = 1;
  final double HALFDOLLAR = .50; final double QUARTER = .25; final double DIME = .1; final double NICKEL = .05; 
  final double PENNY = .01; //All the constants used for refrence of the monetary values

  Scanner scan = new Scanner(System.in); //Creates an object of the scanner class
  
  System.out.print("Enter your desired amount: ");
  double amount = scan.nextDouble(); //Scans the next variable of the input as a Double
  
  double cents = (amount - ((int)amount)); //Creates a new variable to store the value of amount - (int) amount
  double centsprinted = amount; //Creates a new object for the total # of pennies and quarters
  int centat = (int) amount; //Creates a new object to convert the double amount into an int
 
  
  int fifty = centat/FIFTY;
  System.out.println("$50 total: " + fifty);
  centat = centat % FIFTY;                   /*This block runs a new object which the amount(centat) of $50 bills are stored
                                               which is devided by FIFTY(50), prints the quotient, and takes the remainder
                                               and sets it back to centat(amount), it repeats this process for the rest.*/

  int twenty = centat/TWENTY;
  System.out.println("$20 total: " +  twenty);
  centat = centat % TWENTY;
  
  int ten = centat/TEN;
  System.out.println("$10 total: " + ten);
  centat = centat % TEN;
  
  int five = centat/FIVE;
  System.out.println("$5 total: " + five);
  centat = centat % FIVE;
  
  int one = centat/ONE;
  System.out.println("$1 total: " + one);
  centat = centat % ONE;
  
  
  int halfdollar = (int)(cents/HALFDOLLAR);
  cents = cents - (halfdollar*HALFDOLLAR);
  System.out.println("50\u00A2 total: " + halfdollar);
  amount = cents % HALFDOLLAR;
  
  int quarter = (int)(cents/QUARTER);
  cents = cents - (quarter*QUARTER);
  System.out.println("25\u00A2 total: " + quarter);
  amount = cents % QUARTER;
  
  int dime = (int)(cents/DIME);
  cents = cents - (dime*DIME);
  System.out.println("10\u00A2 total: " + dime);
  amount = cents % DIME;
  
  int nickel = (int)(cents/NICKEL);
  cents = cents - (nickel*NICKEL);
  System.out.println("5\u00A2 total: " + nickel);
  amount = cents % NICKEL;
  
  int penny = (int)(cents/PENNY+.00001);
  cents = cents - (penny*PENNY);
  System.out.println("1\u00A2 total: " + (penny));
  amount = cents % PENNY;
  
System.out.println("------------------------------");
  
  double penn = (centsprinted*100);
  System.out.println("Total amount of Pennies: " + (int) penn); /* Creates a double value to store the centsprinted(amount)
                                                                   multiplied by 100, becuase there are 100 pennies in a dollar.
                                                                   Then executes the same thing for quarters and is devided by 25
                                                                   becuase a quarter is 25 cents. */
  
System.out.println("------------------------------");
 
  double quart = (centsprinted *100)/25;
  System.out.println("Total amount of Quarters: " + (int) quart);
  }
}

  
      
  