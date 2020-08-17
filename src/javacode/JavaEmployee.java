package javacode;

import accessmodifiers.Employee;

public class JavaEmployee {

    private final String firstName;

    public JavaEmployee(String firstName) {
        this.firstName = firstName;
    }

    public static void main(String[] args) {
        JavaEmployee javaEmployee = new JavaEmployee("John");
        System.out.println(javaEmployee.firstName);

    }
}
