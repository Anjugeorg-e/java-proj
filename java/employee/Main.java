package employee;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee(2, "sam", "fernandez", 999);

        System.out.println(e1.getID());
        System.out.println(e1.getFirstName());
        System.out.println(e1.getLastName());
        System.out.println(e1.getSalary());

        System.out.println(e1.getAnnualSalary());
        System.out.println(e1.raiseSalary(10));
    }
    
}
