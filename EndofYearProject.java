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
	
	static boolean Applea = false;
	static boolean Watera = false;
	static boolean Tshirta = false;
	public static void main (String args[]) throws IOException{
		
		
	Scanner input = new Scanner (System.in);
	File Tshirt = new File("Music.txt");
	Scanner shirtscan = new Scanner(Tshirt);
	File water = new File("Water.txt");
	Scanner waterscan = new Scanner(water);
	File apple = new File("Apple.txt");
	Scanner applescan = new Scanner(apple);
	String[] strArray = new String[8];
	int j = 0;
	int extra =	10;	
	
	
	System.out.println("What do you want to do?");
	System.out.println("1-Play the game.");  
	System.out.println("2-Create an item.");
	String response = input.nextLine();		
	if(response.equals("2")){
		System.out.println("Fist print what item you want to user to guess.");
		String item = input.nextLine();
		item = input.nextLine();
		System.out.println("Your item is a " +item+ "." );
		FileWriter fw = new FileWriter(item+".txt");
		System.out.println("Now input the first hint.");
		String hint = input.nextLine();
		fw.write(hint);
		System.out.println("Now input the second hint.");
		String hint2 = input.nextLine();
		fw.write("\r\n");
		fw.write(hint2);
		System.out.println("Now input the third hint.");
		String hint3 = input.nextLine();
		fw.write("\r\n");
		fw.write(hint3);
		System.out.println("Now input the fourth hint.");
		String hint4 = input.nextLine();
		fw.write("\r\n");
		fw.write(hint4);
		System.out.println("Now input the fifth hint.");
		String hint5 = input.nextLine();
		fw.write("\r\n");
		fw.write(hint5);
		System.out.println("Now input the sixth hint.");
		String hint6 = input.nextLine();
		fw.write("\r\n");
		fw.write(hint6);
		String item2 = input.nextLine();
		fw.write("\r\n");
		fw.write(item);
		System.out.println("You are now done!.");
		
		fw.close();
		}
		
	if(response.equals("1")){
		System.out.println("");
		System.out.println("Chose what you want to play:");
		System.out.println("1-Stock three levels.");  
		System.out.print("2-User created level.");	
		String response2 = input.nextLine();	
			if(response2.equals("1")){
				int hints = 3;
				System.out.println("");	
				System.out.println("Level 1:");				
					
				while (applescan.hasNextLine()){
					String line = applescan.nextLine();
					strArray[j] = line;
					j++;
				}
				int i = 3;
				while (Applea == false){
	    		 	int aa = 1;	
	    		 	
					if(hints == 3){
						System.out.println(strArray[0]);
						System.out.println(strArray[1]);
						System.out.println(strArray[2]);						
					}

					System.out.println("Type 'Use Hint' to Use 1 out of " +hints+ " hints.");
					System.out.println("What am I?");
					System.out.println(" ");
					String answer = input.nextLine();
					System.out.println(" "); 
					//use hints
					if (answer.equals(strArray[6])){
    		 			System.out.println("You got it!!");
						Applea = true; 
					}
    		 		else{
    		 			System.out.println("Your answer is incorrect, be sure to check for caps!");
    		 		
    		 		
    		 		}
    		 		
    		 		if (answer.equals("Use Hint") && (hints > 0)){
    		 			hints = hints - 1;
						System.out.println(strArray[i]);
						i++;
					
					}
				
				}	
			    j = 0;
				while(Applea == true && Watera == false ){
					while (waterscan.hasNextLine()){
					String line = waterscan.nextLine();
					strArray[j] = line;
					j++;
				}
				int k = 3;
				while (Applea == true && Watera == false){
	    		 	int aa = 1;	
	    		 	
					if(hints == 3){
						System.out.println(strArray[0]);
						System.out.println(strArray[1]);
						System.out.println(strArray[2]);						
					}

					System.out.println("Type 'Use Hint' to Use 1 out of " +hints+ " hints.");
					System.out.println("What am I?");
					System.out.println(" ");
					String answer = input.nextLine();
					System.out.println(" "); 
					//use hints
					if (answer.equals(strArray[6])){
    		 			System.out.println("You got it!!");
						Watera = true; 
					}
    		 		else{
    		 			System.out.println("Your answer is incorrect, be sure to check for caps!");
    		 		
    		 		}
    		 		}
				}
				while(Watera == true && Tshirta == false){
			    j = 0;
			    
					while (shirtscan.hasNextLine()){
					String line = shirtscan.nextLine();
					strArray[j] = line;
					j++;
				}
				int k = 3;
				while (Watera == true && Tshirta == false){
	    		 	int aa = 1;	
	    		 	
					if(hints == 3){
						System.out.println(strArray[0]);
						System.out.println(strArray[1]);
						System.out.println(strArray[2]);						
					}

					System.out.println("Type 'Use Hint' to Use 1 out of " +hints+ " hints.");
					System.out.println("What am I?");
					System.out.println(" ");
					String answer = input.nextLine();
					System.out.println(" "); 
					//use hints
					if (answer.equals(strArray[6])){
    		 			System.out.println("You got it!!");
						Tshirta = true; 
					}
    		 		else{
    		 			System.out.println("Your answer is incorrect, be sure to check for caps!");
    		 		
    		 		
    		 		}
				}
				while(Watera == true && Tshirta == true){
				//Tshirt thing goes here 	
				}
			
			}	
				}
			
			
			}	  
			
			
			
			applescan.close();	
			
			}
		
			  

}

