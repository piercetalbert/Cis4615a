/******************************************************************************
 *  Compilation:  javac R06_ME12_J.java
 *  Execution:    java R06_ME12_J
 *
 * This compliant solution ensures that the buffer can be reclaimed as soon
 * as the object becomes unreachable after the finalize() method is called
 *
 ******************************************************************************/

import javax.swing.JFrame;

public class R06_ME12_J {

  public static void main(String[] args) {

  }
}

class MyFrame extends JFrame {
  private byte[] buffer = new byte[16 * 1024 * 1024];
  // Persists for at least two GC cycles
}
