/**
 * Class for car dealership. 
 *
 */
public class Dealership {

	/**
	 * Main method creates a new car called e36, a 1998 328is
	 */
	public static void main(String[] args){
		Car e36 = new Car(1998, "328is");
		System.out.println("Car model is: " +e36.model);
	}
}
