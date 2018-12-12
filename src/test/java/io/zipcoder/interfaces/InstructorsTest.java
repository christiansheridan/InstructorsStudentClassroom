package io.zipcoder.interfaces;

import io.zipcoder.interfaces.Interfaces.Instructors;
import org.junit.Assert;
import org.junit.Test;

public class InstructorsTest {

    @Test
    public void studentsAllThereTest(){
        People allInstructors = Instructors.getInstance();
        int actual = allInstructors.getCount();
        int expected = 7;

        Assert.assertEquals(expected, actual);
    }

}
