package Q2;

public class Admin {
	
	Department[] departments;
	
	public Admin(Department[] depts) {
		departments	= depts;	
	}
	
	public String hourlyCompanyMessage() {
		
		String tmp="";
		
		try {
			for(Department d: departments) {
				tmp += format(d.getName(),d.nextMessage());
				tmp +="\n";
			}
		}
		catch(EmptyQueueException e)
		{
			System.out.println(e.getMessage());
		}
		
		return tmp;
	}
	
	public String format(String name, String msg)
	{
		return name + ":" + msg;
	}
	
}
