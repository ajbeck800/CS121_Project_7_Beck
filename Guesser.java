import java.util.*;

public class Guesser {
	Scanner scanner = new Scanner(System.in);	
	
	public static void main(String[] args) {
		boolean keepGoing = true;
	       	String menuRequest = "";
		Guesser g = new Guesser();
		
		while (keepGoing == true){
			menuRequest = g.menu();
			if (menuRequest.equals("0")){
				keepGoing = false;
			} // end if
			else if (menuRequest.equals("1")){
				g.humanGuesser();
			} // end else if
			else if (menuRequest.equals("2")){
				g.computerGuesser();
			} // end else if
			else {
				System.out.println("Invalid selection.");
			} // end else
		} // end while
	} // end main

	public String menu(){
		System.out.println("0) Exit");
		System.out.println("1) Human Guesser");
		System.out.println("2) Computer Guesser");
		System.out.println("Select 0-2: ");
		String menuRequest = scanner.nextLine();

		return menuRequest;
        } // end menu

	public void humanGuesser(){
		int guess = -999;
		int turns = 0;
		boolean keepGoing = true;
		int correct = (int)(Math.random() * 101);
		
		while (keepGoing = true){
			turns++;
			System.out.println(turns + ") Please enter a number: ");
			try {
				guess = Integer.parseInt(scanner.nextLine());;
			} // end try
			catch (Exception e){
				System.out.println(e.getMessage());
			} // end catch

			if (guess < correct){
				System.out.println("too low...");
			} // end if
			else if (guess > correct){
				System.out.println("too high...");
			} // end else if
			else {
				System.out.println("got it!");
				keepGoing = false;
				break;
			} // end else
		} // end while
	} // end humanGuesser
	
	public void computerGuesser(){
		int guess;
		int lower = 1;
		int upper = 100;
		int turns = 0;
		boolean keepGoing = true;
		
		while (keepGoing = true){
			guess = ((lower+upper)/2);
			turns++;
			System.out.println(turns + ") I guess " + guess);
			System.out.println("Too (H)igh, Too (L)ow, or (C)orrect? ");
			String feedback = scanner.nextLine().trim().toLowerCase();;
			
			if (feedback.equals("h")){
				upper = guess;
			} // end if
			else if (feedback.equals("l")){
				lower = guess;
			} // end else if
			else {
				keepGoing = false;
				break;
			} // end else
                } // end while
	} // end computerGuesser
} // end class def
