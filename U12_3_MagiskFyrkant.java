import java.util.Scanner;

public class U12_3_MagiskFyrkant {
	
	static boolean magisk(int[][] matris, int size){
		
		
		int[] sums = new int[10];
		int magicSum=0;
		//for(int i = 0;i<size*2+2;i++)sums[i]=0;
		
		//System.out.println("Men inte hit?");
		
		boolean magic = true;
		int rad = 0;	
		
		while(magic && (rad<size)){
			
			
			int kol = 0;
			while(magic && (kol<size)){
				//System.out.println("Kol "+kol+": "+matris[rad][kol]);
				sums[rad] += matris[rad][kol];
				//System.out.println("Current sum "+rad+": "+sums[rad]);
				sums[size+kol] +=matris[rad][kol];
				//System.out.println("Current sum "+(size+kol)+": "+sums[size+kol]);
				if(rad == kol){

					sums[size*2] += matris[rad][kol];
					//System.out.println("Diagonal "+(size*2)+": "+sums[size*2]);
					
				}
				if(rad+kol == size-1){
					
					sums[size*2+1] += matris[rad][kol];
					//System.out.println("Diagonal "+(size*2+1)+": "+sums[size*2+1]);
				}
				kol++;
			}
			if (rad==0) magicSum = sums[0];
			else magic = sums[rad] == magicSum;
			rad++;	
			
			//System.out.println("Den magiska summan �r: "+magicSum);
			//if(!magic) System.out.println("Radsumman �verenst�mmer inte med magiska summan s� vi avbryter med radr�knaren p� "+rad);
		}
		
		if(magic){
			//System.out.println("Eftersom radsummorna st�mmer s� m�ste vi kolla kolumner och diagonaler");
			int summa = size;
			while(magic && (summa < size*2+2)){
				
				magic = sums[summa] == magicSum;
				summa++;
				
			}
		}
		
		
		
		return magic;
		
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
		
		
		if(magisk(matris,4)) System.out.println("\n\nInmatad Matris �r Magisk!");
		else System.out.println("\n\nInmatad matris �r INTE Magisk!");
				
		
		
	}

}
