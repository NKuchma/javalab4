package LR_4.controller;
import LR_3.model.Group;
import LR_3.model.Sex;
import LR_3.model.Student;

public class StudentCreator {
    public Student createStudent(String firstName, String lastName, String parentage, Sex gender) {
        return new Student(firstName, lastName, parentage, gender);
    }
}
