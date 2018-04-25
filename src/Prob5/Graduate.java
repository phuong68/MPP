package Prob5;

public interface Graduate 
{
	static int num_std=50;
	public static int numofStudent()
	{
		return num_std;
	}

    int getFee();
    int getCourse();
    
    default int scholarships() {
		return 0;
    	
    }
    
    default int fecal() {
    	return getFee() * getCourse() + 1000;
    }
}
