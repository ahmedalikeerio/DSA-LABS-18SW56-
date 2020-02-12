import java.util.Arrays;
class Task3{
	public static void printArray(double[] args){
		for(int i=0;i<args.length;i++){
			System.out.println(args[i]);
		}
	}
	public static void main(String[] args) {
		double[] array={1.1,4.1,3.1,2.1};
		double[] unsort={2.2,3.2,4.2,5.1,6.1};
		double[] array1={1.0,2.0,3.0,4.0,5.0};
		double[] dest=new double[10];

		//use sort method
		Arrays.sort(array);
		// use length method
		System.out.println("Length of Array :"+array.length);
		//Binary search method
		System.out.println("Binary search of element 4.1 :"+Arrays.binarySearch(array,4.1));
		//copyOf method for copying elements
		double[] arraycopy=Arrays.copyOf(array,9);
		//print copyOf array
		System.out.println("Copy of array printed ");
		printArray(arraycopy);
		//copy of range
		System.out.println("copy into range");
		double[] copyintorange=Arrays.copyOfRange(array1,0,10);
		printArray(copyintorange);
		//checking equality of arrays
		System.out.println("Array1 and array2 are equal or not?: "+Arrays.equals(array,array1));
		// fill method
		Arrays.fill(array1,3.0);
		printArray(array1);
		//sorting of Array
		Arrays.sort(unsort,2,4);
		printArray(unsort);
		// toString method
		System.out.println(Arrays.toString(unsort));
	}
}