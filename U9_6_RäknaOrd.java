import java.io.*;
import java.util.*;


public class U9_6_RäknaOrd {

	public static void main(String[] args) throws IOException{
		
		räknaText();
		
	}
	
	public static void räknaText() throws IOException
	{
		
		// Skapa en scanner för att scanna texten efter ord
		Scanner sc = new Scanner(System.in);
		
		// Begär att användaren ska skriva en text och avsluta med CTRL+Z
		System.out.println("Skriv in en text och avsluta med Ctrl+Z");
		
		String rad;
		int rader = 0, ord=0, tecken=0;
		while(sc.hasNext()){
			
			// Läs in nästa rad och räkna upp antal rader
			rad = sc.nextLine();
			rader++;
			
			// Kontrollera hur många ord det är i raden
			Scanner scOrd = new Scanner(rad);
			String ordet = "";
			while(scOrd.hasNext()){
				
				// Plocka ut nästa ord i raden och räkna upp antal ord
				ordet = scOrd.next(); ord++;
				
				// Räkna antal tecken i ordet
				tecken += ordet.length();
				
			}
			
			// Stäng Ord-scannern
			scOrd.close();
			
		}
								
		// Stäng Rad-scannern
		sc.close();
		
		// Presentera resultatet
		System.out.println("");
		System.out.format("Texten innehåller %3d rader, %3d ord och %3d tecken (exkl mellanslag)",rader,ord,tecken);
	
		
	}
	
}
