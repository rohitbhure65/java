// 2. Hierarchical inheritance : Hierarchical inheritance is defined as the
// process of deriving more than one class from a base class.

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

// DERIVED CLASS
class EquilateralTriangle extends shape {
    public void area(int h, int b) {
        System.out.println((1 / 2) * b * h);
    }
}

public class HierarchialInheritance {
    public static void main(String[] args) {

    }
}