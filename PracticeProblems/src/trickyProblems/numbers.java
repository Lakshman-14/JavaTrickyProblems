package trickyProblems;

import java.util.Scanner;

class numbers {
	 
  
 
    // Driver code
    public static void main(String[] args)
    {
        int i = 0;
        
        for(i=1; i<=9999; i++) {
        	if(i<10) {
        		break;
        	}
        	if(i>=10) {
  
        	int first , last;
        	first = i/10;
        	last = i%10;
        	int sum = first+last;
        	if(sum==9) {
        		System.out.println(i);
        	}
        
        }
        	
        
    }
}
}
