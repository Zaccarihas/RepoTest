
public class U13_5_Koordinater {
	
	public static void main(String[] args)
	{
		
		RPunkt p1 = new RPunkt();
		RPunkt p2 = new RPunkt();
		
		p1.r=10; p1.t=2.1;
		p2.r=12; p2.t=1.456;
		
		System.out.println("Den första punkten ("+p1.toString()+") motsvarar "+p1.polär().toString()+" med polära koordinater!");;
		System.out.println("Den andra punkten ("+p2.toString()+") motsvarar "+p2.polär().toString()+" med polära koordinater!");;
	}

}

class Punkt{
	
	public double x=0,y=0;
	
	public String toString(){
		
		return this.x+":"+this.y;
	}
	
}

class RPunkt{
	
	double r,t;
	
	public String toString(){
		return this.r+">"+this.t+" rad";
	}
	public Punkt polär(){
		
		Punkt p = new Punkt();
		p.x = this.r*Math.cos(t);
		p.y = this.r*Math.sin(t);
		return p;
		
	}
	
}
