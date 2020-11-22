/*
* Project1b.java
* Description: This program prompts for user input of a city and the country, ticket price, and number of tickets
*              which will then be calulated with the rest of the already destined flights and out put the place, tax, and final amount.
*Author: Roy Andres Corrales Ramirez
*Creation Date:3/5/19
*/
import java.util.Scanner;

public class Project1b{
  public static void main(String[]args){
  
    Trips trip1 = new Trips("Kyoto, Japan", 1300, 3); //All of the pre-set trips 1-9 
    Trips trip2 = new Trips("New York, New York", 200, 2);
    Trips trip3 = new Trips("Bali, Indonesia", 1000, 1);
    Trips trip4 = new Trips("Bangkok, Thailand", 1150, 5);
    Trips trip5 = new Trips("Moscow, Russia", 1200, 4);
    Trips trip6 = new Trips("Dubai, United Arab Empires", 1200, 3);
    Trips trip7 = new Trips("Berlin, Germany", 800, 2);
    Trips trip8 = new Trips("San Jose, Costa Rica", 400, 3);
    Trips trip9 = new Trips("Sydney, Australia", 1700, 1);
   
    Scanner scan = new Scanner(System.in); //Prompts user for each designated value
    System.out.println("Enter your City: ");
    String destination = scan.nextLine();
    System.out.println("Enter your Country: ");
    String dest = scan.nextLine();
    System.out.println("Airline ticket price: ");
    double ticket_price = scan.nextDouble();
    System.out.println("Number in party: ");
    int ticket_amount = scan.nextInt();

    System.out.println(trip1);
    System.out.println(trip2);
    System.out.println(trip3);
    System.out.println(trip4);
    System.out.println(trip5);
    System.out.println(trip6);
    System.out.println(trip7);
    System.out.println(trip8);
    System.out.println(trip9);
    Trips trip10 = new Trips(""+destination+","+dest+"", ticket_price, ticket_amount); //Formats the scan entered values
    trip10.setQuantity(5); //Sets the quantity of tickets for trip10 to 5
    trip10.calcTotal(); //Calls the calcTotal method in the Trips class
    System.out.println(trip10);
    
  }
}