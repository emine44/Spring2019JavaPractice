package Mentoring;
class Calc {
private int x,y, result ;

   public int getX(){
      return x;
    }
  
  
   public int getY(){
      return y;
    }
  
  public void setX(int num1){
    this.x =num1;
  }
  
  public void setY(int num2){
    this.y =num2;
  }
  
  
  public int getResult(){
      return result;
    }
   public void setResult(int num3){
    this.result =num3;;
  }
  
  
  
  public void plus(){
    result=x +y;
    System.out.println(result);
    
  }
  
  public void minus(){
    result = x-y;
    System.out.println(result);
    
  }
  
  
}