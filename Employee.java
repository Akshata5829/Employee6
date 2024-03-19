class Employee {
    String name;
    int id;
    double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}


class DevOpsEngineer extends Employee {
    double bonus;

    public DevOpsEngineer(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }


    @Override
    public double getSalary() {
        return super.getSalary() + bonus;
    }
}





