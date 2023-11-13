/* Task 1: create a class Product inside Main class

Task 2: create object of Product in Main function called p

Task 3: create a method of following defination 
public int product(int x, int y) {} call this method from Main using Product class object p

Task 4: create a Overloaded method product of following defination 
public int product(int x, int y, int z) {} call this method also from Main using Product class object p

Task 5: create a Overloaded method product of following defination 
public double product(double x, double y) {} call this method also from Main using Product class object p

Observations: This class contains 3 classes with same name, but it complie & run successfully. */

package com.driver;

public class Main {

    public static void main(String[] args) {
        // Task 2: Create object of Product in Main function called p
        Product p = new Product();

        // Task 3: Call method public int product(int x, int y) from Main using Product class object p
        int result1 = p.product(5, 3);
        System.out.println("Product of two integers: " + result1);

        // Task 4: Call Overloaded method public int product(int x, int y, int z) from Main using Product class object p
        int result2 = p.product(2, 3, 4);
        System.out.println("Product of three integers: " + result2);

        // Task 5: Call Overloaded method public double product(double x, double y) from Main using Product class object p
        double result3 = p.product(2.5, 3.5);
        System.out.println("Product of two doubles: " + result3);
    }

    // Task 1: Create a class Product inside Main class
    public static class Product {
        // Task 3: Create method public int product(int x, int y)
        public int product(int x, int y) {
            return x * y;
        }

        // Task 4: Create Overloaded method public int product(int x, int y, int z)
        public int product(int x, int y, int z) {
            return x * y * z;
        }

        // Task 5: Create Overloaded method public double product(double x, double y)
        public double product(double x, double y) {
            return x * y;
        }
    }
}


/*
 OUTPUT: 
 Result of method 1 product(x, y): 6
Result of method 2 product(x, y, z): 24
Result of method 3 product(x, y): 7.819999999999999
 */