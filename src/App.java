
// import java.util.Scanner;

class App {

  public static void main(String[] args) throws Exception {

    Cat cat = new Cat() {
      @Override
      public void run() {
        System.out.println("Cat is running");
      }
    };

    Mamol dog = new Dog();
    Mamol dog2 = new Dog();

    int cast = (int)4.5;

    cat.run();
    dog.sound();
    dog.Alive();

    enum Color {
      RED,
      GREEN,
      BLUE;
    }

    Color c = Color.RED;

    System.out.println(dog.equals(dog2));
  }
}

class Mamol extends Creature {

  private int privat = 4;
  protected int protect = 4;

  private int feet = 4;

  String name;

  public Mamol() { System.out.println("New Mamol"); }

  //
  void getFeet() { System.out.println("feet: " + this.feet); }

  void sound() { System.out.println("..."); }
}

class Cat implements Moves, Dance {

  Cat() { System.out.println("New Cat"); }

  void sound() { System.out.println("Meow-Meow"); }

  public void run() { System.out.println("Cat is running"); }
  public void dance() { System.out.println("Cat is running"); }
}
class Dog extends Mamol {

  Dog() { System.out.println("New Dog"); }

  void sound() { System.out.println("Woof-Woof"); }
}

abstract class Creature {

  void Alive() { System.out.println("I'm alive"); }
}