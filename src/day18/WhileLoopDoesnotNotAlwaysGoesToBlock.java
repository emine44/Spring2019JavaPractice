package day18;

public class WhileLoopDoesnotNotAlwaysGoesToBlock {

	public static void main(String[] args) {
		
		
		int x=100;
		while(x>200) {
			
			System.out.println("do something");
			x  =1000;
		}
        System.out.println("End");
	}

}
