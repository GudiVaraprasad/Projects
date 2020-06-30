import java.util.*;
public class Main 
{
  static Scanner in=new Scanner(System.in);
  static int ch;
  static int accno;
  static int bal;
 public static void create()
 {
   System.out.println("enter acc no");
   accno=in.nextInt();
   System.out.println("account created");}
 public static void deposit(int n)
 {
   bal=bal+n;
   System.out.println("amount deposited");
   System.out.println("new balance is "+balance());
 }
 public static void widthdraw(int n)
 {
   bal=bal-n;
   System.out.println("amount debited");
   System.out.println("new balance is "+balance());
 }
 public static int balance()
 {
   return bal;
 }
public static void main(String arg[]) 
{
 do
 {
   System.out.println("Enter your option");
   System.out.println("1.create account");
   System.out.println("2.deposit");
   System.out.println("3.widthdraw");
   System.out.println("4.balance");
   System.out.println("5.exit");
   ch=in.nextInt();
   switch(ch)
   {
    case 1:
    create();
    break;
    case 2:
    System.out.println("enter amount to deposit");
    int dep=in.nextInt();
    deposit(dep);
    break;
    case 3:
    System.out.println("enter amount to widthdraw");
    int wid=in.nextInt();
    widthdraw(wid);
    break;
    case 4:
    System.out.println("balance: "+balance());
    break;
    case 5:
    System.exit(0);
    break;
    default:System.out.println("invalid choice");
    System.exit(0);
   }
 }while(ch<=5);
}
}
