package vehicles;


public class Vehicles {
	private static int next_id;
	private int id;
	private int wheels;
	private double space;
	private String color = null;
	public Vehicles(){
		this.id = Vehicles.next_id;
		Vehicles.next_id++;
	}
	public Vehicles(int wheels, double space, String color){
		this();
		this.wheels = wheels;
		this.space = space;
		this.color =color;
		// this.id = Inheritance.next_id;
		// Inheritance.next_id++;
	}
	//set the number of wheels 
	public void setnumofwheels(int wheels){
		this.wheels = wheels;
	}
	//get the number of wheels of the vehicle
	public int getnumberofwheels(){
		return wheels;
	}
	//set the number of cargo space
	public void setspace(double space){
		this.space = space;
	}
	//get the cargo space of the vehicle
	public double getspace(){
		return space;
	}
	//set the color of the vehicle
	public void setcolor(String color){
		this.color = color;
	}
	//get the color
	public String getcolor(){
		return color;
	}
	//get id 
	public int getId(){
		return id;
	}
	public String toString(){
		return "the number of wheels is " + this.wheels + '\n' + "the cargo space is " + this.space+
		'\n'+ "the color is " + this.color+'\n'+ "id = "+ this.getId();
	}
	public boolean equals(Object o){
		if(this == o){
			return true;
		}
		if(o == null){
			return false;
		}
		Vehicles other = (Vehicles) o;
		
		if(wheels != other.wheels){
			return false;
		}
		if(space != other.space){
			return false;
		}
		if(color == null && other.color != null){
			return false;
		}
		if(!color.equals(other.color)){
			return false;
		}
		else{
			return true;
		}
	}
}