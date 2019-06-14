package day54;

public class FinalMethod {

	 public final void makeAPhoneCall(String phoneNumber) {		 
		 System.out.println("Dial" + phoneNumber + "\n Press On Call");		 
	 }
}

  class Sub extends FinalMethod{
	  
	  //Cnnot override inherited final method
	  //public void makeAPhoneCall(String phoneNumber) {
		  
	  }
	  
  }