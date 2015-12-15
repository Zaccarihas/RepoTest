
public class U11_7_RoteraArray {
	
	public static void roteraArray(double[] källa){
		
		// Lyft ur det sista elementet och spara det i en egen variabel
		double temp = källa[källa.length-1];
		
		// Iterera över resten och flytta elementen eftersom
		for(int i=källa.length-1;i>0;i--){
			källa[i]=källa[i-1];
		}
		
		// Lägg tillbaka det sista elementet först i matrisen
		källa[0] = temp;
		
	}
	
	
	public static void main(String[] args){
		
		double[] matris = {1,2,3,4,5};
		
		roteraArray(matris);
		
		for(int i=0;i<matris.length;i++){
			System.out.println(matris[i]);
		}
	}

}
