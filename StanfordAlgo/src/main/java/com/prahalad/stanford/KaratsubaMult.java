package com.prahalad.stanford;

public class KaratsubaMult {

	 String aStr;
	 String bStr;
	 
	 int aLen ;
	 int bLen;
	 
	 int pow1 =1 , pow2 =1;
	 
	 int a,b,c,d;
	 
	
	 public int katMult(Integer a1, Integer b1){
		 
		
		 aStr = a1.toString();
		 bStr = b1.toString();
		 
		 aLen = aStr.length();
		 bLen = bStr.length();
		 
		 
	if (aLen < 4 || bLen < 4 ) return (Integer.parseInt(aStr) * Integer.parseInt(bStr));
	
	
			pow1 = (int) Math.pow(10.0,aLen);
			pow2 = (int) Math.pow(10.0, aLen/2);
			
		 

		 aLen = aLen /2;
		 bLen = bLen /2;
		 
		 a = Integer.parseInt(aStr.substring(0, aLen));
		 b = Integer.parseInt(aStr.substring(aLen, aStr.length()));
		 c = Integer.parseInt(bStr.substring(0, bLen));
		 d = Integer.parseInt(bStr.substring(bLen, bStr.length()));
		 
		 return ((pow1 * katMult(a, c)) + (pow2  * ((katMult(a, d) + (katMult(b, c))))) + katMult(b, d));
 
	 
	 }
	 
	 
	 
	 
	 
	
	public static void main(String...OMSHIV){
		
	KaratsubaMult ks = new KaratsubaMult();
		
	System.out.println(ks.katMult(2345, 4567));
		
		
		
		
		
	}

}
