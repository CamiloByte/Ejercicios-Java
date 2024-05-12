package fizzbazz;

public class df {
	
	
	public static void main(String[] args) {
		
		int a,b,c;
	
					
		 for(b=1; b<=100; b++){	
              
             
             if(b % 3 == 0 && b % 5 == 0)
           System.out.println("Fizzbuzz");
             
             else if (b % 3 == 0)
            	 System.out.println("Fizz");
             else if (b % 5 ==0)
            	 System.out.println("Buzz");
             
             else
            	  System.out.println(b + " "); 
            	      
	}
}
}
