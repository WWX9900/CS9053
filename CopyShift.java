
public class CopyShift {

	public static void copyShift(int[] sourceArray, int[] destArray, int shift) {
		//[4,6,3,1,7,5]shift2
		//[7,5,4,6,3,1]
		shift = shift % sourceArray.length;
		int indexdivide = sourceArray.length - shift;
		for(int i = 0; i < indexdivide;i++){
			destArray[i+shift] = sourceArray[i];
		}
		for(int j = 0; j < shift;j++){
			destArray[j] = sourceArray[indexdivide+j];
		}
		for(int e: sourceArray){
			System.out.println(e);
		}
		System.out.println("new array");
		for(int e: destArray){
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		
		int[] sourceArray = new int[50];
		int[] destArray = new int[50];
		
		// /* initialize the source Array */
		for (int i = 0;i < sourceArray.length; i++) {
			sourceArray[i] = (int)(Math.random()*100);
		}
		
		int shiftValue = 3;
		copyShift(sourceArray, destArray, shiftValue);
		
		/* destArray should have the contents of sourceArray
		 * but in shifted over "shiftValue" values
		 * if sourceArray has the contents [1,5,6,7,9] and we want to shift it 
		 * 3 spaces over, destArray should have the contents [6,7,9,1,5].
		 * 
		 * It should work for arbitrarily large values of shift
		 */
	}
}
