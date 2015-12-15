
public class U13_6_Spelkort {
	
	public static void main(String[] args){
		
		Spelkort kort1 = new Spelkort();
		Spelkort kort2 = new Spelkort();
		
		kort2.färg = Spelkort.KLÖVER;
		kort2.valör = '7';
		
		kort1.färg = Spelkort.SPADER;
		kort1.valör = 'D';
		
		System.out.println("Det första kortet är "+kort1.toString());
		System.out.println("Det andra kortet är "+kort2.toString());
	}
	
	

}

class Spelkort{
	char valör;
	
	static final int KLÖVER = 0;
	static final int RUTER = 1;
	static final int SPADER = 2;
	static final int HJÄRTER = 3;
	
	int färg = KLÖVER;
	
	public String toString(){
		String temp;
		
		switch(this.färg){
		case KLÖVER:
			temp = "Klöver "; break;
		case RUTER:
			temp = "Ruter "; break;
		case SPADER:
			temp = "Spader "; break;
		case HJÄRTER:
			temp = "Hjärter "; break;
		default:
			temp = "Okänd "; break;
		}
		
		temp += valör;
		
		return temp;
	}
}
