// 3. Copy Constructor : ACopy constructor is an overloaded
// constructor used to declare and initialize an object from another

// object. There is only a user defined copy constructor in Java(C++ has a
// default one too).

class Student {

    // data - memeber
    String name;
    int age;

    // method
    public void printinfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // Copy Constructor
    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }

    Student() {
        // empty function
        // non-parameterized constructor for student
    }
}

public class CopyConstructor {
    public static void main(String[] args) {
        // crate object s1 of class Student
        Student s1 = new Student();
        s1.name = "Rohit";
        s1.age = 21;

        // crate object s2 of class Student
        Student s2 = new Student(s1);
        // call method
        s2.printinfo();
    }
}
