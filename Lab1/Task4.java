class Courier{
	private int poids;
	private boolean isExpress;
	private String adress;
	private boolean isNotValid;

	Courier(int poids,boolean isExpress,String adress){
		this.poids=poids;
		this.isExpress=isExpress;
		this.adress=adress;
	}
	public String isExpress(){
		return "true";
	}
	public double affranchirCouirier(){
		return 1.0;
	}
	public void afficher(){
		System.out.println("Afficher method of Courier class");
	}

}
class Publicate extends Courier{
	private double prix;

	Publicate(int poids,boolean isExpress,String adress){
		super(poids,isExpress,adress);
	}
	double getPrix(){
		return prix;
	}
	public void afficher(){
		System.out.println("Afficher methpod of Publicate");
	}
	public double affranchirCouirier(){
		return 1.1;
	}

}
class Lettre extends Courier{
	private String format;
	private double prix=0;

	Lettre(int poids,boolean isExpress,String adress,String format){
		super(poids,isExpress,adress);
		this.format=format;
	}
	double getPrix(){
		return prix;
	}
	public void afficher(){
		System.out.println("Afficher method of Lettre class");
	}
	public double affranchirCouirier(){
		return 1.2;
	}
}
class Colis extends Courier{
	 private double volume;
	private double prix;

	Colis(int poids,boolean isExpress, String adress,int volume){
		super(poids,isExpress,adress);
		this.volume=volume;
	}
	double getPrix(){
		return prix;
	}
	public void afficher(){
		System.out.println("Afficher method of Colis class");
	}
	public double affracnhirCouirier(){
		return 1.3;
	}
}
class Task4{
	public static void main(String[] args) {
		Colis c1=new Colis(1,true,"Kandiaro,sindh",10);
		System.out.println("Prix="+c1.getPrix());
		
	}
}