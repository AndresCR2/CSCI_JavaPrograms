/*
* PP2_11.java
* Description: This program is the sub-class of Project1b, it houses all the methods that are calld in Project1b
*              like setQuantity and calcTotal.
*Author: Roy Andres Corrales Ramirez
*Creation Date:3/5/19
*/
import java.text.DecimalFormat;

public class Trips{

  private String destination;
  private double ticket_price, final_amount, tax_total, sub_total; 
  private int ticket_amount;
  private final double TAX = .06, SERVICEFEE = 27.30; //Gives the constants values
  
  public Trips(String dest, double tickprice, int tickamount) //Gathers the impted info of the trips to then run through the program
  {
    destination = dest;
    ticket_price = tickprice;
    ticket_amount = tickamount;
    calcTotal();
  }
  
  public void calcTotal(){ //Houses all the calculations and gathers the info for said calculations
    sub_total = ticket_price * ticket_amount;
    tax_total = sub_total * TAX;
    final_amount = sub_total + tax_total + SERVICEFEE;
  }
    
  public int getQuantity(int newAmount){ //returns the ticket_amount to be used in the setQuantity method
    return ticket_amount;
  }
    
  public void setQuantity(int newQuantity)
  {
    ticket_amount = newQuantity;
  } 
  
  public String toString()
  {
    DecimalFormat dec = new DecimalFormat("#,#00.00"); //Formats the monetary values
    dec.setGroupingSize(3); 
    return ticket_amount + " ticket(s) to " + destination + "\nTax: " + "$" + dec.format(tax_total) + "\nTotal Cost: " + "$" + dec.format(final_amount) + "\n###############"; 
  } 
 }


