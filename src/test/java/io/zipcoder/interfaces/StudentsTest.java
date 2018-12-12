package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class StudentsTest {

    @Test
    public void studentsAllThereTest(){
        People allStudents = Students.getInstance();
        int actual = allStudents.getCount();
        int expected = 39;

        Assert.assertEquals(expected, actual);
    }


}
