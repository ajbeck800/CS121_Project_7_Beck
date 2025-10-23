public class Guesser {
	protected Boolean keepGoing;
	protected String menuRequest;

	public static void main() {
		Guesser g = new Guesser();
		
		while (keepGoing == true){
			g.menu();
			if (menuRequest == 0){
				keepGoing == false;
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
		
	public void humanGuesser(){
		System.out.println("Hi, My name is " + this.name);
	} // end sayHi
	
	public void computerGuesser(String name){
		this.name = name;
	} // end setName
	
	public String menu(){
		return this.name;
	} // end getName
} // end class def
