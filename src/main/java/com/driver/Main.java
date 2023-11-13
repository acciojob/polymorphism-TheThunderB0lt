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
    // 1. create a class Product inside Main class
    static class Product {
        // 2. create a method
        public int product(int x, int y) {
            return x * y;
        }

        // 4. create a Overloaded method product
        public int product(int x, int y, int z) {
            return x * y * z;
        }

        // 5. create a Overloaded method product
        public double product(double x, double y) {
            return x * y;
        }
    }

    public static void main(String[] args) {
        // 2. create object of Product in Main function called p
        Product p = new Product();

        int res1 = p.product(2, 3);
        System.out.println("Result of method 1 product(x, y): " + res1);
        
        int res2 = p.product(2, 3, 4);
        System.out.println("Result of method 2 product(x, y, z): " + res2);
        
        double res3 = p.product(2.3, 3.4);
        System.out.println("Result of method 3 product(x, y): " + res3);

    }
}
/*
 OUTPUT: 
Result of method 1 product(x, y): 6
Result of method 2 product(x, y, z): 24
Result of method 3 product(x, y): 7.819999999999999
 */