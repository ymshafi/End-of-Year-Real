/**
 * @(#)EndofYearProject.java
 *
 *
 * @author 
 * @version 1.00 2015/5/14
 */
import java.io.*;
import java.util.Scanner;
public class EndofYearProject {
	
	public static void main (String args[]) throws IOException{
		
		
	Scanner input = new Scanner (System.in);
	
	File apple = new File("Apple.txt");
	Scanner applescan = new Scanner(apple);
	int extra =	10;	
	
	
	System.out.println("What do you want to do?");
	System.out.println("1-Play the game.");  
	System.out.print("2-Create an item.");
	int response = input.nextInt();	
	if(response == 2){
		System.out.println("Fist print what item you want to user to guess.");
		String item = input.nextLine();
		System.out.println("Your item is a " +item+ "." );
		FileWriter usercreateditem = new FileWriter(item+".txt");
		System.out.println("Now input the first hint.");
		String hint = input.nextLine();
		
		usercreateditem.close();
		}
		
	if(response == 1){
		System.out.println("");
		System.out.println("Chose what you want to play:");
		System.out.println("1-Stock three levels.");  
		System.out.print("2-User created level.");	
		int response2 = input.nextInt();	
			if(response2 == 1){
				int hints = 6;
				System.out.println("");	
				System.out.println("Level 1:");
					for(int x = 0; x < 3; x++){
					String appleq = applescan.nextLine();
					System.out.println(appleq);	
						
					}
					
					System.out.println("What am I?");
					String answer = input.nextLine();
						//need to compare line 11 to answer, dont know how
					}	  
			
			
			
			
			
			}
		applescan.close();	
			  

}
}


