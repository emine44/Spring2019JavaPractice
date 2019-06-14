package day29;

public class continueTask {

	public static void main(String[] args) {
		
		String [][] pizza= {{"mushroom","black olive","green pepper"},
		          {"spinach","green pepper","mushroom"},
		          {"black olive","black olive","spinach"},
		          {"mushroom","mushroom","red pepper"},
		          {"banana pepper","spinach","red pepper"},
		          {"mushroom","green pepper","green pepper"},
		          {"spinach","green pepper","mushroom"}};
		
		
		//Task 5 print all the value inside for loop and 
		//stop eating when see banana pepper
		
		  outer:
			    for (int i = 0; i < pizza.length; i++) {
			      
			      System.out.println("Slice number : " + (i+1) );
			      
			      for(int j=0 ; j < pizza[i].length ; j++ ) {
			        
			        if(pizza[i][j].equals("banana pepper") ) {
			          break outer; 
			        }      
			        System.out.print(pizza[i][j] + " | ");
			        
			      }
			      System.out.println();
			    }
			    

	}

}
