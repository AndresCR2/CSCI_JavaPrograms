//**************************************
//Name: Roy Andres Corrrales Ramirez
//**************************************
import java.util.Random;
import java.util.Scanner;

public class RandomNum2 {
 public static void main(String[] args) {

        Scanner scanner = null;
        int array[][] = new int[3][5];
        int selectNum[][] = new int[3][5];
        Random rand = new Random(); { //Creates my Random instance

        scanner = new Scanner(System.in);
        System.out.println("Random Array is:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rand.nextInt(21) + 30;
            }         }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                System.out.print(array[i][j] + " ");
            }
            System.out.println();

        }
        System.out.print("\nPlease enter a number between 20 and 50: ");
        int select = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] < select)
                    array[i][j] = 100;

            }
        }
        System.out.println(" \nAfter Removing the Array is:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");

            }
            System.out.println("");
        }
    }
}
}