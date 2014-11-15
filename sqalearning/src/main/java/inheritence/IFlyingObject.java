package inheritence;

/*Exercise 14: 
• Create an interface FlyingObject 
• Declare the property int maxSpeed = 400, int 
maxAltitude = 20000.  
• Declare the methods of flying object takeOff(), 
land(), capacity(), flyHigh() 
• Create 2 classes which implements the 
Interface. • Caller should create the objects of both the 
classes. Caller should call a “operate” method 
that should keep on calling flyHigh() method 
till maxAltitude is not reached. Once 
maxAltitude is reached, land() method should 
be called. */

public interface IFlyingObject {

	String maxSpeed = "250 miles per seconds";
	String maxAltitude = "1000 meters";
	
	boolean isTakeOff();
	boolean isLanded();
	int capacity();
	boolean flyHigh();
}
