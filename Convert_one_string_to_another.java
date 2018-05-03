
public class Convert_one_string_to_another
{
	
	public static void main(String[] args)
	{
		String a="ABCD";
		String b="CADB";
		int m=a.length();
		int n=b.length();
		
		int temp[][]=new int[m+1][n+1];
		for(int i=0;i<=m;i++)
			for(int j=0;j<=n;j++)
			{
				if(i==0)
					temp[i][j]=j;
				else if(j==0)
					temp[i][j]=i;
				else if(a.charAt(i-1)==b.charAt(j-1))
					temp[i][j]=temp[i-1][j-1];
				else
					temp[i][j]=1+Math.min(Math.min(temp[i-1][j],temp[i][j-1]),temp[i-1][j-1]);
			}
		
		System.out.println(temp[m][n]);
	}
	
}
