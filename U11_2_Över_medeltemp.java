import java.io.*;
import java.util.*;


import javax.swing.JFileChooser;

public class U11_2_�ver_medeltemp {
	
	public static void main(String[] args) throws IOException
	{
		
		// �ppna temperaturfilen f�r l�sning
		String aktuellMapp = System.getProperty("user.dir");
		JFileChooser filv�ljare = new JFileChooser(aktuellMapp);
		int resultat = filv�ljare.showDialog(null, "V�lj temperaturfil");
		
		double[] temperatures = new double[1000];
		if(resultat != -1){
			
			Scanner k�llfil = new Scanner(new File(filv�ljare.getSelectedFile().getAbsolutePath()));
			
						
			// L�s in samtliga temperaturer i en matris och ber�kna medeltemp
			double sumTemp = 0;
			int antal = 0;
			while(k�llfil.hasNextDouble()){
				
				// L�s in n�sta v�rde
				
				temperatures[antal] = k�llfil.nextDouble();
				sumTemp += temperatures[antal];
				antal++;
				//System.out.format("%temperatures[antal]);
				
			} 
			k�llfil.close();
			
			double averageTemp = sumTemp / antal;
			
			System.out.println("F�ljande rader inneh�ller en temperatur �ver medel: ");
			for(int rad = 1;rad<antal;rad++){
				if(temperatures[rad-1]>=averageTemp)
				{
					System.out.format("%2d.\t%4.2f\n",rad,temperatures[rad-1]);
				}
			}
			
			System.out.println("Klar");
			
		}// Fil vald och �ppnad
	}// main

}// class
