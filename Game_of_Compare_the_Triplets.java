import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[n];
        for(int i=0;i<a.length;i++)
        {
            a[i]=in.nextInt();
        }
        int[] b=new int[n];
        for(int i=0;i<b.length;i++)
        {
            b[i]=in.nextInt();
        }
          int count=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]>b[i])
            {
                count++;
            }
        }
        int count1=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]<b[i])
            {
                count1++;
            }
        }
        int[] c=new int[2];
        c[0]=count;
        c[1]=count1;
        for(int i=0;i<c.length;i++)
        {
           System.out.print(c[i]+" ");  
        }
    }
}
