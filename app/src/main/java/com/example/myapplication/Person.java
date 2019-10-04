package com.example.myapplication;

public class Person {



    String name;
    String family;
    Person(String name,String family){
        setName(name);
        setFamily(family);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }
}
