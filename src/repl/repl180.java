package repl;

import java.util.ArrayList;
import java.util.List;

public class repl180 {

	public static List<String> main(String[] args) {
		
		Object r1;
		ArrayList<String> listOne = new ArrayList<>(Arrays.asList(r1));
        
        Object r2;
		ArrayList<String> listTwo = new ArrayList<>(Arrays.asList(r2));
         
        listOne.addAll(listTwo);    //Merge both lists
        List<String> combinedList = new ArrayList<>(listOne); 
        
        return combinedList;
 

	}

}
