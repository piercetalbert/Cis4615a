/******************************************************************************
 *  Compilation:  javac R49_MSC02_J.java
 *  Execution:    java R49_MSC02_J
 *
 *  Generates random numbers in a secure fashion using SecureRandom
 *
 ******************************************************************************/

import java.security.SecureRandom;
import java.security.NoSuchAlgorithmException;

public class R49_MSC02_J {

  /*
  * Rule 49. Miscellaneous (MSC)
  * Corrected code per:
  * https://wiki.sei.cmu.edu/confluence/display/java/MSC02-J.+Generate+strong+random+numbers
  *
  */

  public static void main(String[] args) {

    SecureRandom number = new SecureRandom();
    // Generate 20 integers 0..20
    for (int i = 0; i < 20; i++) {
      System.out.println(number.nextInt(21));
    }
  }
}
