import java.util.Scanner;
/**
 * Arrays example
 * @author Thomas Quigley
 */
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    final int NUM_MARKS = 5;
    // create array with 5 spots
    double[] grades = new double[NUM_MARKS];

    // put grades into the array using a loop
    for (int i = 0; i < grades.length; i++) {
      System.out.println("Please enter in grade " + (i + 1));
      grades[i] = input.nextDouble();
    }


    // create a variable to store the sum
    double sum = 0;
    
    // use for loop to go through the array and add to sum
    for (int i = 0; i < grades.length; i++) {
      // add the grade to the sum
      sum = sum + grades[i];
    }
    // determine the average 
    double average = sum / NUM_MARKS;
    
    // let the user know
    System.out.println("Your average mark is " + average);
  }
}
