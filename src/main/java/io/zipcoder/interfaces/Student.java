package io.zipcoder.interfaces;

import io.zipcoder.interfaces.Interfaces.Learner;

public class Student extends Person implements Learner {

    Student(){

    }

    Student(long id, String name){
        super(id = id);
        this.name = name;
    }

    double totalStudyTime;

    public void learn(double numberOfHours) {
        totalStudyTime = numberOfHours;
    }

    public double getTotalStudyTime(){
        return totalStudyTime;
    }

}
