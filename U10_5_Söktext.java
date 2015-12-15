import java.io.*;
import javax.swing.*;
import java.util.*;


public class U10_5_S�ktext {
	
	public static void main(String[] args) throws IOException
	{

		// L�s in vilken text som ska s�kas
		String s�ktext = JOptionPane.showInputDialog("Ange en text att s�ka efter").trim();
		
		// L�s in vilken fil texten ska s�kas
		String aktuellMapp = System.getProperty("user.dir");
		JFileChooser filv�ljare = new JFileChooser(aktuellMapp);
		int resultat = filv�ljare.showDialog(null, "K�llfil");
		
		if(resultat != -1){
		
			// �ppna k�llfilen f�r l�sning
			Scanner k�llfil = new Scanner(new File(filv�ljare.getSelectedFile().getAbsolutePath()));
		
			// L�s in vilken fil texten ska skrivas till
			resultat = filv�ljare.showDialog(null, "M�lfil");
		
			if(resultat != -1){
				
				// �ppna m�lfilen f�r skrivning
				PrintWriter m�lfil = new PrintWriter
										(new BufferedWriter
											( new FileWriter(filv�ljare.getSelectedFile().getAbsolutePath())));
				
				// Till filen �r slut s�...
				String rad ="";
				while(k�llfil.hasNextLine()){
				
					// L�s in en rad
					rad = k�llfil.nextLine();
			
					// S�k texten i raden
					if(rad.indexOf(s�ktext)!=-1){
						
						// Om texten finns s� skriv raden till m�lfilen
						m�lfil.println(rad);
						
					}
						
				} // while - finns n�t kvar i filen
			
					
				// St�ng m�lfil
				m�lfil.close();
			
			} // m�lfil
			
			// St�ng k�llfilen
			k�llfil.close();
			
		}// k�llfil
	
	} // main
	
}
