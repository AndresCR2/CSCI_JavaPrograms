//**************************************
//Name: Roy Andres Corrrales Ramirez
//**************************************
import java.util.Random;
import java.util.Scanner;

public class RandomNum {
    public static void main(String[] args) {

        Scanner scanner = null;
        int[] randNum = new int[20]; //Declare Array Lines(8-11)
        int[] randTemp = new int[20];
        Random rand = new Random(); { //Creates my Random instance

            scanner = new Scanner(System.in);
            for (int i = 0; i < randNum.length; i++) { //Creates a loop for the numbers
                randNum[i] = rand.nextInt(21); //Instantiates an variable to hold up to 20 int values, as 21-1=20
            } 

            System.out.println("Random Array is:");
            for (int i = 0; i < randNum.length; i++) { //Generates numbers up to 20
                System.out.print(" " + randNum[i]); //Prints the values out
            } 
            System.out.print("\nPlease enter a lower bound number between 0 and 20:");

            int lowerBound = scanner.nextInt();
            System.out.print("\nPlease enter a upper bound number between 0 and 20:");

            int upperBound = scanner.nextInt();
            int count = 0;
            for (int i = 0; i < randNum.length; i++) {
                if (!(randNum[i] > lowerBound && randNum[i] < upperBound)) {
                    /*Searches to see what numbers are between
                      the lower and upper bound.*/
                    randTemp[count++] = randNum[i];
                }
            }

            System.out.println(" After Removing the Array is: ");
            for (int i = 0; i < randTemp.length; i++) { //Creates new array with the altered numbers
                System.out.print(" " + randTemp[i]);
            }
        }
    }
}

