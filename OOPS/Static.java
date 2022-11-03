// Static Keyword

// Static can be :
// 1. Variable (also known as a class variable)
// 2. Method (also known as a class method)
// 3. Block
// 4. Nested class

class Student {
    String name;
    static String school;
    static String schooladdr;

    public static void schooladdr() {
        schooladdr = "barawaha road";
    }
}

public class Static {
    public static void main(String[] args) {
        Student.school = "KVB";
        Student.schooladdr();
        Student s1 = new Student();
        s1.name = "rohit";

        System.out.println(s1.name + " student of " + Student.school + " address is " + Student.schooladdr);
    }
}