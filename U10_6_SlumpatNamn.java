import java.io.*;

import javax.swing.JOptionPane;

public class U10_6_SlumpatNamn {

	public static void main(String[] args) throws IOException
	{
		// �ppna en fil f�r l�sning
		BufferedReader k�llfil = new BufferedReader
									(new FileReader("testfil.txt"));
		
		// R�kna igenom antalet rader i filen
		String namn = "";
		int antalRader = 0;
		do{
		
			namn = k�llfil.readLine();
			if(namn == null) break;
			
			antalRader++;
			
		}while(namn != null);
		
		// St�ng filen
		k�llfil.close();
		
		// Slumpa ett tal mellan 1 till antalet rader
		int slumprad = (int)(Math.random()*antalRader+1.5);
		
		// �ppna filen igen
		k�llfil = new BufferedReader
				(new FileReader("testfil.txt"));
	
		// L�s in fram till raden f�re det slumpade antalet rader
		for(int i=1;i<slumprad;i++){
			k�llfil.readLine();
		}
	
		// L�s in den slumpm�ssigt utplockade raden och presentera den
		namn = k�llfil.readLine();
		JOptionPane.showMessageDialog(null, "Det slumpade namnet �r "+namn);
		
		// St�ng filen
		k�llfil.close();
		
		
	} // main
	
} // class
