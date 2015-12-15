
public class U11_5_arrayEquals {
	
	public static boolean equalArray(double[] k�llmatris, double[] m�lmatris){
		
		
		boolean equal = true;
		int index = 0;
		int endIndex;
		if(k�llmatris.length >= m�lmatris.length) endIndex = k�llmatris.length;
		else endIndex = m�lmatris.length;
		while(equal && (index<endIndex)){
		
			try{
				equal = (k�llmatris[index] == m�lmatris[index]);
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
		
		double[] k�lla =  {1,3,5,7,9,11};
		double[] m�l = {1,3,5,7,9,11,13,15,17,19};
		
		if(equalArray(k�lla,m�l)){
			System.out.println("Matriserna �r lika");
		}
		else
		{
			System.out.println("Matriserna �r olika!");
		}
		
	}

}