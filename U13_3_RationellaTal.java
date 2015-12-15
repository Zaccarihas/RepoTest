
public class U13_3_RationellaTal {
	
	public static void main(String[] args)
	{
		RatTal tal1 = new RatTal();
		RatTal tal2 = new RatTal();
		RatTal tal3 = new RatTal();
		
		tal1.set(5, 9);
		tal2.set(1, 3);
		tal3.set(7, 12);
		
		System.out.println("Tal 1: "+tal1.toString());
		System.out.println("Tal 2: "+tal2.toString());
		System.out.println("Tal 3: "+tal3.toString());
	}

}

class RatTal{
	
	int täljare=0, nämnare=1;
	
	public void set(int t,int n)
	{
		this.täljare = t; 
		this.nämnare=(n==0?1:n);
		
	}
	
	public String toString(){
		return this.täljare+"/"+this.nämnare;
	}
	
	
}
