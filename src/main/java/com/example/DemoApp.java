package com.example;

public class DemoApp {

    public static int divide(int a, int b) {
        // BUG: possible divide by zero
        return a / b;
    }

    public static void login() {
        // SECURITY ISSUE: hardcoded password
        String password = "admin123";
        if(password.equals("admin123")) {
            System.out.println("Login successful");
        }
    }

    public static void duplicateCode() {
        System.out.println("Processing...");
        System.out.println("Processing...");
        System.out.println("Processing...");
    }

    public static void main(String[] args) {
        int result = divide(100, 10);
        System.out.println("Result: " + result);

        login();
        duplicateCode();
    }
}
