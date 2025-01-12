package org.example;

public class Main {
    public static void main(String[] args) {
        //test toString()
        Vector3D test1 = new Vector3D(2.111, 3.333, 4.3258);
        System.out.println("Expected: (2.11, 3.33, 4.33)\nActual: " + test1);

        //test get methods
        System.out.println("Expected: 2.111 3.333 4.3258\nActual: " + test1.getX() + " " + test1.getY() + " " + test1.getZ());

        //test getMagnitude()
        System.out.println("Expected: 5.85...\nActual: " + test1.getMagnitude());

        //test add()
        Vector3D test2 = new Vector3D(1, 1, 1);
        System.out.println("Expected: (3.11, 4.33, 5.33)\nActual: " + test1.add(test2));

        //test multiply()
        double constant = 2.0;
        System.out.println("Expected: (4.22, 6.67, 8.65)\nActual: " + test1.multiply(constant));
    }
}