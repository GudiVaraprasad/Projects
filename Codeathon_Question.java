/* Write a program to create two matrices of (any input size/dimension M*N) and print results
of addition, subtraction and multiplication. Check and validate the dimension for each of
the operation. For example: If dimensions of two matrices are not same, the addition can not
be performed. So, if this situation occurs you have to print “Dimensions of matrices should be
same”. */


import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter no. of rows of 1st Matrix: ");
        int m=in.nextInt();
        System.out.print("Enter no. of columns of 1st Matrix: ");
        int n=in.nextInt();
        int[][] a=new int[m][n];
        int[][] sum=new int[m][n];
        int[][] diff=new int[m][n];
        System.out.println("Enter the elements of 1st Matrix: ");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=in.nextInt();
            }
        }
        System.out.print("Enter no. of rows of 2nd Matrix: ");
        int M=in.nextInt();
        System.out.print("Enter no. of columns of 2nd Matrix: ");
        int N=in.nextInt();
        int[][] b=new int[M][N];
        System.out.println("Enter the elements of 2nd Matrix: ");
        for(int i=0;i<M;i++)
        {
            for(int j=0;j<N;j++)
            {
                b[i][j]=in.nextInt();
            }
        }
          System.out.println("Addition of two Matrices is:");
        if(M!=m && N!=n)
        {
          System.out.println("Dimensions of matrices should be same.");
        }
        if(M==m && N==n)
        {
           for(int i=0;i<m;i++)
          {
            for(int j=0;j<n;j++)
            {
               sum[i][j]=a[i][j]+b[i][j];
               System.out.print(sum[i][j]+" ");
            }
            System.out.println();
          }  
        }
        System.out.println("Subtraction of two Matrices is:");
        if(M!=m && N!=n)
        {
          System.out.println("Dimensions of matrices should be same.");
        }
        if(M==m && N==n)
        {
           for(int i=0;i<m;i++)
          {
            for(int j=0;j<n;j++)
            {
               diff[i][j]=a[i][j]-b[i][j];
               System.out.print(diff[i][j]+" ");
            }
            System.out.println();
          }  
        }
        int[][] mul=new int[m][N];
        System.out.println("Multiplication of two Matrices is:");     
        if(m==n || n==M)
        {
          for(int i=0;i<m;i++)
          {    
              for(int j=0;j<N;j++)
            {    
                mul[i][j]=0;      
              for(int k=0;k<n;k++)      
              {      
                 mul[i][j]=mul[i][j]+a[i][k]*b[k][j];      
              }  
              System.out.print(mul[i][j]+" ");  
            }  
            System.out.println();    
          }    
        }
    }
}
