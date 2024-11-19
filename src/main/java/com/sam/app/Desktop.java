package com.sam.app;


import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {
    public void compile() {

        System.out.println("Compiling with 404 bugs but faster");
        //Desktop desk = new Desktop(); 
    }
}
