/*
* Guests.java
* Description: This is the sub-class, it creates the format for how each condition should be handled, also sets how it should be printed with the toString. 
*Author: Roy Andres Corrales Ramirez
*Creation Date:4/22/2019
*/
public class Guests{
    
    private String primaryName, address, city, state, secondName, thirdName, fourthName; //Instantiates all the variables used
    private int guests, num_room;
    
    public Guests(String pName, String nAddress, String nCity, String nState, int numGuests, int nRoom){ //Creates the constructor to frame the input from the text file
      primaryName = pName;
      address = nAddress;
      city = nCity;
      state = nState;
      guests = numGuests;
      num_room = nRoom;}
    
    public Guests(String pName, String nAddress, String nCity, String nState, int numGuests, int nRoom, String sName){
      primaryName = pName;
      address = nAddress;
      city = nCity;
      state = nState;
      guests = numGuests;
      num_room = nRoom;
      secondName = sName;}
    
    public Guests(String pName, String nAddress, String nCity, String nState, int numGuests, int nRoom, String sName, String tName){
      primaryName = pName;
      address = nAddress;
      city = nCity;
      state = nState;
      guests = numGuests;
      num_room = nRoom;
      secondName = sName;
      thirdName = tName;}
    
   public Guests(String pName, String nAddress, String nCity, String nState, int numGuests, int nRoom, String sName, String tName, String fName){
      primaryName = pName;
      address = nAddress;
      city = nCity;
      state = nState;
      guests = numGuests;
      num_room = nRoom;
      secondName = sName;
      thirdName = tName;
      fourthName = fName;}
    
    public String toString(){ //Creates the template for how it should be printed
      return ("Family Name: " + primaryName.trim() + "\t City: " + city + "\t State: " + state + "\t Room Number: " + num_room);}
}


      
  