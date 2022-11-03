// 1. Single inheritance : When one class inherits another class, it is known
// as single level inheritance

// BASE CLASS
class Shape {
    public void area() {
        System.out.println("Displays Area of Shape");
    }
}

// DERIVED CLASS
class Triangle extends Shape {
    public void area(int h, int b) {
        System.out.println((1 / 2) * b * h);
    }
}

public class SingleLevelInheritance {
    public static void main(String[] args) {


    }
}