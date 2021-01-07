/* The AMKA (Social Security number) is in essence the work and insurance ID of every employee, pensioner and dependent member of their family in Greece.
   In this project we ask user to enter his "AMKA" and the programm check if it's a valid Social Security Number. 
   By its details, we get informed for users gender and date of birth. */

import java.util.*;  
import java.io.*;   
import java.lang.Object; 

public class Amka
{
    public static void main(String[]args) {   
        boolean loop = false;      
        Scanner Amka = new Scanner(System.in);  
        String str=new String( );   
        char choice;
        int a=0;
        do{ 

            do{ if(a==2){System.out.println("This is not a number"); }  

                                                          
                System.out.println("Please, type your Social Security Number: "); 
                str = Amka.nextLine(); 

                      
                while (str.length() != 11) {  //AMKA length must be 11 numbers
                    System.out.println("The input length doesn't seen to be AMKA. ");
                    System.out.println("Please, type your Social Security Number: ");
                    str = Amka.nextLine();}  
                
                            
                for (int i = 0; i<str.length(); i++) 
                    if (!Character.isDigit(str.charAt(i))) { // AMKA must not contain letters
                        a=2;  
                        loop=true;
                    }
                                    
                    else
                        loop=false;
                                       
            }
            while (loop == true);

              
            String[]arr=str.split("");  
            int [] arR=new int [arr.length];                                
  
            for(int i=0;i<arr.length;i++){
                arR[i] = (Integer.parseInt(arr[i])); 
            }

            int age=0 ;
            String sex=null;

            if    (arR[4]!=0)
                age = 2020-(1900+((arR[4])*10)+(arR[5]));
                      
            else if (arR[4]==0)
                age = 2020-(2000+((arR[4])*10)+(arR[5]));

            
            for(int i=0;i<arr.length;i++)
                   
                if (arR[9]%2==1)
                    sex="MAN";

             
                else 
                    sex="WOMAN";

                    
            System.out.println( );
            System.out.println("Results");
            System.out.println("============");
            System.out.println("Age: "+age);
            System.out.println("Sex: "+sex);
            System.out.println("============");

                          
            System.out.println( );
            System.out.println( "Would you like to run the programagain for different AMKA? (y/n)" );
            choice = Amka.nextLine().charAt(0); 
        } while(((choice == 'y') || (choice == 'Y')));

          
    
    }}
