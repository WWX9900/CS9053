
public class BoxingWeightClass {

	public static String findWeightClass(float weight) {
		// this is really only valid for weights greater than 0.
		String light_flyweight = "light flyweight";
		String flyweight = "flyweight";
		String bantamweight = "bantamweight";
		String lightweight = "lightweight";
		String light_welterweight = "light welterweight";
		String welterweight = "welterweight";
		String middleweight = "middleweight";
		String Light_heavyweight = "Light heavyweight";
		String Heavyweight = "Heavyweight";
		String Super_heavyweight = "Super heavyweight";
		if(weight <= 0){
			return null;
		}
		if(weight <= 108){
			return light_flyweight;
		}
		if(weight <= 115){
			return flyweight;
		}
		if(weight <= 123){
			return bantamweight;
		}
		if(weight <= 132){
			return lightweight;
		}
		if(weight <= 141){
			return light_welterweight;
		}
		if(weight <= 152){
			return welterweight;
		}
		if(weight <= 165){
			return middleweight;
		}
		if(weight <= 178){
			return Light_heavyweight;
		}
		if(weight <= 201){
			return Heavyweight;
		}
		else{
			return Super_heavyweight;
		}
	}
	
	public static void main(String[] args) {
		
		/* you probably want to use user input for the
		 * income using Scanner because you will have to convert
		 * a command line argument to an float, and we haven't
		 * gotten to string parsing yet
		 * 
		 * But you can also just set the "weight" variable
		 * to whatever you want in the code, and that's fine too
		 */
		
		float weight = 179;
		String weightClass = findWeightClass(weight);
		
		// if the digits are greater than zero print this out:
		System.out.println("The weight class for the weight " + weight + " is " 
		+ weightClass);
	}
}
