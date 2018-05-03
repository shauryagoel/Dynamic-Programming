
public class Coin_Change
{
	
	public static void main(String[] args)
	{
		int[] coins={2,3,5};
		int n=9;
		int ans[]=new int[n+1];
		
		ans[0]=1;
		
		for(int i=0;i<coins.length;i++)
			for(int j=coins[i];j<=n;j++)
				ans[j]+=ans[j-coins[i]];
			
//		for(int i=1;i<=n;i++)                  // This does not work due to base case issues
//			for(int j=0;j<coins.length;j++)
//				if(i>=coins[j])
//					ans[i]+=ans[i-coins[j]];
		
		System.out.println(ans[n]);
	}
	
}
