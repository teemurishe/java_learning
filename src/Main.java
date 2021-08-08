public class Main {
	public static void main(String[] args) {
		//data types
		int health = 10;
		int medKit = 30
		String name = "Johns";
		double damage = 35.5;
		boolean isAlive = true;
		char plus = '+';
		//ariphmetics
		health = 150;

		health = 150 * 2;
		health = 150 / 3;
		health = 150 + 3;
		health = 150 - 15;
		//output to console
		System.out.println(name + ": " + health);
		//changing variable value
		health -= 70;
		System.out.println("You were damaged! Take a Medical kit!");

		health += medKit;
		System.out.println("You took a kit. Yout health is " + health);
	}
}