package vehicles;
public class Car extends Vehicles{
    private int door;
    public Car(){
        super();
    }
    
    public Car(int door, int wheels, double space, String color){
        super(wheels,space,color);
        this.door = door;
    }
    public void setdoornum(int door){
        this.door = door;
    }
    public int getdoornum(){
        return door;
    }
    public String PressGasPedal(){
        return "accelerating";
    }
    public String toString(){
        return '\n'+"Car "+ '\n' + super.toString() + '\n'+ "has "+this.door + " doors"+'\n';
    }
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if(!super.equals(o)){
            return false;
        }
        if(getClass() != o.getClass()){
            return false;
        }
        Car other = (Car) o;
        if(door != other.door){
            return false;
        }
        else{
            return true;
        }
    }
    public static void main(String[] args){
        //default constructor for c1
        Car c1 = new Car();
        System.out.println(c1.toString());
        //car with 4 doors and default characteristic
        // Car c2 = new Car(4);
        // System.out.println(c2.toString());
        //car3 with 2 doors, 4 wheels, 7liters cargo space and yellow color
        Car c2 = new Car(2,4, 7, "yellow");
        System.out.println(c2.toString());
    }
}