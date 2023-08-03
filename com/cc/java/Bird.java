package com.cc.java;

public class Bird implements Flyable, IFeathers{

    @Override
    public String fly() {
              return "I`m a bird, I can shurely fly!";
    }

    @Override
    public String hasFeathers() {
             return "I am a bird, I have beautyfull colored feathers";
    }

    
    
    
}
