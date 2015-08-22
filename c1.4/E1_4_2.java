public class E1_4_2{
   
   public static void main(String[] args){
   
   int N = 1000;

   StdOut.println("N = " + N + "\tN^4 = " + N*N*N*N);
   StdOut.println("Array initialization will fail, integer overflow");

   int[] a = new int[N*N*N*N];
   
   StdOut.println(a.length);

   // It compiles however array intialization gives java.lang.NegativeArraySizeException
   }
}
