package day20;

public class breakStatement {

	public static void main(String[] args) {
		
		//break statement is used to break out of switch and loops
		
		int x =10;
		do {
			
			System.out.println(x);
			x++;
			if(x>50) {
				break;
			}
			
		}while(x<100);

	}

}
