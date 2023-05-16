import java.util.Scanner;

class Admin extends Police{

String policeName;
String policeId;
String policeGender;
String joinDate;
String activeSatus;

public Admin [] listOfPolice = new Admin[100];
public int totalPolice = 0;


Admin(){}
Admin(String policeName, String policeId, String policeGender, String joinDate,String activeSatus)
{
this.policeName = policeName;
this.policeId = policeId;
this.policeGender = policeGender;
this.joinDate = joinDate;
this.activeSatus = activeSatus;


}


public int showPoliceInfo(){
System.out.println("Name : "+policeName);
System.out.println("Id : "+policeId);
System.out.println("Gender : "+policeGender);
System.out.println("Join Date : "+joinDate);
System.out.println("Active status :"+activeSatus);
return 0;

}
public void showAllPoliceInfo(){
	
	for (int i = 0;i<totalPolice ;i++ ) {
		System.out.println(listOfPolice[i].showPoliceInfo());
		
	}
	if(totalPolice==0)
	{
		System.out.println("Total Police"+totalPolice);
	}

}


public void addPolice(Admin add)
{
listOfPolice[totalPolice]= add;


totalPolice++;

}

public void deletePolice(Admin add)
{

	int check = 0;
	for (int i = 0; i<totalPolice;i++)
	{
		if(listOfPolice[i].policeId==add.policeId)
		{
			for(int j =i; j<totalPolice; j++)
				{
					listOfPolice[j]= listOfPolice[j+1];
				}
		
				totalPolice--;
				check = 1;
		}
	}
	if(check ==0)
	{
		System.out.println("The Police is not present");
	}
}


public void updatePolice(Admin add, Admin newadd)
{
		
	for (int i = 0; i<totalPolice;i++)
	{
		if(listOfPolice[i].policeId==add.policeId)
		{
			for(int j =i; j<totalPolice; j++)
				{
					listOfPolice[j]= listOfPolice[j+1];
				}
			
				
		}
	}
	
listOfPolice[totalPolice+1]= newadd;



}


}