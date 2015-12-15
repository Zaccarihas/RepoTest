import java.io.*;
import javax.swing.*;


public class U10_2_Svenskatecken {
	
	public static void main(String[] args) throws IOException
	{
		
		// Ange vilken fil som ska kontrolleras
		String aktuellMapp = System.getProperty("user.dir");
		JFileChooser filv�ljare = new JFileChooser(aktuellMapp);
		int resultat = filv�ljare.showOpenDialog(null);
		
		if(resultat != -1){
			
			// �ppna filen f�r l�sning
			BufferedReader k�llfil = new BufferedReader
								(new FileReader(new File(filv�ljare.getSelectedFile().getAbsolutePath())));
			
			// Ange en m�lfil
			resultat = filv�ljare.showSaveDialog(null);
			
			if(resultat != -1){
			
				// �ppna filen f�r skrivning
				PrintWriter m�lfil = new PrintWriter
									(new BufferedWriter
									(new FileWriter(filv�ljare.getSelectedFile().getAbsolutePath())));
				
				// Tills k�llfilen �r slut...
				String rad = "";
				do{
		
					// L�s in en rad
					rad = k�llfil.readLine();
					if(rad == null) break;
		
					// Ers�tt teckenkombinationerna med motsvarande tecken
					rad = rad.replaceAll("aa", "�");
					rad = rad.replaceAll("ae", "�");
					rad = rad.replaceAll("oe", "�");
		
					// Skriv ut raden till m�lfilen.
					m�lfil.println(rad);
		
				}while(rad != null);
			
				// St�ng m�lfil				
				m�lfil.close();
				
			} //filv�ljare - m�lfil	
			
			// St�ng k�llfil
			k�llfil.close();
			
		} // filv�ljare - k�llfil
		
	} // main

} // class
