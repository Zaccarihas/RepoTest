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
		
		// L�s in en matris 4x4
		Scanner tangentbord = new Scanner(System.in);
		System.out.print("Ange en matris! Skriv in fyra heltal �tskilda av mellanslag p� varje rad:\n"); System.out.flush();
		
		for(int rad=1;rad<=4;rad++)
		{
			String raden = tangentbord.nextLine();
			
			//System.out.println("P� rad "+rad+" skrev du: "+raden);
			
			Scanner radstr�ng = new Scanner(raden);
			for(int v�rde = 1;v�rde<=4;v�rde++){
				
				matris[rad-1][v�rde-1] = radstr�ng.nextInt();
				//System.out.println("V�rde "+rad+"|"+v�rde+": "+matris[rad-1][v�rde-1]);
			}
			radstr�ng.close();
			
		}
		tangentbord.close();
		
		if(symmetrisk(matris,4)) System.out.println("\n\nInmatad Matris �r symmetrisk!");
		else System.out.println("\n\nInmatad matris �r INTE symmetrisk!");
				
		
		
	}

}
