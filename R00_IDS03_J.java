/******************************************************************************
 *  Compilation:  javac R00_IDS03_J.java
 *  Execution:    java R00_IDS03_J
 *
 *  Logs untrusted data from an unauthenticated user with
 *  and without data sanitization
 *
 ******************************************************************************/
import java.util.regex.Pattern;

public class R00_IDS03_J {

  /*
   * Rule 00. Input Validation and Data Sanitization (IDS)
   * Corrected code per:
   * https://wiki.sei.cmu.edu/confluence/display/java/IDS03-J.+Do+not+log+unsanitized+user+input
   *
   */

  public String sanitizeUser(String username) {
    return Pattern.matches("[A-Za-z0-9_]+", username) ? username : "unauthorized user";
  }

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
