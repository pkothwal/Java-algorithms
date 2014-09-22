package com.prahalad.generics;

import java.util.Arrays;
import java.util.List;

public class PrintUnbound {
	
	public static void PrintList(List<?> l ){
		
		for(Object k:l){
			
			System.out.println("element is :" + k);
		}
		
	}
	
	public static void main(String...args){
		
		List<Integer> li = Arrays.asList(1,2,3);
		
		PrintUnbound.PrintList(li);
		
		List<String> str = Arrays.asList("Prahalad","Kothwal","India");
		PrintUnbound.PrintList(str);
	}
	

}
