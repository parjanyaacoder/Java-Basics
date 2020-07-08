import java.util.Scanner;
public class sparseMatrix {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int i,j,m,n,c=0;
	System.out.println("Enter number of rows and columns in matrices");
	 m=sc.nextInt();
     n=sc.nextInt();
	System.out.println("Enter matrix");
	int m1[][]=new int[m][n];
	for(i=0;i<m;i++)
	{
		for(j=0;j<n;j++)
		{
			m1[i][j]=sc.nextInt();
		}
	}
	
	for(i=0;i<m;i++)
	{
		for(j=0;j<n;j++)
		{
			if(m1[i][j]==0)
				c++;
		}
	}
	if(c>(m*n)/2)
		System.out.println("The matrix is a sparse matrix");
	else
		System.out.println("The matrix is not a sparse matrix");
}
}