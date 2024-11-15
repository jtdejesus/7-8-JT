// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class Main {
  
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in); 
    double[] vals = new double[10];
    System.out.println("Enter double values:");

    for (int i = 0; i < vals.length; i++) {
      vals[i] = in.nextDouble();  
    }
    int[] a = {1, 2, 3, 4, 5};
      double avg = average(a);
    System.out.printf("The average is %.2f\n", avg); 
  }

  public static int average(int[] array) {
    int sum = 0;
    for (int val : array)
      sum += val;
    return sum / array.length;
  }

  public static double average(double[] array) {
    double sum = 0;
    for (double val : array)
      sum += val;
    return sum / array.length;
  }
}