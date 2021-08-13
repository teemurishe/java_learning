public class Main {
	public static void main(String[] args) {

		//data types
		int health = 10;
		int medKit = 30;
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

		//hometask

		//task 1
		System.out.println("                        .8 ");
        System.out.println("                      .888");
        System.out.println("                    .8888");
        System.out.println("                   .8888");
        System.out.println("                   888");
        System.out.println("                   8");
        System.out.println("      .88888888888. .88888888888.");
        System.out.println("   .8888888888888888888888888888888.");
        System.out.println(" .8888888888888888888888888888888888.");
        System.out.println(".&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&'");
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&'");
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&'");
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@:");
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@:");
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@:");
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%.");
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%.");
        System.out.println("`%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%.");
        System.out.println(" `00000000000000000000000000000000000'");
        System.out.println("  `000000000000000000000000000000000'");
        System.out.println("   `0000000000000000000000000000000'");
        System.out.println("     `###########################'");
        System.out.println("       `#######################'");
        System.out.println("         `#########''########'");
        System.out.println("           `'''''''  `''''''");

        //task 2
        int x = 2;
        int y = 12;
            // y = x * y;
            y = x + y;
            x = y - x;
            y = y - x;
        System.out.println(x);
        System.out.println(y);

        //task 3
        name = "Timur";
        String text = "Hello, " + name + "!";
        System.out.println(text);

        //task 4
        int a = 4;
        //int a = 10;
        int b = 7;
        //int b = 12;
        //int sum = 1 + a + b;
        //int sum = 2 + a + b;
        int sum = 9 + a + b;
        //int sum = 4 + a + b;
        System.out.println("sum = " + sum);

        //task 5
		a = 2;
		b = 4;
		int c = 18;
		int d = 2;
		int result = (a + b + c) / d;
		System.out.println("Lessons remaining: " + result + " ones");

	}
}
