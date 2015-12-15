import java.io.*;

public class U11_1_SkrivaUtHeltal {
	
	public static void main(String[] args) throws IOException
	{
		// Skapa en inmatningsstr�m f�r tangenbordet
		BufferedReader tangentbord = new BufferedReader
										(new InputStreamReader(System.in));
		
		// Tills anv�ndaren trycker p� CTRL+Z s�...
		String inmatning = "";
		int[] talen = new int[1000];
		int antalInmatningar = 0;
		int tal = 0;
		boolean finns;
		
		while(inmatning != null){
		
			// L�s in ett heltal
			System.out.print("Ange ett heltal eller avsluta med CTRL+Z: "); System.out.flush();
			inmatning = tangentbord.readLine();
	
			if(inmatning == null) break;
								
			tal = Integer.parseInt(inmatning);
			
			// Om talet inte finns i matrisen s� l�gg till det och r�kna upp 
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
		
		// St�ng av inmatningsstr�mmen
		tangentbord.close();
		
		// Skriv ut alla talen
		for(int j=0;j<antalInmatningar;j++){
			System.out.println(talen[j]);
		}
		
	} // main
	
} // class
