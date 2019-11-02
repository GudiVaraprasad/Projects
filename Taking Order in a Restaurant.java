import java.util.*;
import java.io.*;
class Java_Tiffins
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println(" Welcome to JAVA Tiffins !! ");
        in.nextLine();
        System.out.println("First tell me, How many people are in your group ? : ");
        int customers = in.nextInt();
        String Customer_Name[] = new String[customers];
        for( int i = 0; i < Customer_Name.length; i++)
        {
            System.out.print("Enter the name of Customer : " + (i+1) + ".");
            Customer_Name[i] = in.nextLine();   
            in.nextLine();
            
            String[] Menu = {"No Selection", "Idly", "Dosa", "Puri", "Vada", "Chapathi", "Upma", "Pongal", "Bonda", "Masala Idiyappam", "Tea/Coffee/Milk"};
        double[] Menu_Price = new double [11];
             Menu_Price [0] = 0.00;
             Menu_Price [1] = 20.00; 
             Menu_Price [2] = 40.00;
             Menu_Price [3] = 30.00;
             Menu_Price [4] = 25.00;
             Menu_Price [5] = 30.00;
             Menu_Price [6] = 25.00;
             Menu_Price [7] = 30.00;
             Menu_Price [8] = 30.00;
             Menu_Price [9] = 60.00;
             Menu_Price [10] = 10.00;
             
             System.out.print("Please Select one item from the Menu.");
             System.out.print("*********** Order Menu *********");
             System.out.println();
             System.out.println("1. **No Selection** is Rs.0.00");
             System.out.println("2. Idly - Rs.20.00");
             System.out.println("3. Dosa - Rs.40.00");
             System.out.println("4. Puri - Rs.30.00");
             System.out.println("5. Vada - Rs.25.00");
             System.out.println("6. Chapathi/Parota - Rs.30.00");
             System.out.println("7. Upma - Rs.25.00");
             System.out.println("8. Pongal - Rs.30.00");
             System.out.println("9. Bonda - Rs.30.00");
             System.out.println("10.Masala Idiyappam - Rs.60.00");
             System.out.println("11.Tea/Coffee/Milk   - Rs.10.00");
             System.out.println("Please enter your Selection : ");
             int Selection = in.nextInt(); 
             String[] Menu1 = new String[Selection];
             
             in.nextLine();
             System.out.println("Thank you, " + Customer_Name[i] + ". Your Order consists of : " +Selection);
             in.nextLine();
        }
        System.out.println("Your Order will arrive soon");
        in.nextLine();
        System.out.println("Thank You for choosing JAVA Tiffins");
        System.out.println("Hope to see you again");
    }
}