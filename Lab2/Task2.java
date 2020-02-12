import java.util.Arrays;
class Task2{
	public static void main(String[] args) {
		//declaring and initializing different arrays
		int[] array1={2,4,6,8,10};
		int[] array2={1,3,5,7,9};
		int[] array3={1,3,5,7,9};
		int[] array4={2,4,6,8,10};
		char[] array5={'a','b','c','d'};
		//comparing all these arrays if they are equal return will be true else false
		System.out.println("Checking of Arrays are equal or not :");
		System.out.println("Is array1 and array2 are equal :"+Arrays.equals(array1,array2));
		System.out.println("Is array1 and array3 are equal :"+Arrays.equals(array1,array3));
		System.out.println("Is array2 and array3 are equal :"+Arrays.equals(array2,array3));
		System.out.println("Is array1 and array4 are equal :"+Arrays.equals(array1,array4));
		System.out.println("Is array4 and array5 are equal :"+Arrays.equals(array1,array3));
		
		
			
	}
}