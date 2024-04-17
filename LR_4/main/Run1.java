package LR_3;
import LR_3.controller.*;
import LR_3.model.University;

public class run {
    public static void main(String[] args) {
        UniversityCreator universityCreator = new UniversityCreator();
        University university = universityCreator.createTypicalUniversity();
        System.out.println("University created!");
    }
}