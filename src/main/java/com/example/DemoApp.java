package com.example;

import java.util.logging.Logger;

public class DemoApp {
    private static final Logger LOGGER = Logger.getLogger(DemoApp.class.getName());
    private static final String MESSAGE = "Processing...";
    private static final int TOTAL = 100;
    private static final int COUNT = 10;

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
        LOGGER.info(MESSAGE);
        LOGGER.info(MESSAGE);
    }

    public static void main(String[] args) {
        int result = divide(TOTAL, COUNT);
        System.out.println("Result: " + result);

        login();
        duplicateCode();
    }
}
