
public class U13_2_Positioner {
	
	public static void main(String[] args){
		
		GlobalPosition g�teborg = new GlobalPosition();
		g�teborg.latGrad = 57;
		g�teborg.latMin= 39;
		g�teborg.latSek = 47;
		g�teborg.latRikt = true;
		g�teborg.longGrad = 12;
		g�teborg.longMin= 16;
		g�teborg.longSek = 58;
		g�teborg.longRikt = true;
		
		GlobalPosition polcirkel = new GlobalPosition();
		polcirkel.update(true, (byte)69, (byte)10, (byte)0, true, (byte)130, (byte)54, (byte)10);
		
		System.out.println("Landvetters globala position �r: "+g�teborg.latString()+" "+g�teborg.longString());
		System.out.println("Polcirkelns globala position �r: "+polcirkel.latString());
	
	}
	
	

}

class GlobalPosition{
	
	boolean latRikt=true,longRikt = true;
	byte latGrad,latMin,latSek,longGrad,longMin,longSek;
	
	public void update(boolean ltR, byte ltG, byte ltM, byte ltS, boolean lnR, byte lnG,byte lnM,byte lnS){
		
		this.latRikt =ltR;
		this.latGrad=ltG;
		this.latMin=ltM;
		this.latSek = ltS;
		
		this.longRikt=lnR;
		this.longGrad=lnG;
		this.longMin=lnM;
		this.longSek=lnS;
		
	};
	
	public String latString(){
		return latGrad+"�"+latMin+"\'"+latSek+"\" "+(latRikt?"N":"S");
	}
	
	public String longString(){
		return longGrad+"�"+longMin+"\'"+longSek+"\" "+(longRikt?"�":"V");
	}

}
