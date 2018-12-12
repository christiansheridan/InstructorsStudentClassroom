package io.zipcoder.interfaces;

public class Person {



    final long id;
    String name;

    Person(long id, String name){
        this.id = id;
        this.name = name;
    }

    Person(long id){
        this.id = id;
    }

    Person(){
        this.id = getId();
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
