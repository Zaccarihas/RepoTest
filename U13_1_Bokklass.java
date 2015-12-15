
public class U13_1_Bokklass {
	
	public static void main(String[] args)
	{
		Bok lärobok = new Bok();
		lärobok.titel = "Java steg för steg";
		lärobok.författare = "Jan Skansholm";
		lärobok.sidor = 501;
		lärobok.pris = 400;
		
		
		Bok annanbok = new Bok();
		annanbok.titel = "Turbovägen till Pascal";
		annanbok.författare = "Nord";
		annanbok.sidor = 350;
		annanbok.pris = 189;
		
		skrivUtBok(lärobok);
		skrivUtBok(annanbok);
		
		
	}
	
	static void skrivUtBok(Bok enBok){
		
		System.out.println("\nBokens författare: "+enBok.författare);
		System.out.println("Bokens titel: "+enBok.titel);
		System.out.println("Bokens antal sidor: "+enBok.sidor);
		System.out.println("Bokens pris: "+enBok.pris);
		
	}

}

class Bok {
	
	String författare;
	String titel;
	int sidor;
	double pris;
	
}
