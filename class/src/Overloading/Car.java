package Overloading;

public class Car {//생성자 Overloading
	
	String company = "현대 자동차";
	String model;
	String color;
	int maxspeed;
	
	Car(){
		
	}
	Car(String model){
		this.model = model;
	}
    Car(String model, String color){
    	this.model = model;
    	this.color = color;
	}
    Car(String model, String color, int maxspeed){
    	this.model = model;
    	this.color = color;
    	this.maxspeed = maxspeed;
   	}
	

}
