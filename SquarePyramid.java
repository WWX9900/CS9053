
public class SquarePyramid {
	private static int nextId = 0;
    private int id;
    private double side;
    private double height;
    public SquarePyramid(){
        this.id = SquarePyramid.nextId;
        SquarePyramid.nextId++;
    }
    public SquarePyramid(double side, double height){
        this.side = side;
        this.height = height;
    }
    public double getSide(){
        return this.side;
    }
    public void setSide(double side){
        this.side = side;
    }
    public double getHeight(){
        return this.height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getVolumn(){
        return (1.0/3)*side*side*height;
    }
    public double getSurfaceArea(){
        return side*side+
        2*side*Math.sqrt(side*side/4.0+height*height);
    }
    public int getID(){
        return this.id;
    }

}
