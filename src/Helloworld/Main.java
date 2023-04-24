package Helloworld;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	      Scanner scnr = new Scanner(System.in);
	      
	      boolean[] chptList = new boolean[16]; 
	      int includeChpt;
	      boolean atLeastOne = false;
	      int i, j;
	      
	      
	      for (i = 1; i <= 15; ++i) {
	         includeChpt = scnr.nextInt(); 
	         if (includeChpt==1) {
	            chptList[i] = true;
	         }
	         else {
	            chptList[i] = false;
	         }
	      }
	      
	      
	      for (i = 1; i <= 15; ++i) { 
	         if (chptList[i]) { 
	            System.out.print(i);  
	            atLeastOne = true;
	            if ( (i <= 13) &&
	                 (chptList[i + 1] && chptList[i + 2] )) { 
	               
	               j = i + 2; 
	               while ( (j <= 14) && (chptList[j + 1]) ) { 
	                  j += 1; 
	               }
	               System.out.print("-" + j + " ");
	               i = j; 
	            }
	            else {
	               System.out.print(" "); 
	            } 
	         }
	      }
	      if (!atLeastOne) { 
	         System.out.print("None ");
	      }
	      System.out.println();
	   }

}
