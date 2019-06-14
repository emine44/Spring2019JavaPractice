package repl;

import java.util.ArrayList;

public class repl189 {

	public static void main(String[] args) {
		 ArrayList<Integer> numList1 = new ArrayList<>();
		 numList1.add(-2);
		 numList1.add(5);
		 numList1.add(-7);
		 numList1.add(6);
		 numList1.add(9);
		 
		System.out.println(appendPosSum(numList1));

	}

	 public static ArrayList<Integer> appendPosSum(ArrayList<Integer> lst){
		    int sum =0;
		    ArrayList<Integer> numList = new ArrayList<>(); 
		    for(int i =0; i<lst.size(); i++) {
				if(lst.get(i)>0){
				numList.add(lst.get(i));
				sum =sum+lst.get(i);
				}
			
			}
		    numList.add(sum); 
		  return numList;  
		    
		  }
		  
		  
	
	
	
	
}
