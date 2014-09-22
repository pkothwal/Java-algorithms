package com.prahalad.generics;

public class Pair<K, V> {
	
	private K key;
	private V value;
	
	public Pair(K key, V value) {
		
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}
	
	
	public static void main(String...args){
		
		Pair<Integer,String> p1 = new Pair<Integer, String>(1, "Apple");
		Pair<Integer, String> p2 = new Pair<Integer, String>(2, "Orange");
		
		boolean result = new Util().compare(p1, p2);
		
		System.out.println("The Result is : " + result);
		
		
		
		
	}
	

}
