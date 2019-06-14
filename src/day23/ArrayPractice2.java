package day23;

public class ArrayPractice2 {

	public static void main(String[] args) {
		int sum = 0;
		int temp ;
       int name [] = {1,5,8,9,12};
        name[2] = name[2] * 2	;
		System.out.print(name[2]);
		
		System.out.println();
		
		name[3] = name[0] + name[1]	;
		System.out.print(name[3]);
		
		System.out.println();
		
		name[4] = name[0] + name[1]	;
		System.out.print(name[4]);
		
		System.out.println();
		 
		temp = name[0];
		name[0]=name[4];
		name[4] = temp;
		System.out.println(name[0] );

		// Print them out using loop
			
		for(int i =0; i<name.length ; i++) {
			System.out.print(name[i] + " ");
		}
		System.out.println();
		
		for(int j =0; j<name.length ; j++) {
			sum = sum+name[j];
			
		}
		System.out.print(sum);
		
		System.out.println();
		
		//getting max
		int max = name[0];
		
		   for(int x =1; x<name.length; x++) {
			   
			 if(name[x]>max) {
				 max = name[x];
			 }  
			   
			   
		   }
		System.out.println(max);
		
		
		
	}

}
