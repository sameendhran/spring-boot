package com.sam.spring1;

public class Alien {
    private int age; // This is where the alien's age is stored
    private int salary; // This is where the alien's salary is stored
    Laptop lap; // This is a reference to a Laptop object

    // Constructor: A special method used to create an Alien object with age and salary
    public Alien(int age, int salary) {
        this.age = age; // Set the alien's age
        this.salary = salary; // Set the alien's salary
    }
    
    public Alien(Laptop lap) {
    	this.lap = lap;
    	System.out.println("constructor from laptop");
    }

    // Get the alien's age
    public int getAge() {
        return age;
    }

    // Get the alien's salary
    public int getsalary() {
        return salary;
    }

    // Set the alien's age
    public void setAge(int age) {
        this.age = age;
    }

    // Get the Laptop object that the alien uses
    public Laptop getLap() {
        return lap;
    }

    // Set the Laptop object for the alien
    public void setLap(Laptop lap) {
        this.lap = lap;
    }

    // This method uses the Laptop to do something (like compile code)
    public void build() {
        lap.compile(); // Calls the compile method from the Laptop class
    }
}
