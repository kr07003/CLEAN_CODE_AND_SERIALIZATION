package EPAM._TASK4;

import java.util.*;

public class Client 
{
    public static void main( String[] args )
    {
    	String automated=null;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the total area of the house");
		int total_area=scan.nextInt();
		Construction obj=new Construction();
		String choice1=null;
		do
		{
			System.out.println("\nEnter your choice: ");
			System.out.println("1.Standard Material\n2.Above Standard Material\n3.High Standard Material\n4.High standard Material and Fully automatic home");
			int choice=scan.nextInt();
			if(choice!=4){
				System.out.println("Do you want a fully automated house(y/n)");
				automated=scan.next();
				}
			switch(choice)
			{
			case 1:
				if(automated.equalsIgnoreCase("y"))
					System.out.println(obj.construct(total_area,1900));
				else
					System.out.println(obj.construct(total_area,1200));
				break;
			case 2:
				if(automated.equalsIgnoreCase("y"))
					System.out.println(obj.construct(total_area,2200));
				else
					System.out.println(obj.construct(total_area,1500));
				break;
			case 3:
				if(automated.equalsIgnoreCase("y"))
					System.out.println(obj.construct(total_area,2500));
				else
					System.out.println(obj.construct(total_area,1800));
				break;
			case 4:
				System.out.println(obj.construct(total_area,2500));
				break;	
			}
			System.out.println("Do you want to change your choice y/n?");
			choice1=scan.next();
		}while(choice1.equalsIgnoreCase("Y"));
		scan.close();
    }
}
                     