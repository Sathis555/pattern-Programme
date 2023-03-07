package payilagam;
import java.util.Scanner;

public class PrintPattern {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	    System.out.println("Please enter the size of the diomand you want:");
	    byte row=sc.nextByte();
	    for(int i=0;i<row;i++){
	    	for(int j=row-i;j>0;j--){
		    	System.out.print("  ");
		    	}
	    	for (int k=0;k<=i;k++){
	    		System.out.print("* ");
	    	}
	    	for (int k=1;k<=i;k++){
	    		System.out.print("* ");
	    	}
        System.out.println("");
	            }
	    for(int i=row;i>=0;i--){
	    	for(int j=row-i;j>0;j--){
		    	System.out.print("  ");
		    	}
	    	for (int k=0;k<=i;k++){
	    		System.out.print("* ");
	    	}
	    	for (int k=1;k<=i;k++){
	    		System.out.print("* ");
	    	}
        System.out.println("");
	            }
	    
	}

}
