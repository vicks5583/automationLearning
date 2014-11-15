package my_exercise;
/*
Create a class Vehicle
Define attributes of the Vehicle class (color, model, make)
Define methods in a Class (getter and setter)
Create an object of a class in separate class (VehicleCaller)
Set the object properties by calling object setter
Invoke the main method and print properties using getter*/

public class Vehicle {
	
	private String color;
	private String model;
	private String make;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	
	

}
