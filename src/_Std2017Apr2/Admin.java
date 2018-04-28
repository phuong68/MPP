package _Std2017Apr2;

public class Admin {
	//implement
	Department[] depts;
	
	
	public Admin(Department[] depts) {
		super();
		this.depts = depts;
	}

	public String hourlyCompanyMessage() {
		String tmp="";
		try {
			for (Department dep: depts) {
				tmp+=format(dep.getName(),dep.nextMessage());
				tmp+="\n";
			}
		}catch(EmptyQueueException e) {
			
		}
		return tmp;
		
	}
	
	public String format(String name, String msg) {
		return name +":" + msg;
		
	}
}
