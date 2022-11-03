// Constructor : Constructor is a special method which is invoked
// automatically at the time of object creation. It is used to initialize the data
// members of new objects generally.
// ● Constructors have the same name as class or structure.
// ● Constructors don’t have a return type.(Not even void)
// ● Constructors are only called once, at object creation.

// There can be three types of constructors in Java.

// 1. Non-Parameterized constructor : Aconstructor which has no
// argument is known as non-parameterized constructor(or no-argument
// constructor). It is invoked at the time of creating an object. If we don’t
// create one then it is created by default by Java.

// create class pen
class pen {
    // data member
    String color;
    String type;

    // non-parameterized constructor
    pen(){
        System.out.println("Constructor called");
    }
}

class NonParameterizedConstructor {
    public static void main(String[] args) {
    // create pen1 object
    pen pen1 = new pen();
    pen1.color = "red";
    pen1.type = "gel";

    }
}