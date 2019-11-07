/******************************************************************************
 *  Compilation:  javac R03_NUM07_J.java
 *  Execution:    java R03_NUM07_J
 *
 *  Compares with NaN
 *
 ******************************************************************************/

public class R03_NUM07_J {

  public static void main(String[] args) {

    double x = 0.0;
    double result = Math.cos(1/x); // Returns NaN if input is infinity
    if (result == Double.NaN) { // Comparison is always false!
      System.out.println("result is NaN");
    }
  }
}
