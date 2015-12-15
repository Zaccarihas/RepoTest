
public class U13_4_F�renkling {

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
		tal4.f�renkla();
		System.out.println("Det f�renklade tal4: "+tal4.toString());
	}

}

class RationelltTal{
	
	int t�ljare=0, n�mnare=1;
	
	public void set(int t,int n)
	{
		this.t�ljare = t; 
		this.n�mnare=(n==0?1:n);
		
	}
	
	public String toString(){
		return this.t�ljare+"/"+this.n�mnare;
	}
	
	public void f�renkla(){
		
		int rest;
		int t=this.t�ljare; int n = this.n�mnare;
		
		// Ber�kna den h�gsta gemensamma n�mnaren
		do{
			
			rest =t%n;
			if(rest!=0){ 
				t=n; 
				n=rest;
			}		
				
		}while(rest!=0);
			
		this.t�ljare /= n;
		this.n�mnare /= n;
	}
	
	
}