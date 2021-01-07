/* Create a program that read from a file URLs, keep the only site, remove duplicates and sort */

import java.io.*; //File, IOException
import java.util.*; //Scanner, Collections, ArrayList

public class URLsVisited {
    //create string arraylist 
    private static ArrayList<String> myURLs = new ArrayList<String>();

    //constructor with filename
    public URLsVisited(String userFileName) throws IOException { 
        File file = new File(userFileName); 
        Scanner src = new Scanner (file); 

        while (src.hasNext()) {   
            String srcLine = src.nextLine(); //read line by line
            String[] diaxoristis = srcLine.split("/"); //split lines in '/' ans save to array
            this.myURLs.add(diaxoristis[0]); //save every first of the array
        }
    }  
    
    //method for duplicates
    public void removeDuplicates() {
        ArrayList<String> tmpList = new ArrayList<>(); 
        for (String s: this.myURLs){ 
            if (!tmpList.contains(s)){ 
                tmpList.add(s);
           }}
        Collections.sort(tmpList); 
        this.myURLs = tmpList; 
    }
    //method for print the results
    public void printAll() { 
        for (String s : this.myURLs){ 
            System.out.println(s); 
        }
    }
}
