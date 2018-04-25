package Problem5;

public class CS implements Graduate
{
	int fee;
	int courses;
	public CS(int f,int c)
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
	public int feecal() {
		
		return getFee() * getCourse() + 1500 ;
	}
	
	

}
