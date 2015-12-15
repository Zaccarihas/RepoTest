import java.io.*;
import java.util.*;



public class U11_3_Sorterad {
	
	public static boolean ärSorterad(double[] values, int length)
	{
		
		boolean sorted = true;
		int n = 1;
		while(sorted && (n < length))
		{
			sorted = values[n]>values[n-1];
		}
		
		return sorted;
		
	}// ärSorterad
	
	public static void main(String[] args) throws IOException
	{
		
		
		
		double[] testvärden = new double[1000];
		
		double input;
		int index = 0;
		
		System.out.println("Ange ett antal decimaltal (Avgränsa med ny rad eller mellanslag och avbryt med CTRL+Z): "); 
		
		// Öppna en inputstream från tangentbordet
		Scanner tangentbord = new Scanner(System.in);
		
		while(tangentbord.hasNextDouble()){
			
			testvärden[index] = tangentbord.nextDouble();
			index++;
						
			if(index == 20){
				System.out.println("\nNu är matrisen full!");
				break;
			}
		}
		
		tangentbord.close();
		
		index--;
		if(ärSorterad(testvärden,index))
		{
			System.out.println("\n\nMatrisen är sorterad!");
		}
		else
		{
			System.out.println("\n\nMatrisen är inte sorterad!");
		}
					
		System.out.println("Klar");

	}

}
