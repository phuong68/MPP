package Prob5;

public class MIS implements Graduate
{
	int fee;
	int courses;
	public MIS(int f,int c)
	{
		fee=f;
		courses=c;
	}
	
	public int getFee()
	{
		return this.fee;
	}
	public int getCourse()
	{
		return this.courses;
	}

	@Override
	public int scholarships() {
		
		return 2500;
	}

	@Override
	public int fecal() {
		
		return getFee() * getCourse() + 1700;
	}
	
	
}
