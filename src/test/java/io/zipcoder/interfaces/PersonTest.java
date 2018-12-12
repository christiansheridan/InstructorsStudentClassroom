package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

    Person person = new Person(1);

    @Test
    public void testConstructor(){
        //given
        long actual = person.getId();
        long expected = 1;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetName(){
        person.setName("Christian");

        String expected = "Christian";
        String actual = person.getName();

        Assert.assertEquals(expected, actual);
    }

}
