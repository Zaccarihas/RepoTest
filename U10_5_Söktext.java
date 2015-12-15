import java.io.*;
import javax.swing.*;
import java.util.*;


public class U10_5_Söktext {
	
	public static void main(String[] args) throws IOException
	{

		// Läs in vilken text som ska sökas
		String söktext = JOptionPane.showInputDialog("Ange en text att söka efter").trim();
		
		// Läs in vilken fil texten ska sökas
		String aktuellMapp = System.getProperty("user.dir");
		JFileChooser filväljare = new JFileChooser(aktuellMapp);
		int resultat = filväljare.showDialog(null, "Källfil");
		
		if(resultat != -1){
		
			// Öppna källfilen för läsning
			Scanner källfil = new Scanner(new File(filväljare.getSelectedFile().getAbsolutePath()));
		
			// Läs in vilken fil texten ska skrivas till
			resultat = filväljare.showDialog(null, "Målfil");
		
			if(resultat != -1){
				
				// Öppna målfilen för skrivning
				PrintWriter målfil = new PrintWriter
										(new BufferedWriter
											( new FileWriter(filväljare.getSelectedFile().getAbsolutePath())));
				
				// Till filen är slut så...
				String rad ="";
				while(källfil.hasNextLine()){
				
					// Läs in en rad
					rad = källfil.nextLine();
			
					// Sök texten i raden
					if(rad.indexOf(söktext)!=-1){
						
						// Om texten finns så skriv raden till målfilen
						målfil.println(rad);
						
					}
						
				} // while - finns nåt kvar i filen
			
					
				// Stäng målfil
				målfil.close();
			
			} // målfil
			
			// Stäng källfilen
			källfil.close();
			
		}// källfil
	
	} // main
	
}
