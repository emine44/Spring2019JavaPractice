package day53;

public class OnlineCourse extends Course {
	
	int capacity =300;

	public static void main(String[] args) {
		
		//Course java =new Course();
		//System.out.println(java.capacity);
		
		
		OnlineCourse sdet = new OnlineCourse();
		//System.out.println(sdet.capacity);
		sdet.showCapacity();
	}
		
		public void showCapacity() {
			
			//AS LONG AS YOU HAVE A FIELD CALLED capacity in this class
			//below line will always be interpreted as this.capacity capacity
			System.out.println(capacity);
			System.out.println(this.capacity);
			System.out.println(super.capacity);
		
		
	}
	
	
	
	
}
