import java.util.*;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int cont1=2;
		int i=0;
		String name[]=new String[50];
		long phn[]=new long[20];
		String usr[]=new String[20];
		String psw[]=new String[30];
    while(cont1==2)
    {	
	    int cont=2;
	  while(cont==2)
	  {
        System.out.print(" 1.Sign In\n 2.Sign Up\n 3.Exit\n Choose an option : ");
		int opt=Integer.parseInt(sc.nextLine());
		System.out.println("\n----------------------------------------------------");
		cont=opt;
		int wron=0;
		if(opt==1)
		{
		    while(wron==0)
		    {
		        System.out.print(" Username : ");
    	        String user=sc.nextLine();
    	        System.out.print(" Password : ");
    	        String pswd=sc.nextLine();
    	        for(int j=0;j<i;j++)
    	        {
    		        boolean s=user.equals(usr[j]);
    	        	boolean s1=pswd.equals(psw[j]);
    		        if(s==true && s1==true)
    		        {
    			        System.out.print(" Your are logged in successfully\n You can enjoy this social account now! Have some good time  ");
    			        wron++;
                    }
    		        else
    		        {
    		          System.out.print(" Invalid Username or Password!\n"); 
    		          wron++;
    		        }
    		System.out.println("\n----------------------------------------------------------------------------");
    		System.out.println(" If you want to continue, ");
        	}
        }
    }
    
		if(opt==2)
		{
		    System.out.println("Please enter your details to login ");
		    System.out.println();
		    System.out.print(" Name : ");
		    name[i]=sc.nextLine();
		    System.out.print(" Mobile Number : ");
		    phn[i]=Long.parseLong(sc.nextLine());
		    System.out.print(" Username : ");
		    usr[i]=sc.nextLine();
		    System.out.print(" Password : ");
		    psw[i]=sc.nextLine();
		    i++;
		    System.out.println();
            System.out.print(" Your Account has been created successfully !\n");
            System.out.println("--------------------------------------------------------");
		}
		
		if(opt==3)
		{
		    System.exit(0);
		}
		
		if(opt!=1 && opt!=2 && opt!=3)
		{
		  System.out.print("Invalid option\n");  
		}
    }
  }
 }
}
