
public class U13_6_Spelkort {
	
	public static void main(String[] args){
		
		Spelkort kort1 = new Spelkort();
		Spelkort kort2 = new Spelkort();
		
		kort2.f�rg = Spelkort.KL�VER;
		kort2.val�r = '7';
		
		kort1.f�rg = Spelkort.SPADER;
		kort1.val�r = 'D';
		
		System.out.println("Det f�rsta kortet �r "+kort1.toString());
		System.out.println("Det andra kortet �r "+kort2.toString());
	}
	
	

}

class Spelkort{
	char val�r;
	
	static final int KL�VER = 0;
	static final int RUTER = 1;
	static final int SPADER = 2;
	static final int HJ�RTER = 3;
	
	int f�rg = KL�VER;
	
	public String toString(){
		String temp;
		
		switch(this.f�rg){
		case KL�VER:
			temp = "Kl�ver "; break;
		case RUTER:
			temp = "Ruter "; break;
		case SPADER:
			temp = "Spader "; break;
		case HJ�RTER:
			temp = "Hj�rter "; break;
		default:
			temp = "Ok�nd "; break;
		}
		
		temp += val�r;
		
		return temp;
	}
}
