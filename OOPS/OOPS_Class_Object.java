// Class is a user-defined data type which defines its properties and its
// functions. Class is the only logical representation of the data. For
// example, Human being is a class. The body parts of a human being are its
// properties, and the actions performed by the body parts are known as
// functions. The class does not occupy any memory space till the time an
// object is instantiated.

// Object is a run-time entity. It is an instance of the class. An object can
// represent a person, place or any other item. An object can operate on
// both data members and member functions.

// Note : When an object is created using a new keyword, then space is
// allocated for the variable in a heap, and the starting address is stored in
// the stack memory.

// ‘this’ keyword : ‘this’ keyword in Java that refers to the current
// instance of the class. In OOPS it is used to:
// 1. pass the current object as a parameter to another
// method
// 2. refer to the current class instance variable
// __________________________________________________

// create class pen
class pen {

    // create data-member
    String color;
    String type;

    // create member function
    public void penwrite() {
        System.out.println("Write Something");
    }

    // create 2^nd member function
    public void pencolor() {
        System.out.println(this.color); // The this keyword can be used to refer current class instance variable. If
                                        // there is ambiguity between the instance variables and parameters, this
                                        // keyword resolves the problem of ambiguity.
    }
}

public class OOPS_Class_Object {
    public static void main(String[] args) {
        // create an object pen 1
        pen pen1 = new pen();
        pen1.color = "red";
        pen1.type = "gel";

        // create an object pen 2
        pen pen2 = new pen();
        pen2.color = "black";
        pen2.type = "bolpoint";

        // calling pencolor member function
        pen1.pencolor();
        pen2.pencolor();

        // calling penwrite member function
        pen1.penwrite();

    }
}