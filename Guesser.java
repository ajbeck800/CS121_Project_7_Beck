`public class Guesser {
	protected static boolean keepGoing;
	protected static String menuRequest;

	public static void main(String[] args) {
		Guesser g = new Guesser();
		
		while (keepGoing == true){
			g.menu();
			if (menuRequest == 0){
				keepGoing = false;
			} // end if
			else if (menuRequest == 1){
				g.humanGuesser();
			} // end else if
			else if (menuRequest == 2){
				g.computerGuesser();
			} // end else if
			else {
				System.out.println("Invalid selection. Select 0-2: ");
			} // end else
		} // end while
	} // end main

	public String menu(){
                System.out.println("0) Exit");
		System.out.println("1) Human Guesser");
		System.out.println("2) Computer Guesser");
		System.out.println("Select 0-2: ");
		int menuRequest = System.in.read();
		
		return menuRequest;
        } // end menu

	public void humanGuesser(){
		int guess = -999;
		int turns = 0;
		boolean keepGoing = true;
		int correct = (int)(Math.random() * 101);
		
		while (keepGoing = true){
			turns++;
			System.out.println("Please enter a number: ");
			int guess = System.in.read();
			
			if (guess < correct){
				System.out.println("too low...");
			} // end if
			else if (guess > correct){
				System.out.println("too high...");
			} // end else if
			else {
				System.out.println("got it!");
				keepGoing = false;
			} // end else
		} // end while
	} // end humanGuesser
	
	public void computerGuesser(){
		int lower = 1;
                int upper = 100;
                int turns = 0;
		boolean keepGoing = true;
                
                while (keepGoing = true){
                        int guess = ((lower+upper)/2);
			turns++;
                        System.out.println("Too (H)igh, Too (L)ow, or (C)orrect? ");
                        String feedback = System.in.read();

                        if (feedback == "h"){
                                upper = guess;
                        } // end if
                        else if (feedback == "l"){
                                lower = guess;
                        } // end else if
                        else {
                                keepGoing = false;
                        } // end else
                } // end while
	} // end computerGuesser
} // end class def
