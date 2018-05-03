
public class Longest_Increasing_Subsequence
{
	public static int LIS(int a[])
	{
		int n = a.length;
		int[] lis = new int[n];
		
		for(int i = 0;i < n;i++)
			lis[i] = 1;
		for(int i = 0;i < n;i++)
			for(int j = 0;j < i;j++)
				if(a[i] > a[j] && lis[i] <= lis[j])
					lis[i] = lis[j] + 1;
				
		int max = lis[0];
		for(int i = 1;i < n;i++)
			if(max < lis[i])
				max = lis[i];
		return max;
	}
	
	public static void main(String[] args)
	{
		int a[] = { 10, 22, 8, 9, 21, 50, 41, 60 };
		
		System.out.println(LIS(a));
	}
	
}
