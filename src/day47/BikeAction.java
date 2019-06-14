package day47;

import java.util.ArrayList;
import java.util.Arrays;

public class BikeAction {

	public static void main(String[] args) {
		
		Bike b1 = new Bike("Kawasaki", 4, 80);
		Bike b2 = new Bike("Ducati", 5, 90);
		Bike b3 = new Bike("Yamaha", 4, 88);
		Bike b4 = new Bike("Harley-Davidson", 3, 70);
		
        Bike.showCurrentCount();
        
        ArrayList <Bike> allBikes = new ArrayList<> (Arrays.asList(b1,b2,b3,b4));
        
        for( int i=0; i<allBikes.size(); i++) {
        	System.out.println(allBikes.get(i));	
        }
        
        System.out.println("---------------------");
        
        for(Bike each : allBikes) {
        	System.out.println(each.getId() + " ----" + each.getBrand());
        	each.speedUp(10);
        	System.out.println(each.toString());
        	
        }
        
        System.out.println("---------------------");
        
        b1.speedUp(10);
        System.out.println(b1.getSpeed());
        
        
        
        
	}

}
