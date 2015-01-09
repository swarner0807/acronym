/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaTest;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author stevenwarner
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	
    	Map<String, String> acronData = new HashMap();
        acronData.put("wtf", "what the fuck");
        acronData.put("lol", "laugh out loud");
        acronData.put("hf", "have fun");
        acronData.put("gg", "good game");
        acronData.put("brb", "be right back");
        acronData.put("g2g", "got to go");
        acronData.put("wp", "well played");
        acronData.put("gl", "good luck");
        acronData.put("imo", "in my opinion");
        String phrase = "test";
    	
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
