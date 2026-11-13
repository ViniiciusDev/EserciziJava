import java.util.*;

public class Main {

        private static final Scanner in = new Scanner(System.in);
        private static final List<Employee> employees = new ArrayList<>();


        public static void main(String[] args)  {
            int option;

            do {
                showMenu();
                option = in.nextInt();
                switch (option) {
                    case 1 -> addEmployee();
                    case 2 -> showEmployees();
                    case 3 -> showFinalSalary();
                    case 4 -> showEmployeeWithBiggestSalary();
                    case 5 -> showEmployeesQuantity();
                    case 6 -> findEmployeeByName();
                    case 7 -> System.out.println("Chiudendo...");
                    default -> System.out.println("Opzione non valida.");
                }
            } while (option != 7);
        }
        private static void showMenu()  {
            System.out.println(
                    """
                        1 - Cadastrar funcionário
                        2 - Listar funcionários
                        3 - Exibir salários finais
                        4 - Funcionário com maior salário
                        5 - Quantidade de funcionários por cargo
                        6 - Buscar funcionário por nome
                        7 - Sair
                    """
            );
        }

        private static void addEmployee()   {
            System.out.println("Aggiungere nome dipendente: ");
            String name = in.next();
            System.out.println("Aggiungere stipendio base: ");
            double salary = in.nextDouble();
            System.out.println("Aggiungere Ruolo: ");
            Role role = Role.valueOf(in.next().toUpperCase());
            employees.add(new Employee(name, salary, role));
        }

        private static void showEmployees() {
            if(employees.isEmpty()) {
                System.out.println("Non ho trovato alcun dipendente registrato!");
                return;
            }

            for (Employee employee : employees) {
                System.out.println("Nome: " + employee.getName());
                System.out.println("Ruolo: " + employee.getRole().getDescription());
            }
        }

        private static void showFinalSalary()   {
            for (Employee employee : employees) {
                String name = employee.getName();
                System.out.println(name + " -> " + employee.getFinalSalary());
            }
        }

        private static void showEmployeeWithBiggestSalary() {
            Employee employeeWithBiggestSalary = null;
            for (Employee employee : employees) {
                if(employeeWithBiggestSalary == null)   {
                    employeeWithBiggestSalary = employee;
                } else {
                    if(employee.getFinalSalary() > employeeWithBiggestSalary.getFinalSalary())    {
                        employeeWithBiggestSalary = employee;
                    }
                }
            }
            if(employeeWithBiggestSalary != null)   {
                System.out.println("Dipendente con il maggior Stipendio: " + employeeWithBiggestSalary.getName() + " £ " + employeeWithBiggestSalary.getFinalSalary());
            } else {
                System.out.println("Nessun dipendente nel registro!");
            }
        }

        private static void showEmployeesQuantity() {
            Map<Role, Integer> mapEmployeesQuantity = new HashMap<>();
            for(Employee employee : employees)  {
                int actualQuantity = mapEmployeesQuantity.getOrDefault(employee.getRole(), 0);
                mapEmployeesQuantity.put(employee.getRole(), actualQuantity + 1);
            }

            for(Map.Entry<Role, Integer> roleIntegerEntry : mapEmployeesQuantity.entrySet())    {
                System.out.println(roleIntegerEntry.getKey().getDescription() + ": " + roleIntegerEntry.getValue());
            }
        }

        private static void findEmployeeByName()    {
            System.out.println("Qual'è il nome del dipendente: ");
            String name = in.next();

            for(Employee employee : employees)  {
                if(employee.getName().equalsIgnoreCase(name)) {
                    System.out.println("Dipendente Trovato!");
                    System.out.println("Nome: " + employee.getName());
                    System.out.println("Ruolo: " + employee.getRole().getDescription());
                    System.out.println("Stipendio: " + employee.getFinalSalary());
                }
            }
        }

    }