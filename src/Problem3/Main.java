package Problem3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) 
	{
		List<Students> stdlist=new ArrayList<Students>()
				{
					{
						add(new Students("111","Tong","Ren","Fairfield",21));
						add(new Students("222", "David","Lynch","Iowa City", 23));
						add(new Students("333", "Ayla","Maersk","Iowa City",21));
						add(new Students("444", "Ayman","Bayed","Des Moines",33));
						add(new Students("555", "Yunatan","Adam","Des Moines",21));
						add(new Students("666", "Nicolase","Bryen","Kirkwood",21));
						add(new Students("777", "Daniyal","Mahd","Cedar Rapid",19));
						add(new Students("888", "Joyce","Lam","Cedar Rapid",21));	
						add(new Students("999", "Jordan","Creek","Indianola",21));
					}
				};

				System.out.println("String of student after sorting is:\n"+getStdList(stdlist));
	}
	
	//Implement this method as per requirements whenever you are ready to
	public static String getStdList(List<Students> stdlist) 
	{
		return stdlist.stream()
				.sorted(Comparator.comparing(Students::getCity).reversed().thenComparing(Students::getL_Name).reversed())
				.map( st -> st.l_Name+st.f_Name+" "+st.City)
				.collect(Collectors.joining("\n"));
		
		 
	}
	
}
