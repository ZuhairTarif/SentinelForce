import java.util.Scanner;


class Police{

String policeName;
String policeId;
String policePassword;
String joinDate;
String activeSatus;
String criminalName;
String criminalId;
String criminalAge;
String criminalGender;
public Police [] listOfCriminal = new Police[100];
public int totalCriminal = 0;


Police(){}
Police(String criminalName, String criminalId, String criminalAge, String criminalGender)
{
this.criminalName = criminalName;
this.criminalId = criminalId;
this.criminalAge = criminalAge;
this.criminalGender = criminalGender;


}


public int showCriminalInfo(){
System.out.println("Name : "+criminalName);
System.out.println("Id : "+criminalId);
System.out.println("Age : "+criminalAge);
System.out.println("Gender : "+criminalGender);
return 0;

}
public void showAllCriminalInfo(){
	
	for (int i = 0;i<totalCriminal ;i++ ) {
		System.out.println(listOfCriminal[i].showCriminalInfo());
		
	}
	if(totalCriminal==0)
	{
		System.out.println("Total Criminal "+totalCriminal);
	}

}


public void addCriminal(Police criminal)
{
listOfCriminal[totalCriminal]= criminal;
System.out.println("Criminal of id "+" "+listOfCriminal[totalCriminal].criminalId+" is added");

totalCriminal++;

}

public void deleteCriminal(Police police)
{

	int check = 0;
	for (int i = 0; i<totalCriminal;i++)
	{
		if(listOfCriminal[i].criminalId==police.criminalId)
		{
			for(int j =i; j<totalCriminal; j++)
				{
					listOfCriminal[j]= listOfCriminal[j+1];
				}
				System.out.println("Criminal Id "+listOfCriminal[i].criminalId+" "+" is Deleted");
				totalCriminal--;
				check = 1;
		}
	}
	if(check ==0)
	{
		System.out.println("The Criminal is not present");
	}
}


public void updateCriminal(Police crime)
{

}


}