import java.io.*;
import java.util.*;
import javax.swing.*;

public class U10_1_Temperaturfil {

	public static void main(String[] args) throws IOException
	{
		
		// Välj vilken fil som innehåller temperaturerna
		String aktuellMapp = System.getProperty("user.dir");
		JFileChooser filväljare = new JFileChooser(aktuellMapp);
		int resultat = filväljare.showDialog(null, "Välj en temperturfil");
		
		if(resultat != -1){
		
			// Öppna angiven fil för läsning
			Scanner källfil = new Scanner(new File(filväljare.getSelectedFile().getAbsolutePath()));
		
			// Tills filen är tom så...
			int antal = 0;
			double min=Double.MAX_VALUE, max=Double.MIN_NORMAL;
			double sum=0;
			
			while(källfil.hasNextDouble()){
				
				// Läs in en temperatur
				double temp = källfil.nextDouble();
		
				// Räkna upp antalet temperaturmätningar
				antal++;
				
				// Lägg till temperaturen till temperatursumman
				sum += temp;
		
				// Byt ut tidigare max- och min-värden vid behov
				if(temp>max) max = temp;
				if(temp<min) min = temp;
				
			} // while - filen
						
			// Stäng filen
			källfil.close();
		
			// Presentera antal, min, max och medel 
			String meddelande = String.format("Filen innehåller %d mätningar inom %.2f - %.2f grader.\nMedeltemperaturen blir %.2f grader", antal,min,max,sum/antal);
			JOptionPane.showMessageDialog(null,meddelande);
	
		}// Filväljare
					
	}// main
	
}// class
