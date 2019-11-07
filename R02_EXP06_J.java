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

  static void process(int index) {
    assert names.remove(null); // Side effect
    // ...
  }

  public static void main(String[] args) {

    process(0);
  }
}
