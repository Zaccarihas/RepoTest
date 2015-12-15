import java.util.*;

public class U12_2_Symmetrisk {
	
	static boolean symmetrisk(int[][] matris, int size){
		
		boolean sym = true;
		int i = 1;
		
		
		while(sym && (i<size)){
			
			int j = 0;
			while(sym && (j<i)){
				sym = matris[i][j] == matris[j][i];
				j++;
			}
			i++;
		}
		return sym;
		
	}
	
	public static void main(String[] args)
	{
		// Skapa en matris som ska kontrolleras
		int[][] matris = new int[4][4];
		
		// Läs in en matris 4x4
		Scanner tangentbord = new Scanner(System.in);
		System.out.print("Ange en matris! Skriv in fyra heltal åtskilda av mellanslag på varje rad:\n"); System.out.flush();
		
		for(int rad=1;rad<=4;rad++)
		{
			String raden = tangentbord.nextLine();
			
			//System.out.println("På rad "+rad+" skrev du: "+raden);
			
			Scanner radsträng = new Scanner(raden);
			for(int värde = 1;värde<=4;värde++){
				
				matris[rad-1][värde-1] = radsträng.nextInt();
				//System.out.println("Värde "+rad+"|"+värde+": "+matris[rad-1][värde-1]);
			}
			radsträng.close();
			
		}
		tangentbord.close();
		
		if(symmetrisk(matris,4)) System.out.println("\n\nInmatad Matris är symmetrisk!");
		else System.out.println("\n\nInmatad matris är INTE symmetrisk!");
				
		
		
	}

}
