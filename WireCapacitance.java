
public class WireCapacitance {

	public static double calculateWireCapacitance(double wirelength, double wireradius,
	 double initialdistance, double finaldistance ) {
		double absolutePermittivity = 8.85E-12;
		double topresult = Math.PI * absolutePermittivity * wirelength;
		double bottomresultinitial = Math.log(initialdistance/(2*wireradius)+
				Math.sqrt((Math.pow(initialdistance,2)/(4*Math.pow(wireradius,2)))-1));
		double c1 = topresult/bottomresultinitial;
		double bottomresultfinal = Math.log(finaldistance/(2*wireradius)+
		Math.sqrt((Math.pow(finaldistance,2)/(4*Math.pow(wireradius,2)))-1));
		double c2 = topresult/bottomresultfinal;
		return c2-c1;
	}
	
	public static void main(String[] args) {
		double initialdistance = .01;
		double finaldistance = .005;
		double wirelength = 0.5;
		double wireradius = .002053;
		double difference = calculateWireCapacitance(wirelength, wireradius, initialdistance, finaldistance);
		System.out.println("difference is " + difference);
	}
}
