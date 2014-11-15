package my_exercise;

public abstract class Exercise17Shape {
	
	private String name;

	public String Shape(String name) {
		return name;
	}
	
	public String getName(String name) {
		this.name = name;
		return name;
	}
	
	abstract Double getArea();
	

}
