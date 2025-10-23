public class Guesser {
	protected String menuRequest;

	public static void main() {
		Guesser g = new Guesser();
		
		g.humanGuesser();
		g.computerGuesser();
		g.menu();
		System.out.println(g.menu());
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
