/* showrem.java -- a test program to show an 'unexpected' result when
   using binary double-precision floating-point for an apparently
   decimal calculation.
   */
import java.math.*;

public class showRem {

 public static void main(java.lang.String args[]){

  double tenth=0.1D;
  double one=1.00D;


  System.out.println("Divide and Remainder using binary toString");
  System.out.println(one/tenth);
  System.out.println(one%tenth);


  System.out.println("\nDivide and Remainder showing values exactly");
  System.out.println(new BigDecimal(one/tenth).toString());
  System.out.println(new BigDecimal(one%tenth).toString());



  double ir=java.lang.Math.IEEEremainder(one,tenth);
  System.out.println("\nIEEE Remainder from nearest integer");
  System.out.println(ir);


  }
 }