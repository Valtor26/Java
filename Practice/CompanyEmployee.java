package Practice;

import java.util.ArrayList;
import java.util.Scanner;

class Employee{
    private int id;
    private String name;
    private String designation;
    private double salary;

    public Employee(int id, String name,String designation,double salary){
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class Company{
    private String companyName;
    private Employee employees[];
    private int numEmployees;
    
    public Company(String companyName, Employee[] employees, int numEmployees) {
        this.companyName = companyName;
        this.employees = employees;
        this.numEmployees = numEmployees;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public int getNumEmployees() {
        return numEmployees;
    }

    public void setNumEmployees(int numEmployees) {
        this.numEmployees = numEmployees;
    }

    public double getAverageSalary(){
        double sumOfSalary = 0;

        for(Employee e : employees){
            sumOfSalary += e.getSalary();
        }

        return (sumOfSalary/numEmployees);
    }

    public double getMaxSalary(){
        double maxSal = employees[0].getSalary();

        for(Employee e : employees){
            if(e.getSalary() > maxSal){
                maxSal = e.getSalary();
            }
        }

        return maxSal;
    }

    public Employee[] getEmployeesByDesignation(String designation){
        ArrayList<Employee> emp = new ArrayList<>();

        for(Employee e : employees){
            if(e.getDesignation().equalsIgnoreCase(designation)){
                emp.add(e);
            }
        }

        return emp.toArray(new Employee[0]);
    }
}

public class CompanyEmployee{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter company name: ");
        String companyName = sc.nextLine();

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt(); sc.nextLine();

        System.out.println("Enter employee details: ");
        Employee employees[] = new Employee[n];

        for(int i=1;i<=n;i++){
            System.out.println("Employee " + i + ":");

            System.out.print("Enter id: ");
            int id = sc.nextInt(); sc.nextLine();

            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter designation: ");
            String designation = sc.nextLine();

            System.out.print("Enter salary: ");
            double salary = sc.nextDouble(); sc.nextLine();

            employees[i-1] = new Employee(id, name, designation, salary);
        }
        
        Company c = new Company(companyName, employees, n);

        double avgSal = c.getAverageSalary();
        double maxSal = c.getMaxSalary();

        System.out.println("Average salary: " + avgSal);
        System.out.println("Max salary: " + maxSal);

        System.out.println("Employees with designation: ");
                String searchDesg = sc.nextLine();
        Employee emps[] = c.getEmployeesByDesignation(searchDesg);

        if(emps.length == 0){
            System.out.println("No employees found.");
        } else {
            for(Employee e : emps){
            System.out.println("ID: " + e.getId() + ", " + "Name: " + e.getName() + ", " + "Designation: " + e.getDesignation() + ", " + "Salary: " +e.getSalary());
        }
        }

        sc.close();
    }
}