package thisoverloading;

public class Car {
	
	String company ="����";
	String model;
	String color;
	int maxspeed;
	
	
	Car(){
		
	}
    Car(String model){
    	this(model,"����",250);
		
	}
    Car(String model,String color){
    	this(model,color,250);
    	
    }
    Car(String model,String color,int maxspeed){
    	this.model = model;
    	this.color = color;
    	this.maxspeed = maxspeed;
}
}
