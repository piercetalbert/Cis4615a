/******************************************************************************
 *  Compilation:  javac R02_EXP00_J.java
 *  Execution:    java R02_EXP00_J
 *
 *  Runs the deleteFile method with and without ignoring return values
 *
 ******************************************************************************/

import java.io.*;

public class R02_EXP00_J {

  public static void deleteFile(){

    File someFile = new File("someFileName.txt");
    // Do something with someFile
    someFile.delete();
  }

  public static void main(String[] args) {

    deleteFile();
  }


}
