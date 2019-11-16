import java.util.*;
public class Main 
{
  public static int add(int a,int b)
  {
    int ans=0;
    ans=a+b;
    return ans;
  }
  public static int sub(int a,int b)
  {
    int ans=0;
    ans=a-b;
    return ans;
  }
  public static int mul(int a,int b)
  {
    int ans=0;
    ans=a*b;
    return ans;
  }
  public static float div(int a,int b)
  {
    float ans=0;
    ans=a/b;
    return ans;
  }
public static void main(String args[]) 
{
  Scanner in=new Scanner(System.in);
  int x=in.nextInt();
  int y=in.nextInt();
  System.out.println("Sum: "+add(x,y));
  Main main=new Main();                        //object or instance creation for class main
  System.out.println("Difference: "+main.sub(x,y));
  System.out.println("Product: "+main.mul(x, y));
  System.out.println("Division: "+main.div(x,y));
}
}