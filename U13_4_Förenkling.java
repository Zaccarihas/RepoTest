
public class U13_4_Förenkling {

	public static void main(String[] args)
	{
		RationelltTal tal1 = new RationelltTal();
		RationelltTal tal2 = new RationelltTal();
		RationelltTal tal3 = new RationelltTal();
		RationelltTal tal4 = new RationelltTal();
		
		tal1.set(5, 9);
		tal2.set(1, 3);
		tal3.set(7, 12);
		tal4.set(128,200);
		
		System.out.println("Tal 1: "+tal1.toString());
		System.out.println("Tal 2: "+tal2.toString());
		System.out.println("Tal 3: "+tal3.toString());
		System.out.println("Tal 4: "+tal4.toString());
		tal4.förenkla();
		System.out.println("Det förenklade tal4: "+tal4.toString());
	}

}

class RationelltTal{
	
	int täljare=0, nämnare=1;
	
	public void set(int t,int n)
	{
		this.täljare = t; 
		this.nämnare=(n==0?1:n);
		
	}
	
	public String toString(){
		return this.täljare+"/"+this.nämnare;
	}
	
	public void förenkla(){
		
		int rest;
		int t=this.täljare; int n = this.nämnare;
		
		// Beräkna den högsta gemensamma nämnaren
		do{
			
			rest =t%n;
			if(rest!=0){ 
				t=n; 
				n=rest;
			}		
				
		}while(rest!=0);
			
		this.täljare /= n;
		this.nämnare /= n;
	}
	
	
}