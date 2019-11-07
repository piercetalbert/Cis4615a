/******************************************************************************
 *  Compilation:  javac R02_EXP00_J.java
 *  Execution:    java R02_EXP00_J
 *
 *  Runs the deleteFile method with and without ignoring return values
 *
 ******************************************************************************/

import java.io.*;

public class R02_EXP00_J {

  /*
   * Rule 02. Expressions (EXP)
   * Corrected code per:
   * https://wiki.sei.cmu.edu/confluence/display/java/EXP00-J.+Do+not+ignore+values+returned+by+methods
   *
   */

  public static void deleteFile(){

    File someFile = new File("someFileName.txt");
    // Do something with someFile
    if (!someFile.delete()) {
    // Handle failure to delete the file
    }
  }

  public static void main(String[] args) {

    deleteFile();
  }


}
