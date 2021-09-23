package packageA;

import packageB.ClassB;

public class ClassA {
    public static void main(String[] args) {
       System.out.println("Hi from " + ClassB.getMessage());
    }
}