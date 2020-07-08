import java.util.*;

public class transposeMatrix {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int i,j,m,n;
	System.out.println("Enter number of rows and columns in matrices");
	 m=sc.nextInt();
     n=sc.nextInt();
	System.out.println("Enter matrix");
	int m1[][]=new int[m][n];
	int tm1[][]=new int[n][m];
	for(i=0;i<m;i++)
	{
		for(j=0;j<n;j++)
		{
			m1[i][j]=sc.nextInt();
		}
	}
	
	for(i=0;i<n;i++)
	{
		for(j=0;j<m;j++)
		{
	         tm1[i][j]=m1[j][i];
		}
	}

	for(i=0;i<n;i++)
	{
		for(j=0;j<m;j++)
		{
			System.out.print(tm1[i][j]+" ");
		}
		System.out.println();
	}
	
		
	
}
}
