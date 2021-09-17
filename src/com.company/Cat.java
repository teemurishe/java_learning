public class Cat extends Animal {

   @Override
   public void speak() {
		System.out.println("Meow");
   }
   public void run(run_length) {
      if (run_dist < 200) {
         System.out.println(name + " has run " + run_dist + "meters");
      }
      else {
         break;
      }
   }
   public void swim() {
      System.out.println("Cats can't swim!");
   }
}