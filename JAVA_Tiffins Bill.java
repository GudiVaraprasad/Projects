import java.util.*;
import java.io.*;
class Java_Tiffins
{
    public static void main (String[]args)
    {
      Scanner in=new Scanner(System.in);
       float total = 0;
       char order = 0;
       int quantity = 0;
       int count = 0;
       
       
    System.out.println(" Welcome to JAVA Tiffins !! ");
    System.out.println();
    System.out.println("This is the Menu of JAVA Tiffins");
    System.out.println("Please Select one item from the Menu.");
    System.out.println("\n");
    System.out.print("******** Order Menu *********");
    System.out.println("\n");
    System.out.println("A. Idly - Rs.20.00");
    System.out.println("B. Dosa - Rs.40.00");
    System.out.println("C. Puri - Rs.30.00");
    System.out.println("D. Vada - Rs.25.00");
    System.out.println("E. Chapathi/Parota - Rs.30.00");
    System.out.println("F. Upma - Rs.25.00");
    System.out.println("G. Pongal - Rs.30.00");
    System.out.println("H. Bonda - Rs.30.00");
    System.out.println("I.Masala Idiyappam - Rs.60.00");
    System.out.println("J.Tea/Coffee/Milk   - Rs.10.00");
    System.out.println("\n");

    float a = 20.00f;
    float b = 40.00f;
    float c = 30.00f;
    float d = 25.00f;
    float e = 30.00f;
    float f = 25.00f;
    float g = 30.00f;
    float h = 30.00f;
    float i = 60.00f;
    float j = 10.00f;

    do{
        System.out.print("Please Enter your order according to the Menu letters: ");
        order =in.next().charAt(0); 

        System.out.print("Enter the number of Orders you want: ");
        quantity = in.nextInt();

         if(order == 'a' || order == 'A')
         {
           System.out.println("Total Cost for " + quantity + " Idly is :" + (a*quantity));
           System.out.println("\n");
           total = total + (a*quantity);
           count = count++;
        }
        else if(order == 'b' || order == 'B')
        {
            System.out.println("Total Cost for " + quantity + " Dosa is :" + (b*quantity));
            System.out.println("\n");
            total = total + (b*quantity);
            count = count++;
        }
        else if(order == 'c' || order == 'C')
        {
            System.out.println("Total Cost for " + quantity + " Puri is :" + (c*quantity));
            System.out.println("\n");
            total = total + (c*quantity);  
            count = count++;
        }
        else if(order == 'd' || order == 'D')
        {
            System.out.println("Total Cost for " + quantity + " Vada is :" + (d*quantity));
            System.out.println("\n");
            total = total + (d*quantity);
            count = count++;
        }
        else if(order == 'e' || order == 'E')
        {
            System.out.println("Total Cost for " + quantity +  " Chapathi/Parota is :" + (e*quantity));
            System.out.println("\n");
            total = total + (e*quantity);
            count = count++;
        }
        else if(order == 'f' || order == 'F')
        {
            System.out.println("Total Cost for " + quantity +  " Upma is :" + (f*quantity));
            System.out.println("\n");
            total = total + (f*quantity);
            count = count++;

        }
        else if(order == 'g' || order == 'G')
        {
            System.out.println("Total Cost for " + quantity +  " Pongal is :" + (g*quantity));
            System.out.println("\n");
            total = total + (g*quantity);
            count = count++;

        }
        else if(order == 'h' || order == 'H')
        {
            System.out.println("Total Cost for " + quantity + " Bonda is :" + (h*quantity));
            System.out.println("\n");
            total = total + (h*quantity);
            count = count++;

        }
        else if(order == 'i' || order == 'I')
        {
           System.out.println("Total Cost for " + quantity +  " Masala Idiyappam is :" + (i*quantity));
           System.out.println("\n");
           total = total + (i*quantity);
           count = count++;

        }
        else if(order == 'j' || order == 'J')
        {
           System.out.println("Total Cost for " + quantity + " Tea/Coffee/Milk is :" + (j*quantity));
           System.out.println("\n");
           total = total + (j*quantity);
           count = count++;
        }
        else
        {
        System.out.println("Your selection isn't avaliable in our Menu!");
        System.out.println("\n");
        }    
    } while (count <=0);
        System.out.println();
        System.out.println("Your Bill is Rs." + total +"/-");
        System.out.println("Thank You for choosing JAVA Tiffins");
        System.out.println("Hope to see you again soon");
    }
}