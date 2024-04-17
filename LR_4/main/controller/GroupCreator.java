package LR_4.controller;
import LR_4.model.Group;
public class GroupCreator {

    public Group createGroup(String name) {
        return new Group(name);
    }
}
