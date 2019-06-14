package repl;

import java.util.ArrayList;
import java.util.Arrays;

public class repl187 {

	public static void main(String[] args) {
		ArrayList<String> wordList = new ArrayList<String>(Arrays.asList("hi","hey","hi","yo"));
	    ArrayList<String> Lst = new ArrayList<String>();
	    //Lst.add(targetWord);
	   	//removeAll(wordList1,Lst.get(0));
	   	String targetWord = "hi";
	   	for(int i =0 ; i<wordList.size(); i++){
	   	  Lst.add(wordList.get(i));
	   	  }
	   	
	      removeAll(Lst,targetWord);
	   	
	   	}

	private static void removeAll(ArrayList<String> lst, String targetWord) {
		// TODO Auto-generated method stub
		
	}

	}

}
