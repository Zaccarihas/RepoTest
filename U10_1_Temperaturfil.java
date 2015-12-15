import java.io.*;
import java.util.*;
import javax.swing.*;

public class U10_1_Temperaturfil {

	public static void main(String[] args) throws IOException
	{
		
		// V�lj vilken fil som inneh�ller temperaturerna
		String aktuellMapp = System.getProperty("user.dir");
		JFileChooser filv�ljare = new JFileChooser(aktuellMapp);
		int resultat = filv�ljare.showDialog(null, "V�lj en temperturfil");
		
		if(resultat != -1){
		
			// �ppna angiven fil f�r l�sning
			Scanner k�llfil = new Scanner(new File(filv�ljare.getSelectedFile().getAbsolutePath()));
		
			// Tills filen �r tom s�...
			int antal = 0;
			double min=Double.MAX_VALUE, max=Double.MIN_NORMAL;
			double sum=0;
			
			while(k�llfil.hasNextDouble()){
				
				// L�s in en temperatur
				double temp = k�llfil.nextDouble();
		
				// R�kna upp antalet temperaturm�tningar
				antal++;
				
				// L�gg till temperaturen till temperatursumman
				sum += temp;
		
				// Byt ut tidigare max- och min-v�rden vid behov
				if(temp>max) max = temp;
				if(temp<min) min = temp;
				
			} // while - filen
						
			// St�ng filen
			k�llfil.close();
		
			// Presentera antal, min, max och medel 
			String meddelande = String.format("Filen inneh�ller %d m�tningar inom %.2f - %.2f grader.\nMedeltemperaturen blir %.2f grader", antal,min,max,sum/antal);
			JOptionPane.showMessageDialog(null,meddelande);
	
		}// Filv�ljare
					
	}// main
	
}// class
