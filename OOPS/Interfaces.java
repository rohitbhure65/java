// 2. Interfaces

//  All the fields in interfaces are public, static and final by default.

//  All methods are public & abstract by default.

//  A class that implements an interface must implement all the methods declared
// in the interface.

//  Interfaces support the functionality of multiple inheritance.import javax.sound.sampled.SourceDataLine;

interface Animals{
    int eye = 2; // public static and final by default
    public void walk();
}

interface Hebivore {

}

class Hourse implements Animals, Hebivore{ 
    
    public void walk(){
        System.out.println("Walks on 4 legs");
        System.out.println("Hourse are " + eye + " Eyes :)");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Hourse hourse1 = new Hourse();
        hourse1.walk();
    }
}
