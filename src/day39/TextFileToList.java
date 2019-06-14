package day39;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class TextFileToList {

	public static void main(String[] args) {

	 String fullPath = "/Users/emineyildirim/eclipse-workspace/Spring2019_Project1/src/day39/day39";
	 List<String> lineLst = getTextFileAsList(fullPath);
	 System.out.println(lineLst);
	 
	 System.out.println(lineLst.size());
	 
	 
	 //xls doc ppt pdf
	 String s = "erat_quisque_erat.xls";
	 //how do we get file extention
	 String fileExtention = s.substring(s.indexOf(".")+1);
	 System.out.println(fileExtention);
	 
	 int xlsCounter=0;
	 int docCounter=0;
	 int pdfCounter=0;
	 int pptCounter=0;
	 String max =lineLst.get(0);
	 
	    for (String each : lineLst) {
	    	String str = each.substring(each.indexOf(".")+1,each.length());
	    	if (str.equals("xls")) {
	    		
	    		xlsCounter++;
	  //longest xls file 		
	    		if(each.length()>max.length()) {
	   	    	 max = each;
	   	    	}
	    		
	    	} else if (str.equals("doc")) {
	    		docCounter++;
	    	} else if (str.equals("ppt")) {
	    		pptCounter++;
	    	
	    	} else if (str.equals("pdf")) {
	    		pdfCounter++;
	    	}
	    	
	    }
	 
	 System.out.println(xlsCounter);
	 System.out.println(docCounter);
	 System.out.println(pdfCounter);
	 System.out.println(pptCounter);
	 System.out.println("longest exal file " + max);
	 
	 
	 
	 
	 
	 
	 
	 
	 
	}

	  public static List<String> getTextFileAsList(String fullPath) {

	    List<String> allLines = null;
	    try {
	      allLines = Files.readAllLines(Paths.get(fullPath));
	    } catch (Exception e) {
	      System.out.println("Wrong file path probably");
	    }
	    return allLines;

	  }

}
