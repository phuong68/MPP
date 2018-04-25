package Prob2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main 
{
	public static void main(String[] args)
	{
		List<Employees> emplist=new ArrayList<Employees>()
		{
			{
				add(new Employees("28-12331", "Tong Ren",21,"Male"));
				add(new Employees("99-22223", "David Lynch", 23, "Male"));
				add(new Employees("28-12335", "Ayla Maersk",21,"Female"));
				add(new Employees("99-22255", "Ayman Bayed", 33, "Male"));
				add(new Employees("44-85356", "Yunatan Blue",21,"Unknown"));
				add(new Employees("78-12331", "Nicolase Bryen",21,"Male"));
				add(new Employees("99-22258", "Daniyal Mahd", 19, "Male"));
				add(new Employees("44-85331", "Joyce Mac",21,"Female"));	
				add(new Employees("99-22223", "Jordan Creek",21,"Unknown"));
			}
		};
		try
		{
// Uncomment it when you are ready and implemented getEmpList
			Map<String,DefinedEmployees> empmap=Main.getEmpList(emplist);
			empmap.forEach((k,v)->System.out.println("Key:"+ k+"   Value:"+ v));
		}
		catch(Exception ex)
		{
			System.out.println("Exception occured:"+ex);
		}
		
	}
	//getEmpList return Map of DefinedEmployees using the List of Employeed who have Sex 
	//either defined as Male or Female. For Map key you can use any variables of class
	//however in sample output I used Key=ID + Name.
	public static Map<String,DefinedEmployees> getEmpList(List<Employees> emplist) 
	{
		return emplist.stream().filter(emp-> emp.getGender().equals("Male") || emp.getGender().equals("Female"))
						
						.collect(Collectors.toMap(emp -> emp.getId()+emp.getName(),
								emp -> new DefinedEmployees(emp.getId(), emp.getName(),emp.getAge())));
						
		
	}
	
	//Sample output
	//	Key:28-12335Ayla Maersk   Value:Id:28-12335 Name:Ayla Maersk Age:21 Status:Gender Verified
	//	Key:99-22258Daniyal Mahd   Value:Id:99-22258 Name:Daniyal Mahd Age:19 Status:Gender Verified
	//	Key:99-22223David Lynch   Value:Id:99-22223 Name:David Lynch Age:23 Status:Gender Verified
	//	Key:28-12331Tong Ren   Value:Id:28-12331 Name:Tong Ren Age:21 Status:Gender Verified
	//	Key:44-85331Joyce Mac   Value:Id:44-85331 Name:Joyce Mac Age:21 Status:Gender Verified
	//	Key:99-22255Ayman Bayed   Value:Id:99-22255 Name:Ayman Bayed Age:33 Status:Gender Verified
	//	Key:78-12331Nicolase Bryen   Value:Id:78-12331 Name:Nicolase Bryen Age:21 Status:Gender Verified
	
}
