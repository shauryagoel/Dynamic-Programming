
public class Shotest_path_in_maze
{
	
	public static void main(String[] args)
	{
		int maze[][]={{1,2,3},{4,8,2},{1,5,3}};
		int tc[][]=new int[maze.length][maze[0].length];
		
		tc[0][0]=maze[0][0];
		for(int i=1;i<maze[0].length;i++)
			tc[0][i]=tc[0][i-1]+maze[0][i];
		for(int i=1;i<maze.length;i++)
			tc[i][0]=tc[i-1][0]+maze[i][0];
		
		for(int i=1;i<maze.length;i++)
			for(int j=1;j<maze[0].length;j++)
				tc[i][j]=Math.min(tc[i-1][j],Math.min(tc[i][j-1],tc[i-1][j-1]))+maze[i][j];
			
		System.out.println(tc[maze.length-1][maze[0].length-1]);
	}
	
}
