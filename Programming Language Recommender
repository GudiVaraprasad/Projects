import java.util.*;
import java.io.*;
public class ProgrammingLanguageRecommender
{
	public static void main(String args[])
	{
	    ProgrammingLanguageRecommender obj=new ProgrammingLanguageRecommender();
		Scanner in=new Scanner(System.in);
		System.out.println();
		System.out.println(" Welcome to 'Programming Language Recommender' ");
		System.out.println("This tool will help you to choose the best Programming language on your choice.");
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println();
		System.out.println("Why do you want to learn a Programming Language ?");
		System.out.println();
		System.out.println("1. Nothing Specific");
		System.out.println("2. Just For Fun");
		System.out.println("3. For Career");
		System.out.println("4. Startup Idea");
		System.out.println("5. Hacking");
		System.out.println("6. Exit this tool");
    System.out.println();
		int input = in.nextInt();
    System.out.println();
        
		switch(input)
		{
			case 1:
				System.out.println("You have choosen Nothing Specific");
				obj.NothingSpecific();
				break;
			case 2:
				System.out.println("You have choosen Just For Fun");
				obj.JustForFun();
				break;
			case 3:
				System.out.println("You have choosen For your Career");
				obj.Career();
				break;
			case 4:
				System.out.println("You have choosen Startup Idea");
				obj.StartupIdea();
				break;
			case 5:
				System.out.println("You have choosen Hacking");
				obj.Hacking();
				break;
			case 6:
				System.out.println("Thanking you for choosing this tool.");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Option choosen !");
				System.exit(0);
		}
    }
		public void NothingSpecific()
		{
		    Scanner in=new Scanner(System.in);
			System.out.println("You should learn - PYTHON");
			System.out.println("Python is an easy language to learn as well as really useful.");
		}

		public void JustForFun()
		{
		    Scanner in=new Scanner(System.in);
			System.out.println("Do you have any Brilliant Idea ?");
			System.out.println("1. Yes");
			System.out.println("2. No, Just learn for time being");
			System.out.println("Enter either 1 or 2");
			int input1=in.nextInt();
			switch(input1)
			{
				case 1:
					System.out.println("What Platform or field does it fall into ?");
					System.out.println("1. Websites");
					System.out.println("2. Applications");
					System.out.println("3. Gaming");
					System.out.println("Give your choice:");
					int input2=in.nextInt();
					if(input2==1)
					{
						System.out.println("You need to learn - HTML CSS and JAVASCRIPT.");
						System.out.println("JAVASCRIPT is widely being used in a lot of applications including web development (backend and frontend).");
						System.exit(0);
					}
					if(input2==2)
					{
						System.out.println("For Android - JAVA.");
						System.out.println("For iOS- Swift.");
						System.out.println("For both - Flutter/Dart.");
						System.exit(0);
					}
					if(input2==3)
					{
						System.out.println("You need to learn - C#");
						System.out.println("C# has a lot of uses, including making applications for Windows, game development with the Unity game engine (3d and 2d).");
						System.exit(0);
					}
					else
					{
						System.out.println("Thanking you for choosing this tool.");
						System.exit(0);
					}
					break;
				case 2:
					System.out.println("For an easy begining - PYTHON.");
					System.out.println("For Moderate level or hard stage - C Programming.");
					break;
				default:
					System.out.println("Invalid Option choosen !");
					System.exit(0);
			}
			System.exit(0);
		}

		public void Career()
		{
		    Scanner in=new Scanner(System.in);
			System.out.println("Choose your Career Target/Field :");
			System.out.println();
			System.out.println("1. Data Analytics.");
			System.out.println("2. Cyber Security.");
			System.out.println("3. Software Development.");
			System.out.println("4. Artificial Intelligence.");
			System.out.println("5. Job in big Tech Companies.");
			System.out.println();
			System.out.println("Give your choice :");
			int input3=in.nextInt();
			switch(input3)
			{
				case 1:
					System.out.println("To become a Data Scientist - Python, Ruby, SQL, Julia, Java, SAS.");
					break;
				case 2:
					System.out.println("To make a career in Cyber Security - Python, Ruby, C Programming.");
					break;
				case 3:
					System.out.println("For Software Development - C Programming, C++, Python");
					break;
				case 4:
					System.out.println("PYTHON and it's libraries has large application in the field of AI and Machine Learning.");
					break;
				case 5:
					System.out.println("Microsoft - C#");
					System.out.println("Google - PYTHON");
					System.out.println("Facebook - PYTHON");
					System.out.println("Amazon - JAVA");
					System.out.println("Apple - SWIFT and Objective-C ");
					System.out.println("Other - PYTHON and JAVA");
					break;
				default:
				System.out.println("Invalid Option choosen !");
				System.exit(0);
			}
			System.exit(0);
		}

		public void StartupIdea()
		{
		    ProgrammingLanguageRecommender obj=new ProgrammingLanguageRecommender();
		    Scanner in=new Scanner(System.in);
			System.out.println("Have a Startup Idea ?");
			obj.JustForFun();
		}

		public void Hacking()
		{
		    Scanner in=new Scanner(System.in);
			System.out.println("Wanna be Hacker ?");
			System.out.println("Learn PYTHON.");
			System.out.println("Develope to be an Ethical Hacker only.");
		}
}
