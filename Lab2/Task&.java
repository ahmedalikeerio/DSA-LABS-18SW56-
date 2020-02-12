import java.util.*;
public class SeventhTask{

	public static void main(String[] args) {
		
		int[] array = {10, 10, 30, 20, 20, 70,10,90};
		int temp;
		System.out.println("Given Array: " + Arrays.toString(array));
		int count=1;
		for( int x=0; x<array.length; x++ ){
			temp = array[x];
			for( int y=x+1; y<array.length; y++ ){
				if(array[x] == array[y]){
					for(int a=y; a<array.length-1; a++){
						array[a] = array[a+1];
					}
				}
			}
		}

		for(int i=0; i<array.length-1; i++){
			if( array[i] == array[i+1] ){
				break;
			}else{
				count++;
			}
		}
		System.out.println(Arrays.toString(array));
		System.out.println("Length Of new Array is " + count );
	
	}
}