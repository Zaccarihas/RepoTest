
public class U11_4_arrayCopy {
	
	public static double[] copyArray(double[] källmatris,int källpos, double[] målmatris, int målpos,int antal){
		
		
		for(int fromIndex=källpos,toIndex=målpos;fromIndex<källpos+antal;fromIndex++,toIndex++){
		
			målmatris[toIndex] = källmatris[fromIndex];
			
		}
		return målmatris;
		
	}
	
	public static void main(String[] args){
		
		double[] testvärden =  {1,3,5,7,9,11,13,15,17,19};
		double[] svar = new double[10];
		
		svar = copyArray(testvärden,2,svar,0,3);
		
		for(int i=0;i<svar.length;i++){
			System.out.format("testvärde %d = %f, svar %d = %f\n",i,testvärden[i],i,svar[i]); System.out.flush();
		}
		
	}

}
