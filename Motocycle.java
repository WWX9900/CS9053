package vehicles;

import java.util.Arrays;

public class Motocycle extends Vehicles{
    private String[] accessories;

    public Motocycle(){
        super();
    }
    // public Motocycle(String[] accessories){
    //     super(2,0,"white");
    //     this.accessories = accessories;
    // }
    public Motocycle(String[] accessories, int wheels, double space, String color){
        super(wheels,space,color);
        this.accessories = accessories;
    }
    //set the accessories
    public void setaccessories(String[] accessories){
        this.accessories = accessories;
    }
    //get what accessories the motocycle has
    public String[] getaccessories(){
        return accessories;
    }
    public String toString(){
        return '\n'+"Motocycle "+ '\n' + super.toString() + '\n'+ "has accessories "+Arrays.toString(accessories)+'\n';
    }
    public String TwistThrottle(){
        return "accelerating";
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
        Motocycle other = (Motocycle) o;
        if(!accessories.equals(other.accessories)){
            return false;
        }
        else{
            return true;
        }
    }

    public static void main(String[] args){
        //default m1
        Motocycle m1= new Motocycle();
        System.out.println(m1.toString());
        //m2 with accessories
        // String[] s1 = new String[]{"helmet clip","grip warmers","usb charger"};
        // Motocycle m2= new Motocycle(s1);
        // // System.out.println("m2 has these accessories: "+ Arrays.toString(s1));
        // System.out.println(m2.toString());
        //m3 with different cargo space and color
        String[] s2 = new String[]{"light","grip warmers","map"};
        Motocycle m3 = new Motocycle(s2, 2, 4.0, "red");
        System.out.println(m3.toString());
    }
}
