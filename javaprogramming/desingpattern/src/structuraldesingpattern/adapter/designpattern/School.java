package structuraldesingpattern.adapter.designpattern;

public class School {

    public static void main(String[] args) {
        Pen p = new PenAdapter();
        AssignmentWork assignmentWork = new AssignmentWork();
        assignmentWork.setP(p);
        assignmentWork.writeAssignment("Assig1");

    }
}
