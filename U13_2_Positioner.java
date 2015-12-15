
public class U13_2_Positioner {
	
	public static void main(String[] args){
		
		GlobalPosition göteborg = new GlobalPosition();
		göteborg.latGrad = 57;
		göteborg.latMin= 39;
		göteborg.latSek = 47;
		göteborg.latRikt = true;
		göteborg.longGrad = 12;
		göteborg.longMin= 16;
		göteborg.longSek = 58;
		göteborg.longRikt = true;
		
		GlobalPosition polcirkel = new GlobalPosition();
		polcirkel.update(true, (byte)69, (byte)10, (byte)0, true, (byte)130, (byte)54, (byte)10);
		
		System.out.println("Landvetters globala position är: "+göteborg.latString()+" "+göteborg.longString());
		System.out.println("Polcirkelns globala position är: "+polcirkel.latString());
	
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
		return latGrad+"°"+latMin+"\'"+latSek+"\" "+(latRikt?"N":"S");
	}
	
	public String longString(){
		return longGrad+"°"+longMin+"\'"+longSek+"\" "+(longRikt?"Ö":"V");
	}

}
