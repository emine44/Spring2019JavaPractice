package day57;

public class IceCoffe implements Drinkable{
	
	int size;
	
	public IceCoffe(int size) {
		this.size =size;
	}

	@Override
	public void drink() {
		System.out.println("You dring coffe");
		
	}

	@Override
	public String toString() {
		return "IceCoffe [size=" + size + "]";
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}
	
	

}
