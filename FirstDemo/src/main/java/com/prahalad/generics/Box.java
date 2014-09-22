package com.prahalad.generics;

public class Box<T> {
	
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	public <U extends String> void inspect(U u){
		
	
		
		System.out.println("T : " + t.getClass().getName());
		System.out.println("U : " + u.getClass().getName());
	}
	
	public static void main(String...args){
		
		Box<Integer> bx = new Box<Integer>();
		bx.setT(10);
		bx.inspect("Prahalad");
		
		
		
	}

}
