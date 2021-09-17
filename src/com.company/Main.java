/* lesson 1
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
*/
/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static void sum_self(int num1, int num2){
        System.out.println(num1 + num2);
    }

    public static void main(String[] args) throws IOException { 
        BufferedReader reader = new
        BufferedReader(new
            InputStreamReader(System.in)); //setting up input

        Random random = new Random();
        int a = Integer.parseInt(reader.readLine()); //inputting numbers
        int b = Integer.parseInt(reader.readLine());
        int result = a + b;
        int result2 = Integer.sum(a, b); //summing numbers with a method
        System.out.println(result);

        double num = 1.0 / 7;
        System.out.println(String.format("%.2f", num));

        int num3 = random.nextInt(30);
        System.out.println(num3);

        //task 1
        a = Integer.parseInt(reader.readLine());
        b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        result = a * (b + (c / d));
        System.out.println(result);

        //task 2
        Scanner nameInput = new Scanner(System.in); //input a string
        String name = nameInput.nextLine(); //getting input data
        System.out.println("Hello, " + name + "!");

        //task 3
        float float_a = random.nextFloat();
        System.out.println(String.format("%.3f", float_a));

        //task 4
        System.out.println(a + " " + b + " " + c + " " + d);

        //task 5
        int year = Integer.parseInt(reader.readLine());

        if( year % 4 == 0 & year % 400 == 0){
            System.out.print("The year is leap");
        }else{
            System.out.print("The year isn't leap");
        }
    }
}
*/
package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Scanner;
import com.company.Cat;

/*public class Main {
    public static void main(String[] args) throws IOException {
       System.out.println("Question 1. What's the number of our planet in Solar System?");
       int rightAnswer = 3;
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //reading input
       int answer = Integer.parseInt(reader.readLine()); //input to a variable
       if (answer == rightAnswer) {
           System.out.println("Right!");
       } else {
           System.out.println("Incorrect, try again.");
       }

       System.out.println("Question 2. What do can you see while sleeping?");
       String answerRight = "dreams";
       reader = new BufferedReader(new InputStreamReader(System.in));
       String answerUser = reader.readLine();
       answerUser = answerUser.toLowerCase(Locale.ROOT); //making user's words lowercased
       int result = answerUser.compareTo(answerRight); //compare symbols number
       if (result == 0) {
           System.out.println("Right!");
       } else {
           System.out.println("Incorrect, try again.");
       }

       for (int i = 0; i < 10; i++) { //brackets: counting variable name, number of repeats, action with counter after repeat
            System.out.println("The for cycle is working for " + i + " times.");

       System.out.println("Question 3. What's Russian capital?");
       answerRight = "Moscow";
       reader = new BufferedReader(new InputStreamReader(System.in));
       String answer3 = reader.readLine();
       result = answer3.compareTo(answerRight);
       while (result != 0) {
           System.out.println("Incorrect, try again.");
           answer3 = reader.readLine();
           answer3 = answer3.toLowerCase(Locale.ROOT);
           result = answer3.compareTo(answerRight);
           if (result == 0) {
               break;
           }
       }
       System.out.println("Right!");
       System.out.println("Thanks for playing!");
       }
   }
}
*/

/*
public class Main {
   public static void main(String[] args) throws IOException{
       //task 1
       sum(5, 5);
       //task 2
       text("Java coding is easy!");
       text("Kava is an OOP language!");
       text("Java is crossplatform!");
       //task 3
       javaLearn();
       //task 4
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       int n = Integer.parseInt(reader.readLine());
       System.out.println("With Java I would earn " + n + " thousand rubles per hour.");
       //task 5
       int year = Integer.parseInt(reader.readLine());
       leap(year);
   }

   public static void sum(int a, int b) {
       int c = a + b;
       System.out.print(c);
   }
   public static void text(String text) {
       for (int i = 0; i < 2; i++) {
           System.out.println(text);
       }
   }
   public static void javaLearn() {
       for (int i = 0; i < 10; i++) {
           System.out.println("I");
           System.out.println("want to");
           System.out.println("create");
           System.out.println("cool");
           System.out.println("games,");
           System.out.println("that's");
           System.out.println("why");
           System.out.println("I");
           System.out.println("learn");
           System.out.println("Java");
       }
   }
   public static void leap(int year) {
       if (year % 4 == 0 & year % 100 != 0 | year % 400 == 0) {
           System.out.println("The year is leap");
       }
       else {
           System.out.println("The year isn't leap");
       }
   }
}*/

//lesson 6
/*public class Main {
    public static void main(String args[]) {
        Cat cat1 = new Cat("Oliver", 6);
        Cat cat2 = new Cat("Pumpin", 5);
        cat1.sayMeow();
        cat2.sayMeow();
    }

    public static void main(String args[]) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Person("Dasha Koreyka", "ABOBA", "kareykadasha@tiktok.com", "12121212121", 12000, 12);
        persArray[2] = new Person("Alexey Shevtsov", "Expert", "itpedia@plaza.agency", "+380635993686", 1000000000000, 165125)
        persArray[3] = new Person("Igor Tokac", "Kreslo master", "igorchezh@kreslo.com", "88005553535", 666666666, 32)
        persArray[4] = new Person("Valeriy Albetovich", "Amogus", "amogus@aboba.ru", "66666666666", 13, 40);
        for (i = ; i > persArray.length; i ++) {
            if (i.age > 40) {
                System.out.println(repsArray);
            }
        }
    }
}*/

//lesson 7
/*
public class Main {

   public static void main(String[] args) {

       Animal drujok = new Animal("Druzhok");
       drujok.animalInfo();
       drujok.jump();
       Cat kitty = new Cat("Kitty", "white");
   }
}*/