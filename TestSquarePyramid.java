public class TestSquarePyramid {
    public static void main(String[] args){
        SquarePyramid p1 = new SquarePyramid(2,3);
        System.out.println("Pyramid1 has side " + p1.getSide()+'\n'+
        "pyramid has height " + p1.getHeight()+'\n'+ "pyramid1 has volumn "+ p1.getVolumn()
        +'\n'+"pyramid1 has surface area " + p1.getSurfaceArea());

        changesideheight(p1, 3, 3);
        System.out.println("Pyramid1 has side " + p1.getSide()+'\n'+
        "Pyramid1 has height " + p1.getHeight()+ '\n' + "Pyramid1 has volumn " + p1.getVolumn()+
        '\n' + "Pyramid1 has surfacearea " + p1.getSurfaceArea());
    }
    public static void changesideheight(SquarePyramid p, double newside, double newheight){
        p.setHeight(newheight);
        p.setSide(newside);
    }
}
