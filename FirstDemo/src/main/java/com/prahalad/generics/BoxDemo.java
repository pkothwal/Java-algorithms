package com.prahalad.generics;

import java.util.*;

public class BoxDemo {
	
	public static <U> void addBox(U u, List<Boxa<U>> boxes){
		Boxa<U> box = new Boxa<>();
		box.setT(u);
		boxes.add(box);
		
		
	}
	
	public static <U> void outputBoxes(List<Boxa<U>> boxes){
		
		int counter = 0;
		for(Boxa<U> box: boxes){
			U boxContents = box.getT();
			System.out.println("Box #" + counter + " contains [" +
		             boxContents.toString() + "]");
			counter++;
		}
	}
	
	public static void main(String...args){
		
		ArrayList<Boxa<Integer>> listOfIntegers = new ArrayList<Boxa<Integer>>();
		BoxDemo.addBox(10, listOfIntegers);
		BoxDemo.addBox(20, listOfIntegers);
		BoxDemo.outputBoxes(listOfIntegers);
	}

}
