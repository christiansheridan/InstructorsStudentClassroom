package io.zipcoder.interfaces;

import io.zipcoder.interfaces.Interfaces.Learner;
import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

    Student student = new Student();

    @Test
    public void testImplementation(){
        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance(){
        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void testLearn() {
        //given
        student.learn(5);

        //when
        double expected = 5;
        double actual = student.totalStudyTime;

        Assert.assertEquals(expected, actual, 1);
    }

    @Test
    public void getTotalStudyTime() {
        //given
        student.learn(5);

        //when
        double expected = 5;
        double actual = student.getTotalStudyTime();

        //then
        Assert.assertEquals(expected, actual, 1);
    }
}