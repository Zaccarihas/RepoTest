import java.io.*;
import java.util.*;

import javax.swing.JOptionPane;

public class U10_4_BMI {

	public static void main(String[] args) throws IOException
	{
	
		// Öppna en inström från tangentbordet
		BufferedReader tangentbord = new BufferedReader
										(new InputStreamReader(System.in));
		
		// Läs in filnamnet från konsolen
		System.out.print("Ange ett filnamn: "); System.out.flush();
		String filnamn = tangentbord.readLine();		
		
		// Koppla en Scanner till filen
		Scanner källfil = new Scanner (new File(filnamn));
		
		// Öppna resultatfilen för editering
		PrintWriter målfil = new PrintWriter
								(new BufferedWriter
									(new FileWriter("bmiresultat.txt")));
		
		// Så länge det finns något kvar i filen så...
		while(källfil.hasNext()){
		
			// Läs in första raden
			String idRad = källfil.nextLine();
		
			// Läs in ålder längd och vikt
			int ålder = källfil.nextInt();
			int längd = källfil.nextInt();
			int vikt = källfil.nextInt();
			källfil.nextLine();				// Måste anges för att "läsa bort" radbrytningen
			
			// Om personen är överviktig så lägg till i resultatfilen
			double bmi = (vikt/Math.pow((double)längd/100, 2));
			if(bmi >= 30){
				målfil.println(idRad);
				målfil.println(ålder+" "+längd+" "+vikt+" "+bmi);
			}
			
		} // while - filen inte är tom
		
		// Stäng filerna
		källfil.close();
		målfil.close();
		
	}
}
