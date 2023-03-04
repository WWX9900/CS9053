package vehicles;

public class Bicycle extends Vehicles {
    private boolean electric = true;
    public Bicycle(){
        super();
    }
    // public Bicycle(boolean electric){
    //     super(2,0,"gray");
    //     this.electric = electric;
    // }
    public Bicycle(boolean electric,int wheels, double space, String color){
        super(wheels,space,color);
        this.electric = electric;
    }
    public void setelectricornot(boolean electric){
        this.electric = electric;
    }
    public boolean getelectric(){
        return this.electric;
    }
    public String Pedal(){
        return "pedaling";
    }
    public String toString(){
        return '\n'+"Bicycle "+ '\n' + super.toString() + '\n'+ "is electric: "+ this.electric+'\n';
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
        Bicycle other = (Bicycle) o;
        if(electric != other.electric){
            return false;
        }
        else{
            return true;
        }
    }
    public static void main(String[] args){
        Bicycle b1 = new Bicycle();
        System.out.println(b1.toString());
        // Bicycle b2 = new Bicycle(false);
        // System.out.println(b2.toString());
        Bicycle b3 = new Bicycle(false,2,0,"orange");
        System.out.println(b3.toString());
    }
}
