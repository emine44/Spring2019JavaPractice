package day51;

public class Assessment {
	
	int questionCount;
	int score;
	String type;
	
	static int timeLimit;//all assessment have one type of time limit

	
	public static void printTimeLimit() {
		
		
		System.out.println("time Limit: " + timeLimit);
		
	}
	
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Assessment [questionCount=" + questionCount +
				", score=" + score + 
				", type=" + type + "]";
	}
	
	

}
