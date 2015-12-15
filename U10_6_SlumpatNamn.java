import java.io.*;

import javax.swing.JOptionPane;

public class U10_6_SlumpatNamn {

	public static void main(String[] args) throws IOException
	{
		// Öppna en fil för läsning
		BufferedReader källfil = new BufferedReader
									(new FileReader("testfil.txt"));
		
		// Räkna igenom antalet rader i filen
		String namn = "";
		int antalRader = 0;
		do{
		
			namn = källfil.readLine();
			if(namn == null) break;
			
			antalRader++;
			
		}while(namn != null);
		
		// Stäng filen
		källfil.close();
		
		// Slumpa ett tal mellan 1 till antalet rader
		int slumprad = (int)(Math.random()*antalRader+1.5);
		
		// Öppna filen igen
		källfil = new BufferedReader
				(new FileReader("testfil.txt"));
	
		// Läs in fram till raden före det slumpade antalet rader
		for(int i=1;i<slumprad;i++){
			källfil.readLine();
		}
	
		// Läs in den slumpmässigt utplockade raden och presentera den
		namn = källfil.readLine();
		JOptionPane.showMessageDialog(null, "Det slumpade namnet är "+namn);
		
		// Stäng filen
		källfil.close();
		
		
	} // main
	
} // class
