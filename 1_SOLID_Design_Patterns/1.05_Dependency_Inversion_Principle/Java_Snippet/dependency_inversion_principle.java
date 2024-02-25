// Create an employee directory where a manager has the following reportees
// 1. Developer
// 2. Desginer
// 3. Tester

// Violates Dependency Inversion Principle

import java.util.*;

class Developer {
    public void work() {
        System.out.println("Developer is Coding amazing stuff");
    }
}

class Designer {
    public void work() {
        System.out.println("Designer is choosing a background color for the website");
        // :P no offence to designers
    }
}

class Tester {
    public void work() {
        System.out.println("Tester is making Developer's life difficult");
        // :P no offence to testers
    }
}

class Manager {
    List<Developer> developers;
    List<Designer> designers;
    List<Tester> testers;

    public void manager() {
        developers = new ArrayList<Developer>();
        designers = new ArrayList<Designer>();
        testers = new ArrayList<Tester>();
    }

    public void hireDeveloper(Developer developer) {
        developers.add(developer);
    }

    public void hireDesigner(Designer designer) {
        designers.add(designer);
    }

    public void hireTester(Tester tester) {
        testers.add(tester);
    }
}

// it breaks the DIP. A new type of employee i.e. ML Engineer
// cannot be added without changeing Manager class.

// Complies with Interface Segregation Principle
interface Employee {
    public void work();
}

class eManager {
    List<Employee> employees;

    public void manager() {
        employees = new ArrayList<Employee>();
    }

    public void hireEmployee(Employee employee) {
        employees.add(employee);
    }
}

class eDeveloper implements Employee {
    @Override
    public void work() {
        System.out.println("Developer is Coding amazing stuff");
    }
}

class eDesigner implements Employee {
    @Override
    public void work() {
        System.out.println("Designer is choosing a background color for the website");
        // :P no offence to designers
    }
}

class eTester implements Employee {
    @Override
    public void work() {
        System.out.println("Tester is making Developer's life difficult");
        // :P no offence to testers
    }
}
