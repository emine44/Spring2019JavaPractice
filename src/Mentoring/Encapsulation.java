package Mentoring;

class Db {
	  private String data;
	  private int yint;
	  
	  public String getData(){
	    return data;
	    
	  }
	  
	  public void setData(String name2){
	    this.data =name2;
	    
	  }
	  
	  public int getYint(){
	    return yint;
	  }
	  
	  public void setYint(int y){
	    this.yint =y;
	  }
	  
	  public void insertData(String a , int b){
	    
	    this.data =a;
	    this.yint =b;
	    
	  }
	  
	}