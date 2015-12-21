
public class U11_6_KvadSum {
	
	public static double sum(double[] tal)
	{
		// en kommentar
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
	
	public static void main(String[] args)
	{
		double[] källa = {1,2,3,4,5};
		
		System.out.format("Summan av talen är %f\n Kvadrat summan är %f",sum(källa),kvadSum(källa));
	}

}
