public class Dog extends Animal {

   @Override
   public void speak() {
      System.out.println("Haw!");
   }
   public void run(run_length) {
      if (run_dist < 500) {
         System.out.println(name + " has run " + run_dist + "meters");
      }
      else {
         break;
      }
   }
   public void swim(swim_dist) {
      if (swim_dist < 10) {
         System.out.println(name + " has swum " + swim_dist + "meters");
      }
      else {
         break;
      }
   }
}