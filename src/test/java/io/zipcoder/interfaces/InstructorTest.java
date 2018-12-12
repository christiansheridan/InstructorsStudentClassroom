package io.zipcoder.interfaces;

import io.zipcoder.interfaces.Interfaces.Learner;
import io.zipcoder.interfaces.Interfaces.Teacher;
import org.junit.Assert;
import org.junit.Test;

public class InstructorTest {

    Instructor instructor = new Instructor(2, "Wil");
    Learner student = new Student();
    Learner student2 = new Student();
    Learner [] students = new Learner[]{student, student2};


    @Test
    public void testImplementation(){
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance(){
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach(){
        instructor.teach(student, 5);
        double expected = 5;
        double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void testLecture(){
        instructor.lecture(students, 4);
        double expected = 2;
        double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected, actual, 0.1);
    }
}
