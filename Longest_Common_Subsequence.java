
public class Longest_Common_Subsequence
{
	public static void main(String[] args)
	{
		String a="BCFE";
		String b="ABCDEF";
		
		int len_a=a.length();
		int len_b=b.length();
		
		int[][] lcs=new int[len_a+1][len_b+1];
		
		for(int i=1;i<=len_a;i++)
			for(int j=1;j<=len_b;j++)
			{
				if(a.charAt(i-1)==b.charAt(j-1))
					lcs[i][j]=lcs[i-1][j-1]+1;
				else
					lcs[i][j]=Math.max(lcs[i-1][j],lcs[i][j-1]);
			}
		
		System.out.println(lcs[len_a][len_b]);
		
		for(int i=0;i<=len_a;i++)
		{
			for(int j=0;j<=len_b;j++)
				System.out.print(lcs[i][j]+" ");
			System.out.println();
		}
	}
	
}
