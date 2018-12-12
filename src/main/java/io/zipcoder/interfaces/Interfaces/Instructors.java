package io.zipcoder.interfaces.Interfaces;

import io.zipcoder.interfaces.Instructor;
import io.zipcoder.interfaces.People;

public final class Instructors extends People {

    private static final Instructors instance = new Instructors();

    private Instructors(){
        super.add(new Instructor(1, "Kris Younger"));
        super.add(new Instructor(2, "Nhu Nguyen"));
        super.add(new Instructor(3, "Wilhem Alcivar"));
        super.add(new Instructor(4, "Mikaila Akeredolu"));
        super.add(new Instructor(5, "Dolio Durant"));
        super.add(new Instructor(6, "Froilan Miranda"));
        super.add(new Instructor(7, "Leon Hunter"));
    }

    public static Instructors getInstance(){
        return instance;
    }


}
