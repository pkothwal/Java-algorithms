package com.prahalad.enums;

public class EnumTest {
	
	Day day;

	public EnumTest(Day day) {
	
		this.day = day;
	}
	
	
	public void getDay(){
		
		for(Day d : Day.values()){
			
			System.out.println("This is :" + d);
			
			}
		
		switch(day){
		
		case MONDAY :
			System.out.println("WOW its Monday");
			break;
			
		case TUESDAY :
			System.out.println("Tuesday's are happening");
			break;
		case WEDNESDAY :
			
			System.out.println("Finally its there !!");
			break;
		case FRIDAY:
			System.out.println("don't get firied today !!");
			break;
		case SATURDAY:
			System.out.println("Saturday night full tite !!");
			break;
		case SUNDAY:
			System.out.println("Finally its there !!");
			break;
		case THURSDAY:
			System.out.println("Hey Thrush is here !");
			break;
		default:
			System.out.println("Please specify valid daY Sole!");
			break;
			
		
			
		}
	}
	
	public static void main(String...wow){
		
		EnumTest em = new EnumTest(Day.MONDAY);
		em.getDay();
		EnumTest ea = new EnumTest(Day.FRIDAY);
		ea.getDay();
		
		
		
	}
	

}
