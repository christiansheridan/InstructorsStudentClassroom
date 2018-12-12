package io.zipcoder.interfaces;

import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class People<E extends Person>{

    ArrayList<E> personList = new ArrayList<E>();

    public void add(E person){
        personList.add(person);
    }

    public E findById(long id){
        for(E p : personList){
            if (id == p.getId()){
               return p;
            }
        }
        return null;
    }

    public void remove(Person person){
        personList.remove(person);
    }

    public void removeById(long id){
        personList.remove(findById(id));
    }

    public int getCount(){
        return personList.size();
    }

    abstract E[] getArray();

    public void removeAll(){
        personList.removeAll(personList);
    }

}
