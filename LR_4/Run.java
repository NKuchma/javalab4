package LR_4;
import LR_3.controller.*;
import LR_3.model.University;

public class Run {

    public static void main(String[] args) {
        UniversityCreator universityCreator = new UniversityCreator();
        University oldUniversity = universityCreator.createTypicalUniversity();
        System.out.println("University created!");
    }
}
