package da26;
import java.util.*;
public class SplittingTheString {

	public static void main(String[] args) {
		
		
        String str = "Life is challenging but not as people, we are truly a test for each other on; patience, virtue and more";
        String[] words = str.split(" ");
        System.out.println(Arrays.toString(words));
        
        String[] parts = str.split("a");
        System.out.println(Arrays.toString(parts));
        
        String[] letters = str.split("e");
        System.out.println(Arrays.toString(letters));;

	}

}
