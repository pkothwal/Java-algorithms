package com.prahalad;

import java.util.Iterator;

public class EvenNumber {
	
	
	private final static int SIZE = 30;
	private int[] intArray = new int[SIZE];
	
	
	public EvenNumber(){
		
		for(int i=0;i<SIZE;i++){
			intArray[i] = i;
			
			}
		}
	
	public void printEven(){
		
		DataIterator di = new EvenIterator();
		while(di.hasNext()){
			System.out.print( " " + di.next());
		}
	
		
	}
	
	
	interface DataIterator extends Iterator<Integer>{}
	
	
	class EvenIterator implements DataIterator{
		
		private int compSize = 0;
		private int arrayIndex;

		@Override
		public boolean hasNext() {
			
			return (compSize <= SIZE-1);
		}

		@Override
		public Integer next() {
			
			arrayIndex = compSize;
			compSize+=2;
			return(intArray[arrayIndex]);
			
		}

		@Override
		public void remove() {
			// TODO Auto-generated method stub
			
		}
		
		
	}
	
	
	
	

}
