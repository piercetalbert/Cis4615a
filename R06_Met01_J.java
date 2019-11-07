/******************************************************************************
 *  Compilation:  javac R06_Met01_J.java
 *  Execution:    java R06_Met01_J
 *
 *  Calls function getAbsAdd(x,y) with and without using assertions
 *
 ******************************************************************************/

 public class R06_Met01_J {

   public static void main(String[] args) {

     int a = 17;
     System.out.println("a = " + a);
     int b = 42;
     System.out.println("b = " + b);
     int c = getAbsAdd(a, b);
     System.out.println("c = " + c);

   }

   public static int getAbsAdd(int x, int y) {

     assert x != Integer.MIN_VALUE;
     assert y != Integer.MIN_VALUE;
     int absX = Math.abs(x);
     int absY = Math.abs(y);
     assert (absX <= Integer.MAX_VALUE - absY);
     return absX + absY;
   }
 }
