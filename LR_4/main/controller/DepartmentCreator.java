package LR_4.controller;

import LR_3.model.Department;
import LR_3.model.Human;

public class DepartmentCreator {
    public DepartmentCreator() {
    }

    public Department createDepartment(String name, Human head) {
        return new Department(name, head);
    }
}
