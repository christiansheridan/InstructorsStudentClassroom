package io.zipcoder.interfaces;

import io.zipcoder.interfaces.Interfaces.Learner;
import io.zipcoder.interfaces.Interfaces.Teacher;

public class Instructor extends Person implements Teacher {

    public Instructor(long id, String name){
        super(id, name);
    }

    private Student learner;

    public double getTotalStudyTime() {
            return 0;
        }

    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        for (int i =0; i<learners.length; i++) {
            double numberOfHoursPerLearner = numberOfHours/learners.length;
            learners[i].learn(numberOfHoursPerLearner);
        }
    }

}
