package day60;

public class Smart_TV extends TV {

	int channelCount =100;
	
	@Override
	public void play() {
		  System.out.println("playing Smart_TV");
	  }
	
	@Override
	 public int channelCount() {
	        System.out.println("channelCount method Smart_TV");
	        return channelCount;
	    }
	 
	 public static void main(String[] args) {
		 
		 TV c1 = new Smart_TV();
		System.out.println(c1.channelCount());
		 
	 }
}
