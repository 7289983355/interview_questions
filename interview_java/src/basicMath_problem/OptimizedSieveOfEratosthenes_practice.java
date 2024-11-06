package basicMath_problem;

import java.util.Arrays;

public class OptimizedSieveOfEratosthenes_practice {

    public static void main(String[] args) {
        int n = 30; // Find all primes up to n
        
        //create a new Arrays with size n+1 of type boolean
        boolean[] isprime=new boolean[n+1];
        
        //suppose all the number are prime pre-fill with true
        
        Arrays.fill(isprime, true);
        
        isprime[0]=isprime[1]=false;
        
        for(int i=2 ;i<=Math.sqrt(n);i++) {
        	
        	if(isprime[i]) {
        		for(int j=i*i ;j<=n; j=j+i) {
            		
            		isprime[j]=false;
            	}	
        	}
        	
        	
        }
    }
}
