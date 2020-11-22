/*
* Ride.java
* Description: This creates the window for the sub-class to be illustrated. 
*Author: Roy Andres Corrales Ramirez
*Creation Date:4/22/2019
*/
import javax.swing.*;

public class Ride{
  public static void main(String[] args){
    JFrame frame=new JFrame("Flying Ships"); //Creates the window for the code
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Exits the program when you close it
    spacecraft craft = new spacecraft(); 
    frame.getContentPane().add(craft);    
    frame.pack();
    frame.setVisible(true); //Allows the user to see the frame
  }
}  