/*
* Project1a.java
* Description: This program prompts for user input of a monetary value and their designated location for their flight
*              and outputs the Sub-Total, Tax, the randomized Service Fee, and calculates the Total
*
*Author: Roy Andres Corrales Ramirez
*Creation Date:3/1/19
*/
import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;
  
public class Project1a{
  public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();

    final double TAX = .07;
    
    System.out.println("Please enter your first name: "); //These are the multiple input values that are prompted to the user
    String first_name = scan.nextLine();
    
    System.out.println("Please enter your last name: ");
    String last_name = scan.nextLine();
    
    System.out.println("Please enter your destination: ");
    String destination = scan.nextLine();
    
    System.out.println("Please enter the ticket cost: ");
    String ticket_cost = scan.nextLine();
    
    System.out.println("Please enter number of tickets: ");
    String number_tickets = scan.nextLine();
    
    double cost = Double.parseDouble(ticket_cost);  //Converts the String into a double value
    int tickets = Integer.parseInt(number_tickets);
    
    String capital_fn = first_name.substring(0,1).toUpperCase() + first_name.substring(1);
    first_name = capital_fn; //Converts the first letter from a lowercase to uppercase characters
    
    String capital_ln = last_name.substring(0,1).toUpperCase() + last_name.substring(1);
    last_name = capital_ln;
    
    
    DecimalFormat rn = new DecimalFormat("00.00"); //Creates the decimal format 
    double random_number = (24.49 + (39.27-24.49)* rand.nextDouble()); //Creates a range for the random number
    double drandom_number = Double.parseDouble(rn.format(random_number));
   
    
    double sub_total = cost * tickets;
    double tax_due = sub_total * TAX;
    double total = sub_total + tax_due + drandom_number; 
  
    
    System.out.println("Thank you " + first_name + " " + last_name + " for reserving your flight to " + destination); 
    System.out.println(tickets + " tickets at a pre-ticket cost of " + ticket_cost);
    System.out.println("Sub-Total: " + "$" + sub_total);
    System.out.println("Tax: " + "$" + rn.format(tax_due));
    System.out.println("Service Fee: " + "$" + drandom_number);
    System.out.println("Final-Total: " + "$" + rn.format(total));
   
  }
}