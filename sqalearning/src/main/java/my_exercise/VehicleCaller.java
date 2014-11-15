package my_exercise;

public class VehicleCaller {
	
	public static void main (String args[]){
		
		 Vehicle vehicle1 = new Vehicle();
		 
		 vehicle1.setColor("Black");
		 vehicle1.setMake("1975");
		 vehicle1.setModel("Ford");
		 
		 
		 
		  System.out.println("color is : "+vehicle1.getColor());
		  System.out.println("model is : "+vehicle1.getModel());
		  System.out.println("make is : "+vehicle1.getMake());

	}

}
