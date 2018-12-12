package io.zipcoder.interfaces;

import io.zipcoder.interfaces.Interfaces.Instructors;
import io.zipcoder.interfaces.Interfaces.Learner;
import org.junit.Assert;
import org.junit.Test;

public class TestZipCodeWilmington {

    @Test
    public void testHostLecture(){
        double numberOfHours=  Students.getInstance().getCount();
        double expected = 1;
        ZipCodeWilmington zcw = new ZipCodeWilmington();
        Instructor instructor = (Instructor) Instructors.getInstance().findById(5);

        zcw.hostLecture(instructor, numberOfHours);


        for(Person p : Students.getInstance().getArray()){
            Student student = (Student) p;
            double actual = student.getTotalStudyTime();
            Assert.assertEquals(expected, actual, .1);
        }
    }

    @Test
    public void testHostLectureById(){
        double numberOfHours=  Students.getInstance().getCount();
        double expected = 1;
        ZipCodeWilmington zcw = new ZipCodeWilmington();

        zcw.hostLecture(1, numberOfHours);


        for(Person p : Students.getInstance().getArray()){
            Student student = (Student) p;
            double actual = student.getTotalStudyTime();
            Assert.assertEquals(expected, actual, .1);
        }
    }
}
