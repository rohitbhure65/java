// Abstraction

// We try to obtain an abstract view, model or structure of a real life problem, and
// reduce its unnecessary details. With definition of properties of problems,
// including the data which are affected and the operations which are identified,
// the model abstracted from problems can be a standard solution to this type of
// problems. It is an efficient way since there are nebulous real-life problems that
// have similar properties.

// In simple terms, it is hiding the unnecessary details & showing only the
// essential parts/functionalities to the user.

// Data binding : Data binding is a process of binding the application UI and business
// logic. Any change made in the business logic will reflect directly to the application
// UI.

// Abstraction is achieved in 2 ways :
// - Abstract class
// - Interfaces (Pure Abstraction)

// 1. Abstract Class

//  An abstract class must be declared with an abstract keyword.
//  It can have abstract and non-abstract methods.

//  It cannot be instantiated.

//  It can have constructors and static methods also.

//  It can have final methods which will force the subclass not to change the body of
//  the method.

abstract class Animal {
    abstract void walk(); // abstract method

    Animal() { // constructor
        System.out.println("You Are Creating A New Animal");
    }

    public void eats() { // non-abstract method
        System.out.println("Animals Eats");

    }
}

class Hourse extends Animal {
    // Hourse(){
    // System.out.println("Created A hourse");
    // }
    public void walk() {
        System.out.println("Walks on 4 leg");
    }
}

class Chicken extends Animal {
    // Chicken(){
    // System.out.println("Created a Chicken");
    // }
    public void walk() {
        System.out.println("walks on 2 leg");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Hourse hourse1 = new Hourse();
        hourse1.walk();
        hourse1.eats(); // call non abstract method of class Animal

        // Chicken chicken1 = new Chicken();

    }
}