package ru.geekbrains;

public abstract class Animal {
       public abstract void speak();
       public abstract void run();
       public abstract void swim();
       String name;
       int run_dist;
       int swim_dist;
       public Animal(int run_dist) {
            this.run_dist = run_dist;
       }
       public Animal(int swim_dist) {
            this.swim_dist = swim_dist;
       }
       public Animal() {
          name = "none";
       }
       public Animal(String name) {
          this.name = name;
       }
}