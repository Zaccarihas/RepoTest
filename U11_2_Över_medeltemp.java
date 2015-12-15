import java.io.*;
import java.util.*;


import javax.swing.JFileChooser;

public class U11_2_Över_medeltemp {
	
	public static void main(String[] args) throws IOException
	{
		
		// Öppna temperaturfilen för läsning
		String aktuellMapp = System.getProperty("user.dir");
		JFileChooser filväljare = new JFileChooser(aktuellMapp);
		int resultat = filväljare.showDialog(null, "Välj temperaturfil");
		
		double[] temperatures = new double[1000];
		if(resultat != -1){
			
			Scanner källfil = new Scanner(new File(filväljare.getSelectedFile().getAbsolutePath()));
			
						
			// Läs in samtliga temperaturer i en matris och beräkna medeltemp
			double sumTemp = 0;
			int antal = 0;
			while(källfil.hasNextDouble()){
				
				// Läs in nästa värde
				
				temperatures[antal] = källfil.nextDouble();
				sumTemp += temperatures[antal];
				antal++;
				//System.out.format("%temperatures[antal]);
				
			} 
			källfil.close();
			
			double averageTemp = sumTemp / antal;
			
			System.out.println("Följande rader innehåller en temperatur över medel: ");
			for(int rad = 1;rad<antal;rad++){
				if(temperatures[rad-1]>=averageTemp)
				{
					System.out.format("%2d.\t%4.2f\n",rad,temperatures[rad-1]);
				}
			}
			
			System.out.println("Klar");
			
		}// Fil vald och öppnad
	}// main

}// class
