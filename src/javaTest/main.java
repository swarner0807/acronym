package javaTest;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author stevenwarner
 */

public class main {
	
	static final Map<String, String> acronData = new HashMap<String, String>(); 
	static {
        acronData.put("wtf", "what the fuck");
        acronData.put("lol", "laugh out loud");
        acronData.put("dw", "don't worry");
        acronData.put("hf", "have fun");
        acronData.put("gg", "good game");
        acronData.put("brb", "be right back");
        acronData.put("g2g", "got to go");
        acronData.put("wp", "well played");
        acronData.put("gl", "good luck");
        acronData.put("imo", "in my opinion");
    	}
	
    public static void main(String[] args) {
         Scanner userInput = new Scanner(System.in);
         System.out.print("Enter a phrase: ");
         while (userInput.hasNext()) {
        	 String temp = userInput.next();
        	 if (acronData.containsKey(temp)) {
        		 System.out.print(acronData.get(temp) + " ");
        	 } else {
        		 System.out.print(temp + " ");
        	 }
         }        
    }
    
    
}
