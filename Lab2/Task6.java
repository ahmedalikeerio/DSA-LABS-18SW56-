import java.util.*;
public class Task6{

	public static void main(String[] args) {
		
		int[][] matrixArray = {{18,0,6,9,10},{23,19, 7, 42, 5},{20, 8, 33, 100, 4},{110, 4, 56, 52, 8},{80, 74, 82, 70, 2}};
			
		for( int a=0; a<matrixArray.length; a++ ){
			for(int x=0; x<matrixArray.length; x++){
				for(int y=0; y<matrixArray.length-(x+1); y++){
					if( matrixArray[a][y] > matrixArray[a][y+1] ){
						int temp = matrixArray[a][y];
						matrixArray[a][y] = matrixArray[a][y+1];
						matrixArray[a][y+1] = temp;
					}

				}
			}
		}
		
		for( int x=0; x<matrixArray.length; x++){ 
			System.out.println(Arrays.toString(matrixArray[x]));
		}

	}
}