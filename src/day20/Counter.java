package day20;

public class Counter {

	public static void main(String[] args) {
		
		
		// how many a letter showed up in this String
		String str = "Jaaaaaava";
		
		// go through each and every character
		//if I see a, it will increment my counter by 1
		
		int count =0;
		int x = 0;
		
		do {
			
			char c = str.charAt(x) ;
			if(c=='a') {
				System.out.println("Bingo!!");
				count++;
				
			}
			x++;
			
		}while(x<str.length());
		System.out.println(count);
		
	}

}
