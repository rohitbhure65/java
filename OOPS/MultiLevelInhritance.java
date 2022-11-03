// 3. Multilevel inheritance : Multilevel inheritance is a process of deriving a
// class from another derived class.

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
class EquilateralTriangle extends Triangle {
    public void area(int h, int b) {
        System.out.println((1 / 2) * b * h);
    }
}

public class MultiLevelInhritance {
    public static void main(String[] args) {

    }
}