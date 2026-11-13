public enum Option {
    REGISTER_EMPLOYEE(1),
    LIST_EMPLOYEES(2),
    SHOW_FINAL_SALARY(3),
    SHOW_EMPLOYEE_WITH_BIGGEST_SALARY(4),
    EMPLOYEES_QUANTITY_BY_ROLE(5),
    SEARCH_EMPLOYEE_BY_NAME(6);

    private final int id;

    Option(int id)  {
        this.id = id;
    }

    public int getId()  {return id;}
}
