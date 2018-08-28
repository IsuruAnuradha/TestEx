package com.singtel.singtelexcersice.model.bird;

public class Duck extends Bird {

    @Override
    public void sing() {
        System.out.println("says Quack Quack");
    }

    public void swim(){
        System.out.println("can swim");
    }
}
