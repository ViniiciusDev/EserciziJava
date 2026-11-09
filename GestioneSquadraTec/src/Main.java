import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

        private static final Scanner in = new Scanner(System.in);
        private static final List<Employee> employees = new ArrayList<>();

        public static void main(String[] args)  {
            int option;

            do {
                showMenu();
                option = in.nextInt();
                if (option == 1){
                    addEmployee();
                }
                if (option == 2){
                    showEmployees();
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
            System.out.println("Aggiungere nome employee: ");
            String name = in.next();
            System.out.println("Aggiungere stipendio base: ");
            double salary = in.nextDouble();
            System.out.println("Aggiungere Ruolo: ");
            Role role = Role.valueOf(in.next());
            employees.add(new Employee(name, salary, role));
        }

        private static void showEmployees() {
            for (Employee employee : employees) {
                System.out.println("Nome: " + employee.getName());
                System.out.println("Ruolo: " + employee.getRole().getDescription());
            }
        }

    }