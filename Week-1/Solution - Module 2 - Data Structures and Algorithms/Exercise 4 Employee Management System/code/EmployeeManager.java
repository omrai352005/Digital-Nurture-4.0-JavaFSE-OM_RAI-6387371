public class EmployeeManager {
    private Employee[] employees;
    private int count;  // number of employees added

    public EmployeeManager(int size) {
        employees = new Employee[size];
        count = 0;
    }

    // Add Employee
    public void addEmployee(Employee emp) {
        if (count < employees.length) {
            employees[count++] = emp;
        } else {
            System.out.println("Employee list is full.");
        }
    }

    // Search Employee by ID
    public Employee searchEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {
                return employees[i];
            }
        }
        return null;
    }

    // Traverse Employees
    public void traverseEmployees() {
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }
    }

    // Delete Employee by ID
    public void deleteEmployee(int id) {
        int index = -1;
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            // Shift elements left
            for (int i = index; i < count - 1; i++) {
                employees[i] = employees[i + 1];
            }
            employees[--count] = null;
            System.out.println("Employee deleted.");
        } else {
            System.out.println("Employee not found.");
        }
    }
}

