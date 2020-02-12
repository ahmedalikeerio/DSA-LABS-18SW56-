import java.util.*;
public class Task5{
	
	public static int secondLargestIndex(int[] array){
		int[] tempArray = array;
		for(int x=array.length; x>=1; x--){
			for(int y=0; y<x-1; y++ ){
				if( array[y] > array[y+1] ){
					int temp = array[y];
					array[y] = array[y+1];
					array[y+1] = temp; 
				}
			}
		}

		return array.length-2;
	}

	public static void main(String[] args) {
		int[] array = {100,56,70,412,678};
		System.out.println(Arrays.toString(array));
		System.out.println("secondLargestIndex: " + secondLargestIndex(array));

	}
} 