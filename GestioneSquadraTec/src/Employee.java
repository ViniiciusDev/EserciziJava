public class Employee {
    private String name;
    private double salary;
    private Role role;

    public Employee(String name, double salary, Role role)    {
        this.name = name;
        this.salary = salary;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public double getSalary()   {
        return salary;
    }

    public Role getRole()   {
        return role;
    }

    public double getFinalSalary() {
        return salary + role.calcBonus(salary);
    }
}
