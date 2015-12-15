
public class U11_5_arrayEquals {
	
	public static boolean equalArray(double[] källmatris, double[] målmatris){
		
		
		boolean equal = true;
		int index = 0;
		int endIndex;
		if(källmatris.length >= målmatris.length) endIndex = källmatris.length;
		else endIndex = målmatris.length;
		while(equal && (index<endIndex)){
		
			try{
				equal = (källmatris[index] == målmatris[index]);
			}
			catch (Exception e)
			{
				equal = false; break;
			}
			index++;		
			
		}
		return equal;
		
	}
	
	public static void main(String[] args){
		
		double[] källa =  {1,3,5,7,9,11};
		double[] mål = {1,3,5,7,9,11,13,15,17,19};
		
		if(equalArray(källa,mål)){
			System.out.println("Matriserna är lika");
		}
		else
		{
			System.out.println("Matriserna är olika!");
		}
		
	}

}