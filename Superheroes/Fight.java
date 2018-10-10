/**
 * Solution for second coursework exercise.
 * 
 * To revise, add your own comments to this code.
 * 
 * @author Martin
 *
 */
public class Fight {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/* Create a new Superhero. Use the name of the object to establish the identity of the hero,
		 * as well as passing the name of the hero to the constructor. No strength value is provided
		 * for the first hero, so should use the first constructor.
		 */
		Superhero ironMan = new Superhero("Iron Man");
		
		/* Create a second Superhero *with* a given strength. An initial strength is supplied here, 
		 * so should provide some way to do specify a hero's strength. Best way is through a second constructor.
		 */
		Superhero captainAmerica = new Superhero("Captain America", 50);
		
		/* Print the result of the fight by invoking the fight method, and directly printing 
		 * the result (which is a 'printable' Superhero object with a toString() method).
		 */
		System.out.println(ironMan + " fights " + captainAmerica + ", " + ironMan.fight(captainAmerica) + " wins.");
		
		// Power up the superhero, by updating the superhero's strength value
		ironMan.powerUp(100);
		
		// Run the fight again.
		System.out.println(ironMan + " fights " + captainAmerica + ", " + ironMan.fight(captainAmerica) + " wins.");
		
	}

}