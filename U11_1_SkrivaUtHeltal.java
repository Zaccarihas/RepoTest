import java.io.*;

public class U11_1_SkrivaUtHeltal {
	
	public static void main(String[] args) throws IOException
	{
		// Skapa en inmatningsström för tangenbordet
		BufferedReader tangentbord = new BufferedReader
										(new InputStreamReader(System.in));
		
		// Tills användaren trycker på CTRL+Z så...
		String inmatning = "";
		int[] talen = new int[1000];
		int antalInmatningar = 0;
		int tal = 0;
		boolean finns;
		
		while(inmatning != null){
		
			// Läs in ett heltal
			System.out.print("Ange ett heltal eller avsluta med CTRL+Z: "); System.out.flush();
			inmatning = tangentbord.readLine();
	
			if(inmatning == null) break;
								
			tal = Integer.parseInt(inmatning);
			
			// Om talet inte finns i matrisen så lägg till det och räkna upp 
			// antalet inmatningar
			int i = 0;
			finns = false;

			while(!finns && (i<antalInmatningar)){
				finns = (tal == talen[i++]);
			};
			
			if(!finns){
				talen[antalInmatningar] = tal; antalInmatningar++;
			}
		
		
		}// while inmatning
		
		// Stäng av inmatningsströmmen
		tangentbord.close();
		
		// Skriv ut alla talen
		for(int j=0;j<antalInmatningar;j++){
			System.out.println(talen[j]);
		}
		
	} // main
	
} // class
