class StringLinearSearch{
	public static String stringSearch(String[] array,String search){
		int temp=0;
		for (int i=0;i<array.length ;i++ ) {
			if (array[i].equals(search)) {
				System.out.println(search+" is placed at index of "+i);
				temp+=1;
			}
		}
		if (temp==0) {
			System.out.println("String not found");
		}
	
	return "array not found";
	}
	public static void main(String[] args) {
		String[] array={"Ahmed","Usama","Imtiaz","Waqar","Uzair"};
		String s=stringSearch(array,"Imtiaz");
	}
}