package Fridays;

import java.util.ArrayList;
import java.util.Arrays;
class Main {
	  public String blogDb(ArrayList<String[]> r,String id)  {
	  
			String [] arr = new String[3];
			 for(int i=0; i<r.size(); i++){
		    
				 arr[i]=Arrays.toString(r.get(i));

			 }
			 //System.out.println(Arrays.toString(arr));
			 
			  String [][]arr2 = new String[3][3];
			 
			 for(int i =0; i<3; i++) {
				 for(int k=0; k<3; k++) { 
					 String a [] =arr[i].split(",");
					 arr2[i][k]= a[k];
				 }
			 }
			String canim ="";
	 
			if(arr2[0][0].contains(id)) 
				canim = arr2[0][1] + "\n" + arr2[0][2].substring(0,arr2[0][2].length()-1);
			if(arr2[1][0].contains(id)) 
				canim = arr2[1][1] + "\n" + arr2[1][2].substring(0,arr2[1][2].length()-1);	
	   if(arr2[2][0].contains(id)) 
				canim = arr2[2][1] + "\n" + arr2[2][2].substring(0,arr2[2][2].length()-1);
		
		return canim;
			 
	 // return a;
	    
	   
	  }
	  
	  public static void main(String[] args) {
	    Main m = new Main();
	    ArrayList<String[]>  arr = new ArrayList<String[]>();
	    arr.add(new String[]{"1","title 1","content"});
	    arr.add(new String[]{"2","title 2","content"});
	    arr.add(new String[]{"3","title 3","content3"});
        
	    String post = m.blogDb(arr,"3");
	    System.out.print(post);
	    //should output:
	    //title 3 
	    //content3
	  }
	    
	  }//end main