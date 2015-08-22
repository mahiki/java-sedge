public class ReverseClient {
   public static void main(String[] args) {
      Stack<String> stack;
      stack = new Stack<String>();
      String item = "";
 
      StdOut.println("Usage: Enter items on stack, '-' to pop");

      while (!StdIn.isEmpty()) {
         item = StdIn.readString();
	 if( !item.equals( "-" )) stack.push(item);

         else if ( !stack.isEmpty() ) StdOut.println(stack.pop() + "");
      } 
   }
   
}
