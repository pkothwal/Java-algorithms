package com.prahalad.stanford;

/**
 * Fibonacci
 *
 */
public class Fibo 
{
    public static void main( String[] args )
    {
    
    	System.out.println(fibos(3));
    	
    
    	
    }
    
    
    public static int fibos(int num){
 
    	
    	
    	if( num == 0){  return 0;} 
    	if( num == 1) { return 1; }
    	
    	int temp = fibos(num-1) + fibos(num-2) ;
    	
  
    	 return temp;
    	
    }
    
   
   
    
    public static int fact(int num){
    	
    	if(num==1) return 1;
    	else return fact(num-1) + fact (num-1);
    	
    	
    }
}
