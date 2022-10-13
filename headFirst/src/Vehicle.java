class Vehicle
{
	String type="4W";
	int maxSpeed =100;
	Vehicle(String type,int maxSpeed)
	{
		this.type=type;
		this.maxSpeed = maxSpeed;
	}
	Vehicle(){}
}
class Car extends Vehicle
{
	String trans;
	Car(String trans)
	{
		this.trans = trans;
	}
	Car(String type,int maxSpeed, String trans)
	{}
}