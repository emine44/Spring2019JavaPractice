package day56;

//IMPLEMENTING A INTERFACE ALSO BUILDING A PARENT CHILD RELATIONSHIP 

//WE USE IMPLEMENTS KEYWORD RATHER THAN EXTENDS used by a class
//the class must implements every abstract method 
public class OnlineStudent implements Teachable {

	@Override
	public void canLean() {
		System.out.println("can learn by hardwork");
		
	}

	@Override
	public void doHomework() {
		System.out.println("will do all homework");
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(Teachable.STUDY_HARD);
		OnlineStudent o =new OnlineStudent();
		o.canLean();
		o.doHomework();
		
		
	}

}
