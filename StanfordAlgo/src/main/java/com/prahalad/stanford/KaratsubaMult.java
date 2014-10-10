package com.prahalad.stanford;

public class KaratsubaMult {

	 String aStr;
	 String bStr;
	 
	 int aLen ;
	 int bLen;
	 
	 int pow1 =1 , pow2 =1;
	 
	 int a,b,c,d;
	 
	
	 public int katMult(Integer a1, Integer b1){
		 
		System.out.println("Calling a1 :" + a1 + " Calling b1 : " + b1);
		 aStr = a1.toString();
		 bStr = b1.toString();
		 
		 aLen = aStr.length();
		 bLen = bStr.length();
		 
		 
	if (aLen < 4 || bLen < 4 ) return (Integer.parseInt(aStr) * Integer.parseInt(bStr));
//	if (bLen ==  1 ) return (Integer.parseInt(aStr) * Integer.parseInt(bStr));
	
	
			pow1 = (int) Math.pow(10.0,aLen);
			pow2 = (int) Math.pow(10.0, aLen/2);
			
			
	
	/*	 for(int i =0;i<aLen;i++){
			 pow1 = pow1 * 10;
		 }
		 
		 for(int j =0;j<aLen/2;j++){
			 
			 pow2 = pow2 * 10;
		 }
		 
		 */
		 
		 System.out.println("pow 1 :" + pow1 + " pow 2 :" + pow2);
		 aLen = aLen /2;
		 bLen = bLen /2;
		 
		 a = Integer.parseInt(aStr.substring(0, aLen));
		 b = Integer.parseInt(aStr.substring(aLen, aStr.length()));
		 c = Integer.parseInt(bStr.substring(0, bLen));
		 d = Integer.parseInt(bStr.substring(bLen, bStr.length()));
		
		 System.out.println("a :" + a + " b :" + b + " c :" + c + " d : " + d);
		 return ((pow1 * katMult(a, c)) + (pow2  * ((katMult(a, d) + (katMult(b, c))))) + katMult(b, d));
		 
	 
	 }
	 
	 
	 
	 
	 
	
	public static void main(String...OMSHIV){
		
	KaratsubaMult ks = new KaratsubaMult();
		
	System.out.println(ks.katMult(3456, 4568));
		
		
		
		
		
	}

}
