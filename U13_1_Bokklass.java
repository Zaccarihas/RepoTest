
public class U13_1_Bokklass {
	
	public static void main(String[] args)
	{
		Bok l�robok = new Bok();
		l�robok.titel = "Java steg f�r steg";
		l�robok.f�rfattare = "Jan Skansholm";
		l�robok.sidor = 501;
		l�robok.pris = 400;
		
		
		Bok annanbok = new Bok();
		annanbok.titel = "Turbov�gen till Pascal";
		annanbok.f�rfattare = "Nord";
		annanbok.sidor = 350;
		annanbok.pris = 189;
		
		skrivUtBok(l�robok);
		skrivUtBok(annanbok);
		
		
	}
	
	static void skrivUtBok(Bok enBok){
		
		System.out.println("\nBokens f�rfattare: "+enBok.f�rfattare);
		System.out.println("Bokens titel: "+enBok.titel);
		System.out.println("Bokens antal sidor: "+enBok.sidor);
		System.out.println("Bokens pris: "+enBok.pris);
		
	}

}

class Bok {
	
	String f�rfattare;
	String titel;
	int sidor;
	double pris;
	
}
