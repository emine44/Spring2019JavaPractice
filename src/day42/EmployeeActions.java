package day42;

import java.util.ArrayList;

public class EmployeeActions {

	public static void main(String[] args) {
		
		
		Employee e1 = new Employee();
       e1.name ="Emine";
       e1.age =27;
       e1.salary =10.0;
       e1.title ="CTE Teacher";
       e1.printAllInfo();

		Employee e2 = new Employee();
      e2.name ="Hasan";
      e2.age =28;
      e2.salary =10000;
      e2.title ="Math Teacher";
	e2.printAllInfo();
	
	

	Employee e3 = new Employee();
   e3.name ="Kimsin";
   e3.age =5;
   e3.salary =1000;
   e3.title ="ne yaptigim belli degil";
    e3.printAllInfo();
    
    
    
    ArrayList <Employee> myPeople = new ArrayList <>();
    myPeople.add(e1);
    myPeople.add(e2);
    myPeople.add(e3);
    myPeople.add(new Employee() );
    
    System.out.println(myPeople.size());
    System.out.println(myPeople.get(3));
    
    ArrayList <String> names = new ArrayList<>();
    
    int cs=0;
    int ca=0;
    
   for(int i =0; i<myPeople.size(); i++) {
	   //store each item 
	  Employee each = myPeople.get(i);
	  //calling method using this variable
	  
	 if(each.salary>100) {
		 cs++;
		 
	 } 
	  
	 if(each.age<100) {

		 ca++;
	 } 
	 
	 if(each.salary>100 && each.age<100) {
		 
		names.add(each.name) ;
		 
	 }
	 
	 
		}
   System.out.println("Count of salary " + cs);
   System.out.println("Count of age  " + ca);
   System.out.println(names);
   
   
   
   
   
   }


}
