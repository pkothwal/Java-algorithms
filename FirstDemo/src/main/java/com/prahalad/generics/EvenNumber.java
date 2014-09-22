package com.prahalad.generics;

public class EvenNumber<T extends Integer> {
	
	T n;

	public EvenNumber(T n) {
		
		this.n = n;
	}
	
	public boolean checkEven(){
		
		return n.intValue() % 2 == 0;
}
	
	public static void main(String...args){
		
		EvenNumber<Integer> in = new EvenNumber<Integer>(4);
		
		System.out.println(in.checkEven());
	}
	
	

}
