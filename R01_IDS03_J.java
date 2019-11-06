/******************************************************************************
 *  Compilation:  javac R01_IDS03_J.java
 *  Execution:    java R01_IDS03_J
 *
 *  Logs untrusted data from an unauthenticated user with
 *  and without data sanitization
 *
 ******************************************************************************/

public class R01_IDS03_J {

  public static void main(String[] args) {

    boolean loginSuccessful = true;

    String username = "username";

    if (loginSuccessful) {
      logger.severe("User login succeeded for: " + username);
    } else {
      logger.severe("User login failed for: " + username);
    }
  }
}

class logger {

  public static int severe(String input) {

    System.out.println(input);

    return 1;

  }

}
