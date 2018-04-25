package Problem2;

public class DefinedEmployees 
{
	String Id;
	String Name;
	int Age;
	String Status="Gender Verified";
	
	public DefinedEmployees()
	{
		
	}
	public DefinedEmployees(String i,String n, int a)
	{
		Id=i;
		Name=n;
		Age=a;
	}
	
	public DefinedEmployees(String i,String n, int a,String s)
	{
		Id=i;
		Name=n;
		Age=a;
		Status=s;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	
	public void setStatus(String s) {
		Status = s;
	}
	public String getStatus()
	{
		return Status;
	}
	
	
	@Override
	public String toString()
	{
		return "Id:"+this.getId()+" Name:"+this.getName()+" Age:"+this.getAge()+" Status:"+this.Status;
	}
	
	@Override
	public int hashCode(){
		 int result = 17;
		 result = 31 * result + this.getId().hashCode();                   // 1 bit   � 32-bit
 	     result = 31 * result + this.getName().hashCode();                                // 8 bits  � 32-bit 
		 result = 31 * result + this.getAge();   
		 result = 31 * result + this.getStatus().hashCode(); // 16 bits � 32-bit
		 return result;                               

	}
	
	

}
