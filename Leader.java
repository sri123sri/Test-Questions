package TechSaksham;

public class Leader {
	public static void findLead(int[] arr)
	{
		int count=0;
		int sum=0;
		int avg=0;
		int n=arr.length;
		int max=arr[n-1];
		System.out.println(max+" ");
		for(int i=n-2;i>=0;i--)
		{
			for(int j=i+1;j<n;j++)
			{
				count=count+1;
				sum=sum+arr[j];
				avg=sum/count;
				
			}
			if(avg<arr[i])
			{
				max=arr[i];
				System.out.println(max+" ");
			}
			
		}
	}
    public static void main(String[] args)
    {
    	int[] arr= {12,13,35,1,2,3};
    	findLead(arr);
    }
}
