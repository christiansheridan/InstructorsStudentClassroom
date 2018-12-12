package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.awt.*;
import java.util.ArrayList;

public class PeopleTest {

    People peopleTest = new People();
    Person person = new Person(1);
    Person person1 = new Person(2);


    ArrayList<Person> personArrayList = new ArrayList<Person>();

    @Test
    public void testAdd(){
        peopleTest.add(person1);
        //then
        Assert.assertTrue(peopleTest.getCount() == 1);
    }

    @Test
    public void testRemove(){
        peopleTest.add(person);
        peopleTest.remove(person);

        Assert.assertTrue(peopleTest.getCount() == 0);
    }

    @Test
    public void testFindById(){
        peopleTest.add(person);
        peopleTest.add(person1);


        //Person person2 = peopleTest.findById(2);

        Assert.assertEquals(person1, peopleTest.findById(2));
    }

    @Test
    public void testGetCount(){
        peopleTest.add(person);

        Assert.assertTrue(peopleTest.getCount() == 1);
    }

    @Test
    public void removeByIdTest(){
        peopleTest.add(person);
        peopleTest.add(person1);

        peopleTest.removeById(1);

        Assert.assertTrue(peopleTest.getCount() == 1);
    }

    @Test
    public void removeAllTest(){
        peopleTest.add(person);
        peopleTest.add(person1);

        peopleTest.removeAll();

        Assert.assertTrue(peopleTest.getCount() == 0);
    }

    @Test
    public void getArray(){
        peopleTest.add(person);
        peopleTest.add(person1);

        Person [] people = peopleTest.getArray();

        Assert.assertTrue(people.length == 2);
    }

}
