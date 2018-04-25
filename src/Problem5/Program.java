package Problem5;

import java.util.ArrayList;
import java.util.List;

public class Program 
{
	
	private List<Student> students = new ArrayList<Student>();
	private Department dpt; 
	private String name;
	public Program(String n)
	{
		name=n;
		//dpt=d;
	}
	public void addStd(Student std)
	{
		students.add(std);
	}
	public List<Student> getstdlst()
	{
		return students;
	}
	
	private static int totalFee(List<Student> getstdlst) {
	
			return getstdlst.stream()
									.map( st -> st.grd.feecal())
									.reduce(0,(a,b)->a+b).intValue();
		
	}
	
 public static void main(String args[])
  {
		 Department dpt=new Department("Computer Science",1); 
		 Program p=new Program("Data Science Program");
		 Student std1=new Student("Mahd",1,new CS(4,4));//1516
		 Student std2=new Student("Davis",1,new CS(3,2));//1506
		 Student std3=new Student("Rick",1,new MIS(3,3));//1709
		 p.addStd(std1);
		 p.addStd(std2);
		 p.addStd(std3);
		 System.out.println("Total fee:"+Program.totalFee(p.getstdlst()));
  }
 


}
