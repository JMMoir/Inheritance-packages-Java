package staff.management;

public class Director extends Manager {

    private double budget;

    public Director(String name, String NINumber, double salary, String deptName, double budget) {
        super(name, NINumber, salary, deptName);
        this.budget = budget;
    }



}
