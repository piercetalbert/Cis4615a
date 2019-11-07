/******************************************************************************
 *  Compilation:  javac R03_NUM02_J.java
 *  Execution:    java R03_NUM02_J
 *
 *  Mitigates divide by zero errors
 *
 ******************************************************************************/

public class R03_NUM02_J {

  /*
  * Rule 03.  Numeric Types and Operations (NUM)
  * Corrected code per:
  * https://wiki.sei.cmu.edu/confluence/display/java/NUM02-J.+Ensure+that+division+and+remainder+operations+do+not+result+in+divide-by-zero+errors
  *
  */

  public static void main(String[] args) {

    long num1, num2, result;

    num1 = 12;
    num2 = 0;

    if (num2 == 0) {
      System.out.println("ERROR: dividing by zero.");
    }

    else {
      result = num1 / num2;
    }
  }
}
