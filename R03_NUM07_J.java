/******************************************************************************
 *  Compilation:  javac R03_NUM07_J.java
 *  Execution:    java R03_NUM07_J
 *
 *  Compares with NaN
 *
 ******************************************************************************/

public class R03_NUM07_J {

  /*
  * Rule 03.  Numeric Types and Operations (NUM)
  * Corrected code per:
  * https://wiki.sei.cmu.edu/confluence/display/java/NUM07-J.+Do+not+attempt+comparisons+with+NaN
  *
  */

  public static void main(String[] args) {

    double x = 0.0;
    double result = Math.cos(1/x); // Returns NaN when input is infinity
    if (Double.isNaN(result)) {
      System.out.println("result is NaN");
    }
  }
}
