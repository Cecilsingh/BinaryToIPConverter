#Import utilities
import java.util.Scanner;  

public class BinaryToIPConverter {

  public static void main(String[] args) {
  #Read user input
  Scanner in = new Scanner(System.in);  
  System.out.println("Please enter an IP Address.");  
		
  //Read ip address from the user and put into variable
  String ip = in.nextLine();  
		
  //Split ip address by dot(.)  
  String[] octetArray = ip.split("\\.");  
  for (String string : octetArray){  
  //Finds the primitive data type of a certain string  
    int octet = Integer.parseInt(string);  
	
  //Converts integer into binary string  
    String binaryOctet = Integer.toBinaryString(octet);  
		
  //Prints the corresponding binary string of the ip address  
    System.out.println(binaryOctet);  
  }//End loop
 }//End Main class  
}//End Public class

