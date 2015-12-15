import java.io.*;
import java.util.*;


public class U12_1_Prov {
	
	public static void main(String[] args) throws IOException
	{
		// Skapa en matris för namn, en för prov och en för individuellt resultat
		String[] elevNamn = new String[30];
		int[][] provSammanställning = new int[5][2];
		int[][] individuelltResultat = new int[30][2];
		
		// Koppla en scanner till filen
		Scanner källfil = new Scanner(new File("testfil.txt"));
		
		// För varje rad...
		int antalElever = 0;
		while(källfil.hasNext())
		{
			// Läs in elevens namn och lägg det till namnmatrisen
			elevNamn[antalElever] = källfil.nextLine();
			
		
		
			// Läs in provresultat tills nästa namn
			int prov = 0;
			
			while(källfil.hasNextInt()){
				
				int resultat = källfil.nextInt();
				
				// Lägg till provresultatet till summan för provet i provmatrisen
				provSammanställning[prov][0] += resultat;
				provSammanställning[prov][1]++;
				
				// Lägg till provresultatet till summan för elevens resultat
				individuelltResultat[antalElever][0] += resultat;
				individuelltResultat[antalElever][1]++;
				
				prov++;
			}
			
			String temp = källfil.nextLine();
			
			// Nästa elev
			antalElever++;	
				
		}
		källfil.close();
			
		
		// För varje elev i namnmatrisen
		for(int i=0;i<antalElever;i++){
			
			// Skriv ut elevinfo
			System.out.format("Elev %2d - %3.2f %s\n",i+1,(double)individuelltResultat[i][0]/individuelltResultat[i][1],elevNamn[i]);
			System.out.flush();		
		}
		
		// För varje prov (fem stycken)
		System.out.println("\nProvsammanställning:");
		for (int i=0;i<5;i++){
			
			System.out.format("Prov %d - Antal elever: %2d\tMedel: %3.2f\n",i,provSammanställning[i][1],(double) provSammanställning[i][0]/provSammanställning[i][1]);
			System.out.flush();
		}
		
	}

}
