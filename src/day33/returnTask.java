package day33;

public class returnTask {

	public static void main(String[] args) {
		
		int [] num = {2,5,9,6,5,12};
		String []str = {"gh","rty","tg","sr"};
		String aa="Java loves Zukhra";
		System.out.println(getSum(num));
		System.out.println(getMax(num));
		System.out.println(addAll(str));
		System.out.println(getLet(aa));

	}
	public static int getSum(int [] arr) {
		
		int sum =0;
		for(int i=0; i<arr.length; i++) {
			
			sum= sum + arr[i];
			
		}
		return sum;
}
	public static String addAll(String[] arr) {
		String con = " ";
        for(int i=0; i<arr.length; i++) {
			
			con= con + " " + arr[i];
			
		}
		return con;
	}
   public static int getMax(int [] arr) {
		
		int max=arr[0];
		for(int i=1; i<arr.length; i++) {
		
			if(max<arr[i]) {
				max= arr[i];
			}
			
		}
		return max;
}
	
   public static String getLet(String str) {
	   
	   String str2[] = str.split(" ");
	   
	   
	   String result =" ";
	   
	   for(int i=0; i<str2.length-1; i++) {
	   result =result + " * " +str2[i].charAt(0)+ "" + str2[i+1].substring(1,str2[i+1].length());
	   
	
	   }
	   return result;
	   
	   
   }
	
   
   
   
   
   
   

	}
	
	


