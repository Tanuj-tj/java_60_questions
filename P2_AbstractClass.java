abstract class Animal {
    
    // Abstract Method
    abstract void makeSound(); 
  
    // Non Abstract Method
    public void eat() {
      System.out.println("I can eat.");
    }
  }
  
  class Dog extends Animal {
  
    public void makeSound() {
      System.out.println("Bark bark");
    }
  }
  
  class P2_AbstractClass {
    public static void main(String[] args) {
  
      // create an object of Dog class
      Dog d1 = new Dog();
  
      d1.makeSound();
      d1.eat();
    }
  }