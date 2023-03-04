
public class LoopSum {
	public static double factorial(int n){
		if (n <= 1){
	  	return 1;
		}
		else{
	  	return n * factorial(n - 1);
		}
	}
	public static void main(String[] args){
	int z = 15;
	for (int i = 0; i <= z; i++){
		double diff = 0;
		double sum = 0;
		int k = 0;
		do{
			sum += (Math.pow(i, k) / factorial(k));
	   		diff = Math.abs(Math.pow(Math.E,i) - sum);
			k ++;
		} while (diff >= 0.001);
		System.out.println("e^" + i + " is " + Math.pow(Math.E,i));
	  	System.out.println("result for " + k + " iterations: " + sum);
	  	System.out.println("it requires " + k + " iterations to estimate e^" + i + " within .001");
	}
}
}


