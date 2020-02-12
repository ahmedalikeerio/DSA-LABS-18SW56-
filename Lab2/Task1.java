import java.util.Arrays;
class Task1{
	public static void main(String[] args) {
		int[] array=new int[100];
		int element=0;
		int fill=0;
		while(element<100){
			array[element]=fill;
			element++;
			fill++;
		}
		System.out.println(Arrays.toString(array));
	}
}