class CharecterLinearSearch{
	public static char charecterSearch(char[] array, char c){
		int temp=0;
			for (int i=0;i<array.length ;i++ ) {
				if(array[i]==c){
					System.out.println(c+" is present at index "+i);
					temp+=1;
				}
			}
			if (temp==0) {
				System.out.println("charecter not found");
			}
			return 'c';
	}
	public static void main(String[] args) {
		char[] array={'a','e','i','o','u'};
		int ch=charecterSearch(array,'i');
	}
}