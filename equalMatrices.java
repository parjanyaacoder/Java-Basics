import java.util.Scanner;
public class equalMatrices {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int i,j,m,n;boolean f=true;
	System.out.println("Enter number of rows and columns in matrices");
	 m=sc.nextInt();
     n=sc.nextInt();
	System.out.println("Enter first matrix");
	int m1[][]=new int[m][n];
	int m2[][]=new int[m][n];
	
	for(i=0;i<m;i++)
	{
		for(j=0;j<n;j++)
		{
			m1[i][j]=sc.nextInt();
		}
	}
	System.out.println("Enter second matrix");
	for(i=0;i<m;i++)
	{
		for(j=0;j<n;j++)
		{
			m2[i][j]=sc.nextInt();
		}
	}
	for(i=0;i<m;i++)
	{
		for(j=0;j<n;j++)
		{
			if(m1[i][j]!=m2[i][j])
				{f=false;
				break;
				}
		}
	}
	if(!f)
		System.out.println("Matrices are unequal");
	else
		System.out.println("Matrices are equal");
}
}

		