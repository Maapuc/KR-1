public class Main {
    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {

        employees[0] = new Employee(0, "Борисов", "Олег", "Иванович", 310234, 1);
        employees[1] = new Employee(0, "Иванов", "Виктов", "Иванович", 30401, 2);
        employees[2] = new Employee(0, "Фруктов", "Банан", "Апельсинович", 30150, 3);
        employees[3] = new Employee(0, "Овощев", "Помидор", "Огурцович", 30970, 4);
        employees[4] = new Employee(0, "Птичьев", "Дрозд", "Орлович", 30970, 5);
        employees[5] = new Employee(0, "Собаков", "Бульдок", "Догович", 30270, 1);
        employees[6] = new Employee(0, "Стулов", "Табуретка", "Креслович", 32970, 2);
        employees[7] = new Employee(0, "Машинов", "Мерседес", "Запорожевич", 20970, 3);
        employees[8] = new Employee(0, "Иванов", "Иван", "Иванович", 36970, 4);
        employees[9] = new Employee(0, "Видюхина", "Материнка", "Аперотивовна", 37970, 5);

        printEmployees();
        sealEmployee();
        System.out.println(sumSalary());
        System.out.println(minSalaryEployee());
        System.out.println(maxSalaryEployee());
        System.out.println(averageSalary());
    }

    public static void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static int sumSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static Employee minSalaryEployee() {
        Employee min = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < min.getSalary()) {
                min = employee;
            }
        }
        return min;
    }

    public static Employee maxSalaryEployee() {
            Employee max = employees[0];
            for (Employee employee : employees) {
                if (employee.getSalary() > max.getSalary()) {
                    max = employee;

                }
            }
        return max;
    }

    public static double averageSalary() {
        return (double) sumSalary() / employees.length;
    }

    public static void sealEmployee() {
        for (Employee employee : employees) {
            System.out.println(employee.getFirstName() + " " + employee.getLastName() + " " + employee.getSurName() );

        }
    }
}
