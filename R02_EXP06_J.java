/******************************************************************************
 *  Compilation:  javac R02_EXP06_J.java
 *  Execution:    java R02_EXP06_J
 *
 * Decoupling the Boolean expression from the assertion
 *
 ******************************************************************************/

import java.util.*;

public class R02_EXP06_J {

  private static ArrayList<String> names;

  /*
   * Rule 02. Expressions (EXP)
   * Corrected code per:
   * https://wiki.sei.cmu.edu/confluence/display/java/EXP06-J.+Expressions+used+in+assertions+must+not+produce+side+effects
   *
   */

  static void process(int index) {
    names = new ArrayList<String>();
    names.add(null);
    System.out.println(names);
    boolean nullsRemoved = names.remove(null);
    System.out.println(names);
    assert nullsRemoved; // No side effect
    // ...
  }

  public static void main(String[] args) {

    process(0);
  }
}
