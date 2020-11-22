/*
* HotelA.java
* Description: Holds the array for the text file, has an if statement to check each line and also increments at the bootom until it reaches the max amount of lines (34) 
*Author: Roy Andres Corrales Ramirez
*Creation Date:4/22/2019
*/
import java.io.*;
import java.util.Scanner;

public class HotelA{
  public static void main(String[]args)throws IOException{
    Scanner fileName = new Scanner(new File("Part 1.txt")); //Makes the read in info the text file
    fileName.useDelimiter("/");

    Guests[] scanFile = new Guests [34]; //Created the 34 unit array
    String fName, lName, flName, address, cityState, city, state, ftGuest, sGuest, tGuest, fGuest;//Instantiates all the variables used 
    int count = 0, totalGuest, numGuest;                    
  
    while(fileName.hasNext()){ //Looks for each designated piece of info and then runs an if condition
    fName = fileName.next();
    lName = fileName.next();
    flName = fName+lName;
    address = fileName.next();
    cityState = fileName.next();
    String[] cyState = cityState.split(", ");
    city = cyState[0];
    state = cyState[0].toUpperCase();
    numGuest = fileName.nextInt();
    
    if(numGuest == 1){
      scanFile[count] = new Guests(fName, address, city, state, 2, count);
    }
    else if (numGuest == 2){
  
      sGuest = fileName.next();
      scanFile[count] = new Guests(fName, address, city, state, 2, count, sGuest);
    }
    else if (numGuest == 3){
   
      sGuest = fileName.next();
      tGuest = fileName.next();
      scanFile[count] = new Guests(fName, address, city, state, 2, count, sGuest, tGuest);
    }
    else if (numGuest == 4){
  
      sGuest = fileName.next();
      tGuest = fileName.next();
      fGuest = fileName.next();
      scanFile[count] = new Guests(fName, address, city, state, 2, count, sGuest, tGuest, fGuest); 
    }
    count++;
    }
    for(int counter = 0; counter < 33; counter++){
    System.out.println(scanFile[counter].toString());
    }
    }
  }

  
      
    
    
    

          
                         
  
                         
                         
                        
                         
    
    
    