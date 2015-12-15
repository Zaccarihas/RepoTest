import java.io.*;
import java.util.*;


public class U12_1_Prov {
	
	public static void main(String[] args) throws IOException
	{
		// Skapa en matris f�r namn, en f�r prov och en f�r individuellt resultat
		String[] elevNamn = new String[30];
		int[][] provSammanst�llning = new int[5][2];
		int[][] individuelltResultat = new int[30][2];
		
		// Koppla en scanner till filen
		Scanner k�llfil = new Scanner(new File("testfil.txt"));
		
		// F�r varje rad...
		int antalElever = 0;
		while(k�llfil.hasNext())
		{
			// L�s in elevens namn och l�gg det till namnmatrisen
			elevNamn[antalElever] = k�llfil.nextLine();
			
		
		
			// L�s in provresultat tills n�sta namn
			int prov = 0;
			
			while(k�llfil.hasNextInt()){
				
				int resultat = k�llfil.nextInt();
				
				// L�gg till provresultatet till summan f�r provet i provmatrisen
				provSammanst�llning[prov][0] += resultat;
				provSammanst�llning[prov][1]++;
				
				// L�gg till provresultatet till summan f�r elevens resultat
				individuelltResultat[antalElever][0] += resultat;
				individuelltResultat[antalElever][1]++;
				
				prov++;
			}
			
			String temp = k�llfil.nextLine();
			
			// N�sta elev
			antalElever++;	
				
		}
		k�llfil.close();
			
		
		// F�r varje elev i namnmatrisen
		for(int i=0;i<antalElever;i++){
			
			// Skriv ut elevinfo
			System.out.format("Elev %2d - %3.2f %s\n",i+1,(double)individuelltResultat[i][0]/individuelltResultat[i][1],elevNamn[i]);
			System.out.flush();		
		}
		
		// F�r varje prov (fem stycken)
		System.out.println("\nProvsammanst�llning:");
		for (int i=0;i<5;i++){
			
			System.out.format("Prov %d - Antal elever: %2d\tMedel: %3.2f\n",i,provSammanst�llning[i][1],(double) provSammanst�llning[i][0]/provSammanst�llning[i][1]);
			System.out.flush();
		}
		
	}

}
