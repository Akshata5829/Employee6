class Main {
    public static void main(String[] args) {
     
        Employee emp = new Employee("John Doe", 1001, 50000.0);
        System.out.println("Employee Salary: " + emp.getSalary());


        DevOpsEngineer devOps = new DevOpsEngineer("Alice Smith", 1002, 60000.0, 5000.0);
        System.out.println("DevOps Engineer Salary: " + devOps.getSalary());
    }
}

