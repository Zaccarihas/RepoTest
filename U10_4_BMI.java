import java.io.*;
import java.util.*;

import javax.swing.JOptionPane;

public class U10_4_BMI {

	public static void main(String[] args) throws IOException
	{
	
		// �ppna en instr�m fr�n tangentbordet
		BufferedReader tangentbord = new BufferedReader
										(new InputStreamReader(System.in));
		
		// L�s in filnamnet fr�n konsolen
		System.out.print("Ange ett filnamn: "); System.out.flush();
		String filnamn = tangentbord.readLine();		
		
		// Koppla en Scanner till filen
		Scanner k�llfil = new Scanner (new File(filnamn));
		
		// �ppna resultatfilen f�r editering
		PrintWriter m�lfil = new PrintWriter
								(new BufferedWriter
									(new FileWriter("bmiresultat.txt")));
		
		// S� l�nge det finns n�got kvar i filen s�...
		while(k�llfil.hasNext()){
		
			// L�s in f�rsta raden
			String idRad = k�llfil.nextLine();
		
			// L�s in �lder l�ngd och vikt
			int �lder = k�llfil.nextInt();
			int l�ngd = k�llfil.nextInt();
			int vikt = k�llfil.nextInt();
			k�llfil.nextLine();				// M�ste anges f�r att "l�sa bort" radbrytningen
			
			// Om personen �r �verviktig s� l�gg till i resultatfilen
			double bmi = (vikt/Math.pow((double)l�ngd/100, 2));
			if(bmi >= 30){
				m�lfil.println(idRad);
				m�lfil.println(�lder+" "+l�ngd+" "+vikt+" "+bmi);
			}
			
		} // while - filen inte �r tom
		
		// St�ng filerna
		k�llfil.close();
		m�lfil.close();
		
	}
}
