/****************************************************************************
 *  Compilation:  javac TestStopwatch.java
 *  Execution:    java TestStopwatch <integer K>
 *  Dependencies: Stopwatch.java StdOut.java
 *
 *  For doubling n < K, show elapsed time of O(N^2) operation
 ****************************************************************************/

public class TestStopwatch {
    
    private long count;
    private int N;

    public TestStopwatch(int M){
        
        N = M;
    
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++) count++;
        }
    }
    
    public static void main(String[] args) {
 
        StdOut.println("TestStopwatch\nUsage: java TestStopwatch <Integer K>\n");
        int K = Integer.parseInt(args[0]);
        int n = 2;
    
        StdOut.println("n\tl0g(n)\t\t\ttime\tl0g(time)");
    
        Stopwatch timer = new Stopwatch();
    
        while (n <= K) {
        
            TestStopwatch tester = new TestStopwatch(n);
        
            StdOut.println(n + "\t" + Math.log(n)
                             + "\t" + timer.elapsedTime()
                             + "\t" + Math.log(timer.elapsedTime()));

            n = 2*n;
        }
        
        StdOut.println("Stopwatch Test is done ---");
    }
    
}
