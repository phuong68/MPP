package Prob5;

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
	public static int totalFee(List<Student> std)
	{
	 	
		return std.stream()
				.map( s -> s.grd)
				.map( g -> g.fecal())
				.reduce(0,(a,b)-> a+b);
	}
	
 public static void main(String args[])
  {
		 Department dpt=new Department("Computer Science",1); 
		 Program p=new Program("Data Science Program");
		 Student std1=new Student("Mahd",1,new CS(4,4));
		 Student std2=new Student("Davis",1,new CS(3,2));
		 Student std3=new Student("Rick",1,new MIS(3,3));
		 p.addStd(std1);
		 p.addStd(std2);
		 p.addStd(std3);
		 System.out.println("Total fee:"+Program.totalFee(p.getstdlst()));
  }

}
