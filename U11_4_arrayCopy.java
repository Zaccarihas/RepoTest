
public class U11_4_arrayCopy {
	
	public static double[] copyArray(double[] k�llmatris,int k�llpos, double[] m�lmatris, int m�lpos,int antal){
		
		
		for(int fromIndex=k�llpos,toIndex=m�lpos;fromIndex<k�llpos+antal;fromIndex++,toIndex++){
		
			m�lmatris[toIndex] = k�llmatris[fromIndex];
			
		}
		return m�lmatris;
		
	}
	
	public static void main(String[] args){
		
		double[] testv�rden =  {1,3,5,7,9,11,13,15,17,19};
		double[] svar = new double[10];
		
		svar = copyArray(testv�rden,2,svar,0,3);
		
		for(int i=0;i<svar.length;i++){
			System.out.format("testv�rde %d = %f, svar %d = %f\n",i,testv�rden[i],i,svar[i]); System.out.flush();
		}
		
	}

}
