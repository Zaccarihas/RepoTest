
public class U11_8_Sigma {

	public static double sum(double[] tal)
	{
		double summa=0;
		for(int i=0;i<tal.length;i++)
		{
			summa += tal[i];
		}
		return summa;
	}
	
	public static double kvadSum(double[] tal)
	{
		double summa=0;
		for(int i=0;i<tal.length;i++)
		{
			summa += Math.pow(tal[i], 2);
		}
		return summa;
	}
	
	public static double sigma(double[] värden){
		
		return  Math.sqrt((kvadSum(värden)-Math.pow(sum(värden), 2)/värden.length)/(värden.length-1));
		
	}
	
	public static void main(String[] args)
	{
		double[] testvärden = {1,2,3,4,5};
		
		System.out.println(sigma(testvärden));
	}
	
	
}
