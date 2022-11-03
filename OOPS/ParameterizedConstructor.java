// 2. Parameterized constructor : Constructor which has parameters is called a
// parameterized constructor. It is used to provide
// different values to distinct objects.

class Student {
    // data member
    String name;
    int age;

    // method / member function
    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // Constructor
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
}

public class ParameterizedConstructor {
    public static void main(String[] args) {
    // create object s1 of class student
    Student s1 = new Student("rohit", 43);
    // call method
    s1.printinfo();
    }
}