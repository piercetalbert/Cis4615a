/******************************************************************************
 *  Compilation:  javac R04_STR03_J.java
 *  Execution:    java R04_STR03_J
 *
 *  Attempts to convert BigInteger to String and back
 *
 ******************************************************************************/

import java.math.BigInteger;

public class R04_STR03_J {

  public static void main(String[] args) {

    /*
     * Rule 04. Characters and Strings (STR)
     * Corrected code per:
     * https://wiki.sei.cmu.edu/confluence/display/java/STR03-J.+Do+not+encode+noncharacter+data+as+a+string
     *
     */

    BigInteger x = new BigInteger("530500452766");
    String s = x.toString();  // Valid character data
    byte[] byteArray = s.getBytes();
    String ns = new String(byteArray);
    x = new BigInteger(ns);
  }
}
