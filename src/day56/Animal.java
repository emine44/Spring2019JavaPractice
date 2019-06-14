package day56;

public abstract class Animal {

  public abstract void makeNoise(); 
  
}

// what if sub class is also abstract class 
// YOU ARE NOT REQUIRED TO IMPLEMENT ABSTRACT METHODS INHERITED FROM SUPER CLASS
abstract class Mammals extends Animal {
//abstract sub class have option to provide implementation
	//but you can optionally provide implementation so sub class of thisclass can use it as is
	//or override what's inherited
  @Override
  public void makeNoise() {
    System.out.println("mammals are making noise ");
  } 
  
  public abstract void eat(String foodName); 
  
  
}

class Horse extends Mammals{
  
//  @Override
//  public void makeNoise() {
//    System.out.println(" neigh neigh neigh");
//  }

  @Override // Checks whether we do it correctly
  public void eat(String foodName) {
    System.out.println("eating "+ foodName);
  }
  
  
}
