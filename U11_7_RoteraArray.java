
public class U11_7_RoteraArray {
	
	public static void roteraArray(double[] k�lla){
		
		// Lyft ur det sista elementet och spara det i en egen variabel
		double temp = k�lla[k�lla.length-1];
		
		// Iterera �ver resten och flytta elementen eftersom
		for(int i=k�lla.length-1;i>0;i--){
			k�lla[i]=k�lla[i-1];
		}
		
		// L�gg tillbaka det sista elementet f�rst i matrisen
		k�lla[0] = temp;
		
	}
	
	
	public static void main(String[] args){
		
		double[] matris = {1,2,3,4,5};
		
		roteraArray(matris);
		
		for(int i=0;i<matris.length;i++){
			System.out.println(matris[i]);
		}
	}

}
