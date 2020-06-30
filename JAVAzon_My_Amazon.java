import java.util.*;
class My_Amazon_JAVAzon{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int cont1=2;
		int i=0;
		String name[]=new String[10];
		long phn[]=new long[10];
		String usr[]=new String[10];
		String psw[]=new String[10];
		String item[]=new String[5];
		int cost[]=new int[5];
while(cont1==2){	
	int cont=2;
	while(cont==2){
        System.out.print(" 1.Sign In\n 2.Sign Up\n Choose an option : ");
		int opt=Integer.parseInt(sc.nextLine());
		System.out.println("\n-------------------------------------------");
		cont=opt;
		int wron=0;
		if(opt==1){while(wron==0){
		System.out.print(" Username : ");
    	String user=sc.nextLine();
    	System.out.print(" Password : ");
    	String pswd=sc.nextLine();
    	System.out.println("\n-------------------------------------------------");
    	for(int j=0;j<i;j++){
    		boolean s=user.equals(usr[j]);
    		boolean s1=pswd.equals(psw[j]);
    		if(s==true && s1==true){
    			wron=1;int cartcon1=1;
    			while(cartcon1==1){
    			item[0]="Laptop";cost[0]=69999;
    			item[1]="Mobile";cost[1]=29999;
    			item[2]="Head Phones";cost[2]=2999;
    			item[3]="Wireless Mouse";cost[3]=499;
    			item[4]="Wireless Keyboard";cost[4]=599;
    			int cartcon=1;
                int tcost=0;
    			while(cartcon==1){
    			System.out.println("\t\t1."+item[0]+" : "+cost[0]);
    			System.out.println("\t\t2."+item[1]+" : "+cost[1]);
    			System.out.println("\t\t3."+item[2]+" : "+cost[2]);
    			System.out.println("\t\t4."+item[3]+" : "+cost[3]);
    			System.out.println("\t\t5."+item[4]+" : "+cost[4]);
    			System.out.println("------------------------------------------------");
                System.out.print(" Give product option : ");
    				int cartopt=Integer.parseInt(sc.nextLine());
                    tcost=tcost+cost[cartopt-1];
                    System.out.print(" Will you like to:\n 1.Add to Cart\n 2.place order\n Select your option : ");
                    cartcon=Integer.parseInt(sc.nextLine());
                    System.out.println("\n------------------------");
    			}
    			System.out.println(" The total cost is "+tcost);
    			System.out.println(" Enter the delivery address : ");
    			String address1 =sc.nextLine();
    			String address2 =sc.nextLine();
    			String address3 =sc.nextLine();
    			System.out.println("\t\tYour order has been placed Successfully!");
    			System.out.println("\t\tThe order will be delivered within 4 days");
    			System.out.println("\t\tOrder Summary\n\t\t-------------\n\t\tTotal Cost:"+tcost);
    			System.out.println("\t\tDelivery Address : \n\t\t----------------");
    			System.out.println("\t\t"+address1+"\n \t\t"+address2+"\n \t\t"+address3+"\n---------------------------------");
    			System.out.print(" 1.Continue\n 2.Logout\n option : ");
    			cartcon1=Integer.parseInt(sc.nextLine());}
    			System.out.println("--------------------");
    			System.out.print(" 1.End Programme\n 2.SignIn/Signup\n option : ");
    			cont1=Integer.parseInt(sc.nextLine());
            }
    		else System.out.print(" Invalid Username or Password!\n");
    	}
    }
}

		if(opt==2){
		System.out.print(" Name : ");
		name[i]=sc.nextLine();
		System.out.print(" Mobile Number : ");
		phn[i]=Long.parseLong(sc.nextLine());
		System.out.print(" Username : ");
		usr[i]=sc.nextLine();
		System.out.print(" Passwprd : ");
		psw[i]=sc.nextLine();
		i++;
        System.out.print(" Your Account has been successfully created!\n");
        System.out.println("-------------------------------------------");
		}
		if(opt!=1 && opt!=2)System.out.print("Invalid option\n");}
	}}
}
