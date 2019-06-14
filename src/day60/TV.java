package day60;
//TV as super class

//Smart_TV as sub class

public class TV {
  int channelCount=500 ;// for variable hiding only name is important
  
  public void play() {
	  System.out.println("playing TV");
  }
  public int channelCount() {
      System.out.println("channelCount method");
      return channelCount;
  }
  
  
}
