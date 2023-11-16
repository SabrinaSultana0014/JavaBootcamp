package com.seconday;

public class InstanceVariableDemo {
    //instance variables

    public String lastName;
    private int age;
    protected String firstName;
    double salary;

    //access modifiers
    public void showDefaultValue() {

        System.out.println("LastName Value : " + lastName);
        System.out.println("FirstName Value : " + firstName);
        System.out.println("Age : " + age);
        System.out.println("Salary : " + salary);
    }

    public void changeDefaultValue() {
        lastName = "Sultana";
        age = 10;
        firstName = "Ram";
        salary = 456.56;
    }
    public static void main(String[] args) {
        //instance or object
        InstanceVariableDemo instancedemo = new InstanceVariableDemo();

        instancedemo.showDefaultValue();
        instancedemo.changeDefaultValue();
        instancedemo.showDefaultValue();
    }

}
