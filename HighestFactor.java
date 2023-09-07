package TechSaksham;
import java.util.*;
public class HighestFactor {
	
	public static int findCount(int a)
	{
		int count=0;
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
			{
				count++;
			}
		}
		return count;
	}
    public static void main(String[] args)
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter min:");
    	int min=sc.nextInt();
    	System.out.println("enter max:");
    	int max=sc.nextInt();
    	int maxi=findCount(min);
    	int temp=min;
    	for(int i=min+1;i<=max;i++)
    	{
    		int ans=findCount(i);
    		if(ans>maxi)
    		{
    			maxi=ans;
    			temp=i;
    		}
    	}
    	System.out.println(temp);
    }
}
