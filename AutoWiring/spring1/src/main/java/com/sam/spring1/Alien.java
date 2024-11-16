package com.sam.spring1;

public class Alien {
    Computer comp; // This is a reference to a Computer object
public Alien() {
	//System.out.println("Alien constructor");
}

    public Computer getComp() {
    	return comp;
    }
    public void setComp(Computer comp) {
    	this.comp = comp;
    }
    // This method uses the Laptop to do something (like compile code)
    public void build() {
        comp.compile(); // Calls the compile method from the Laptop class
    }
}
