public class Employees {
    private String name;
    private double salary;
    private Role role;

    public Employees(String name, double salary, Role role)    {
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
}
