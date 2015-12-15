
public class U11_9_Primtal {
	
	public static void main(String[] args)
	{
		
		int[] primtal = new int[50];
		primtal[0] = 1; primtal[1] = 2;
		int tal = 3;
		int primCount = 2;
		
		while(primCount < 50){
			
			boolean ärPrimtal = true;
			int i = 1;
			while(ärPrimtal && (i<primCount)){
				ärPrimtal = tal%primtal[i]!=0;
				i++;
			}
			
			if(ärPrimtal){
				primtal[primCount] = tal;
				primCount++; 
			}
			
			tal++;		
			
		}
		
		for(int i = 0;i<50;i++){
			System.out.print(primtal[i]+" ");
			if(i%10==0) { System.out.print("\n"); System.out.flush();}
		}
		
	}

}
