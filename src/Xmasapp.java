

import static java.lang.System.*; 
	//import java.io.*;
	//import java.util.*;
	
public class Xmasapp {
	

	
	    public static void main(String[] args) {
	    	
	        //Scanner scan = new Scanner(in);
	        //out.print("please enter a number: ");
	        //int temp = scan.nextInt();
	    	int five = 5;
	        int x = (five-1)*2 +1; 
	        int y = x/2;  // calculate how many spaces you need to print before the stump
	        int z = 1;  // initial # of * you need to print
	        
	        for(int i=0; i<five; i++) //determines how many lines you print 
	        {
	            for(int g=0; g<=y; g++) //determines how many spaces you print
	            {
	                out.print(" ");
	            }
	            for(int k = 0; k<z; k++) // determines how many * you print 
	            {
	                out.print("*");
	            }
	            out.println(); 
	            y--;
	            z+=2; //add 2 for the 1,3,5,7 increment
	        }
	        for(int i =0; i<=x/2; i++) //prints the spaces you need until you reach the middle
	        {
	            out.print(" ");
	        }
	        out.println("*"); // the stump!
	    }
	}