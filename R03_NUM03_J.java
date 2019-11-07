/******************************************************************************
 *  Compilation:  javac R03_NUM03_J.java
 *  Execution:    java R03_NUM03_J
 *
 *  Runs the getInteger function with and without the full range
 *  of possible integers
 *
 ******************************************************************************/

import java.io.*;

public class R03_NUM03_J {

  /*
   * Rule 03. Numeric Types and Operations (NUM)
   * Corrected code per:
   * https://wiki.sei.cmu.edu/confluence/display/java/NUM03-J.+Use+integer+types+that+can+fully+represent+the+possible+range+of++unsigned+data
   *
   */

  public static int getInteger(DataInputStream is) throws IOException {
    return is.readInt() & 0xFFFFFFFFL;
  }

  public static void main(String[] args) {

    int[] buf = {1, 2, 3, 4, 5, 6};

    try {

      FileOutputStream fileoutstream = new FileOutputStream("test.txt");
      DataOutputStream dataoutstream = new DataOutputStream(fileoutstream);

      for (int b:buf) {

        dataoutstream.writeInt(b);
      }

      dataoutstream.flush();

      InputStream inpstream = new FileInputStream("test.txt");
      DataInputStream datainpstream = new DataInputStream(inpstream);

      while(datainpstream.available() > 0) {

        int c = getInteger(datainpstream);
        System.out.print(" " + c);
      }
    }
    catch(Exception e) {

      e.printStackTrace();
    }

  }
}
