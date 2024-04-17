package LR_4.controller;

import LR_3.model.Department;
import LR_3.model.Faculty;
import LR_3.model.Human;
public class FacultyCreator {
    public FacultyCreator() {
    }

    public Faculty createFaculty(String name, Human headmaster) {
        return new Faculty(name, headmaster);
    }
}
