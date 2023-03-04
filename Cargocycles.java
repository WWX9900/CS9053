package vehicles;

public class Cargocycles extends Bicycle{
    private int numwheel;
    private double space;
    public Cargocycles(){
        super();
    }
    public Cargocycles(boolean electric,int numwheel, double space, String color){
        super(electric,numwheel,space,color);
        this.numwheel = numwheel;
        this.space = space;
    }
    public void setwheel(int numwheel){
        this.numwheel = numwheel;
    }
    public int getnumwheel(){
        return numwheel;
    }
    public boolean electric(){
        return this.getelectric();
    }
    public String getpedal(){
        return this.getpedal();
    }
    public String toString(){
        return '\n'+"Cargocycles "+ '\n' + super.toString();
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
        Cargocycles other = (Cargocycles) o;
        if(numwheel != other.numwheel){
            return false;
        }
        if(space != other.space){
            return false;
        }
        else{
            return true;
        }
    }
    public static void main(String[] args){
        Cargocycles cargo1 = new Cargocycles();
        System.out.println(cargo1.toString());
        Cargocycles cargo2 = new Cargocycles(false,1,3,"blue");
        System.out.println(cargo2.toString());
    }
}
