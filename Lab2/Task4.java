public class Task4{

	static double returnAverage(double[] array){
		double sum = 0.0;
		for(int x=0; x<array.length; x++){
			sum+=array[x];
		}

		return sum/array.length;
	}

	public static void main(String[] args) {
		
		double[] array = {8.0,11.3,10.0};
		System.out.println("Average is: " +returnAverage(array));

	}
}