package Problem2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Main 
{
	public static void main(String[] args)
	{
		List<Employees> emplist=new ArrayList<Employees>();
		emplist.add(new Employees("12331", "Tong Ren",21,"Male"));
		emplist.add(new Employees("12335", "Ayla Maersk",21,"Female"));
		emplist.add(new Employees("22255", "Ayman Bayed", 33, "Male"));
		emplist.add(new Employees("85356", "Yunatan Blue",21,"Unknown"));
		emplist.add(new Employees("12331", "Nicolase Bryen",21,"Male"));
		emplist.add(new Employees("22258", "Daniyal Mahd", 19, "Male"));
		
		
		
		Map<String,Employees> empmaplist=new HashMap<String,Employees>();
		empmaplist.put("33-12331", new Employees("12331", "Tong Ren",21,"Male"));
		empmaplist.put("99-22223",new Employees("22223", "David Lynch", 23, "Male"));
		empmaplist.put("28-12335",new Employees("12335", "Ayla Maersk",21,"Female"));
		empmaplist.put("99-22255",new Employees("22255", "Ayman Bayed", 33, "Male"));
		empmaplist.put("44-85356", new Employees("85356", "Yunatan Blue",21,"Unknown"));
		empmaplist.put("78-12331",new Employees("12331", "Nicolase Bryen",21,"Male"));
		empmaplist.put("99-22258",new Employees("22258", "Daniyal Mahd", 19, "Male"));
		empmaplist.put("44-85331",new Employees("85331", "Joyce Mac",21,"Female"));	
		
		
		Map<String,DefinedEmployees> result=Main.getEmpList(empmaplist,emplist);
		result.forEach((k,v)->System.out.println("Key:"+ k+"   Value:"+ v));
		
	}
	
	//Implement this method as per requirements whenever you are ready to
	public static Map<String,DefinedEmployees> getEmpList(Map<String,Employees> empmaplist,List<Employees> emplist) 
	{
		return	 empmaplist.values().stream()
									.filter(emp->emplist.contains(emp) && (emp.Gender=="Male" || emp.Gender=="Female" ))
									.collect(Collectors
											.toMap(emp ->emp.getId()+emp.getName(),emp -> 
														new DefinedEmployees(emp.getId(),
																							emp.getName(),
																							emp.getAge()
																						)
												)
										);
									
		
		
	}
}
