import java.io.*;
import java.util.*;


public class U9_6_R�knaOrd {

	public static void main(String[] args) throws IOException{
		
		r�knaText();
		
	}
	
	public static void r�knaText() throws IOException
	{
		
		// Skapa en scanner f�r att scanna texten efter ord
		Scanner sc = new Scanner(System.in);
		
		// Beg�r att anv�ndaren ska skriva en text och avsluta med CTRL+Z
		System.out.println("Skriv in en text och avsluta med Ctrl+Z");
		
		String rad;
		int rader = 0, ord=0, tecken=0;
		while(sc.hasNext()){
			
			// L�s in n�sta rad och r�kna upp antal rader
			rad = sc.nextLine();
			rader++;
			
			// Kontrollera hur m�nga ord det �r i raden
			Scanner scOrd = new Scanner(rad);
			String ordet = "";
			while(scOrd.hasNext()){
				
				// Plocka ut n�sta ord i raden och r�kna upp antal ord
				ordet = scOrd.next(); ord++;
				
				// R�kna antal tecken i ordet
				tecken += ordet.length();
				
			}
			
			// St�ng Ord-scannern
			scOrd.close();
			
		}
								
		// St�ng Rad-scannern
		sc.close();
		
		// Presentera resultatet
		System.out.println("");
		System.out.format("Texten inneh�ller %3d rader, %3d ord och %3d tecken (exkl mellanslag)",rader,ord,tecken);
	
		
	}
	
}
