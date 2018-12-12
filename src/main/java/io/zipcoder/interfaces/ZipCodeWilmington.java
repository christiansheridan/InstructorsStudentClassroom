package io.zipcoder.interfaces;

import io.zipcoder.interfaces.Interfaces.Instructors;
import io.zipcoder.interfaces.Interfaces.Teacher;
import io.zipcoder.interfaces.Interfaces.Learner;

public class ZipCodeWilmington {

    Students students = Students.getInstance();
    Instructors instructors = Instructors.getInstance();

    public void hostLecture (Teacher teacher, double numberOfHours){
        Person[] person = students.getArray();
        Learner[] learners = new Learner[person.length];
        for (int i = 0; i<person.length; i++){
            Person currentPerson = person[i];
            Learner learner = (Learner)currentPerson;
            learners[i] = learner;
        }
        teacher.lecture(learners, numberOfHours);

    }

    public void hostLecture (long id, double numberOfHours){
        Teacher teacher = (Teacher) instructors.findById(id);
        hostLecture(teacher, numberOfHours);
    }

}
