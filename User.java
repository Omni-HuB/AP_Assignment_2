package ____AP_Assignments______.Assignment__2;

import java.util.Date;

public interface User extends Comments, Login {

    // interface methods are by default public and abstract

    void viewAssessments();

    void viewLectureMaterial();

    Date uploadTime();

}
