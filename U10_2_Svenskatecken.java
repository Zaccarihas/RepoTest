import java.io.*;
import javax.swing.*;


public class U10_2_Svenskatecken {
	
	public static void main(String[] args) throws IOException
	{
		
		// Ange vilken fil som ska kontrolleras
		String aktuellMapp = System.getProperty("user.dir");
		JFileChooser filväljare = new JFileChooser(aktuellMapp);
		int resultat = filväljare.showOpenDialog(null);
		
		if(resultat != -1){
			
			// Öppna filen för läsning
			BufferedReader källfil = new BufferedReader
								(new FileReader(new File(filväljare.getSelectedFile().getAbsolutePath())));
			
			// Ange en målfil
			resultat = filväljare.showSaveDialog(null);
			
			if(resultat != -1){
			
				// Öppna filen för skrivning
				PrintWriter målfil = new PrintWriter
									(new BufferedWriter
									(new FileWriter(filväljare.getSelectedFile().getAbsolutePath())));
				
				// Tills källfilen är slut...
				String rad = "";
				do{
		
					// Läs in en rad
					rad = källfil.readLine();
					if(rad == null) break;
		
					// Ersätt teckenkombinationerna med motsvarande tecken
					rad = rad.replaceAll("aa", "å");
					rad = rad.replaceAll("ae", "ä");
					rad = rad.replaceAll("oe", "ö");
		
					// Skriv ut raden till målfilen.
					målfil.println(rad);
		
				}while(rad != null);
			
				// Stäng målfil				
				målfil.close();
				
			} //filväljare - målfil	
			
			// Stäng källfil
			källfil.close();
			
		} // filväljare - källfil
		
	} // main

} // class
