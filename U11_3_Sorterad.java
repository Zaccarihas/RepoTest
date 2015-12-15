import java.io.*;
import java.util.*;



public class U11_3_Sorterad {
	
	public static boolean �rSorterad(double[] values, int length)
	{
		
		boolean sorted = true;
		int n = 1;
		while(sorted && (n < length))
		{
			sorted = values[n]>values[n-1];
		}
		
		return sorted;
		
	}// �rSorterad
	
	public static void main(String[] args) throws IOException
	{
		
		
		
		double[] testv�rden = new double[1000];
		
		double input;
		int index = 0;
		
		System.out.println("Ange ett antal decimaltal (Avgr�nsa med ny rad eller mellanslag och avbryt med CTRL+Z): "); 
		
		// �ppna en inputstream fr�n tangentbordet
		Scanner tangentbord = new Scanner(System.in);
		
		while(tangentbord.hasNextDouble()){
			
			testv�rden[index] = tangentbord.nextDouble();
			index++;
						
			if(index == 20){
				System.out.println("\nNu �r matrisen full!");
				break;
			}
		}
		
		tangentbord.close();
		
		index--;
		if(�rSorterad(testv�rden,index))
		{
			System.out.println("\n\nMatrisen �r sorterad!");
		}
		else
		{
			System.out.println("\n\nMatrisen �r inte sorterad!");
		}
					
		System.out.println("Klar");

	}

}
