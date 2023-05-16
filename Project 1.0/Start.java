import java.util.Scanner; 
public class Start extends Admin{
static 	int nigga = 0;
static 	int wigga = 0;

public static void main(String[] args) {

	Scanner input =new Scanner(System.in);
Start ob = new Start();
Admin admins [] = new Admin[10];
Police polices[] = new Police[10];

int a;
String b;
do{

System.out.println("Press 1 for Admin Menu");
System.out.println("Press 2 for Police Menu");
System.out.println("Press 3 for Civilian Menu");
System.out.println("Press 4 to file a Emergency");

a = input.nextInt();
switch(a)
{
	case 1:
	do{
		System.out.println("Press 0 to add Police Info");
		System.out.println("Press 1 to add Police");
		System.out.println("Press 2 to delete Police");
		System.out.println("Press 4 to Show All Police Info");
		a=input.nextInt();
		switch(a)
		{
			case 0:

			
			System.out.println("Enter Police Name : ");
			 	String l=input.nextLine();
			System.out.println("Enter Police Id : ");
		
			String c= input.nextLine();
			System.out.println("Enter Police Gender : ");
			String d=input.nextLine();
			System.out.println("Enter Police Join Date");
			String e=input.nextLine();
			System.out.println("Enter Police Active Status ");
			String f = input.nextLine();
		
			admins[nigga]= new Admin(l,c,d,e,f);
				

				break;
				case 1:
				
					ob.addPolice(admins[nigga]);
					nigga++;
				
				break;
				case 2:
				System.out.println("Enter The Serial of Police : ");
				a= input.nextInt();
				ob.deletePolice(admins[a]);
				break;

				case 3:
				System.out.println("Enter the serial you want to update : ");
              int m= input.nextInt();

ob.deletePolice(admins[m]);
			System.out.println("Enter Police Id : ");
		
			 c= input.nextLine();
              System.out.println("Enter Police Name : ");
			 	 l=input.nextLine();
			System.out.println("Enter Police Gender : ");
		 d=input.nextLine();
			System.out.println("Enter Police Join Date");
			 e=input.nextLine();
			System.out.println("Enter Police Active Status ");
			 f = input.nextLine();
	admins[m]= new Admin(l,c,d,e,f);

			ob.addPolice(admins[m]);
		
				
				break;
				case 4:
				ob.showAllPoliceInfo();
				break;
				default:
					System.out.println("Returning");
					break;
				}
			}while(a!=6);


			case 2 :
			do{
		System.out.println("Press 0 to add Criminal Info");
		System.out.println("Press 1 to add Criminal");
		System.out.println("Press 2 to delete Criminal");
		System.out.println("Press 4 to Show All Criminal Info");
		a=input.nextInt();
		switch(a)
		{
			case 0:

			System.out.println("Enter Criminal Name : ");
			 String l=input.nextLine();
			System.out.println("Enter Criminal Id : ");
			String c= input.nextLine();
			System.out.println("Enter Criminal Gender : ");
			String d=input.nextLine();
			System.out.println("Enter Crime Date : ");
			String e=input.nextLine();
		
			polices[wigga]= new Police(l,c,d,e);
				
				break;
				case 1:
				
					ob.addCriminal(polices[nigga]);
					wigga++;
					
				
				break;
				case 2:
				System.out.println("Enter The Serial of Criminal: ");
				a= input.nextInt();

				ob.deleteCriminal(polices[a]);
				break;
				case 3:
				break;
				case 4:
				ob.showAllCriminalInfo();
				break;
				default:
					System.out.println("Returning");
					break;
				}
			}while(a!=6);
		



			



			}



				
			}while(a!=7);
			

		}

	}