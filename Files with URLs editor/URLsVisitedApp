/* Main program for URLs VIsited */

import java.io.*;  // IOException
import java.util.*; // Scanner

public class URLsVisitedApp {

    public static void main(String[] args) {
        
        Scanner user = new Scanner(System.in);
        System.out.println("Which filename do you want to analyze?"); 
        String userFileName = user.nextLine();  
        System.out.println("The File analyzed is:" + "\n" + userFileName); 
        fileAnalyzer(userFileName); 
    }

    public static void fileAnalyzer(String userFileName) {

        try {
            URLsVisited file = new URLsVisited(userFileName); 
            System.out.println("------------------------------------------");
            System.out.println("------- VISITED WEB SITES -------");
            System.out.println("------------------------------------------");
            file.printAll(); 

            System.out.println("------------------------------------------");
            System.out.println("----- UNIQUE WEB SITES VISITED ----");
            System.out.println("------------------------------------------");
            file.removeDuplicates(); 
            file.printAll(); 
            
        } catch (IOException ex) { 
            System.out.println(ex); 
            System.out.println("Could not find the file" + userFileName + ". "+"\n" + "Please incert a valid path and filename");
            System.out.println("------------------------------------------");
            System.out.println();}
    }
}
