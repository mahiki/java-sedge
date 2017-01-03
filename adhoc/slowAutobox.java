class slowAutobox {
    
    public static void main(String[] args){
        long sum = 0L; 
	// Long sum = 0L;
	for (long i = 0; i < Integer.MAX_VALUE; i++){
	    sum += i;
	}
	System.out.println("the values from 0 to max integer: " + sum);
    }
}

