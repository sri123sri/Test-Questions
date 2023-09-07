package TechSaksham;

public class DecToBin {
	public static String DecBin(int d)
	{
		StringBuilder x=new StringBuilder();
		while(d>0)
		{
			int rem=d%2;
			x.insert(0, rem);
			d=d/2;
		}
		return x.toString();
	}
	public static void main(String[] args)
	{
		int d=4;
		System.out.println(DecBin(d));
	}
}
