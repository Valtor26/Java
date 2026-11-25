package Practice;

import java.util.*;

class Employee{
    private int id;
    private String name;
    private int age;
    private char gender;
    private double salary;

    public Employee(int id, String name, int age, char gender, double salary){
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public char getGender(){
        return this.gender;
    }

    public void setGender(char gender){
        this.gender = gender;
    }

    public double getSalary(){
        return this.salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }
}

public class SecondHighestSalary {
    public static Employee getEmployeeWithSecondLowestSalary(Employee[] e){
            if(e.length <= 2) return null;

            Arrays.sort(e, Comparator.comparingDouble(Employee::getSalary));

            double lowestSalary = e[0].getSalary();

            for(int i=0;i<e.length;i++){
                if(e[i].getSalary() > lowestSalary){
                    return e[i];
                }
            }
        return null;
    }

    public static int countEmployeesBasedOnAge(Employee e[],int age){
        int count = 0;

        for(int i=0;i<e.length;i++){
            if(e[i].getAge() == age) count += 1;
        }

        return count;
    }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            sc.nextLine();

            Employee emp[] = new Employee[n];

            for(int i=0;i<n;i++){
                int id = sc.nextInt(); sc.nextLine();
                String name = sc.nextLine();
                int age = sc.nextInt(); sc.nextLine();
                char gender = sc.next().charAt(0);
                double salary = sc.nextDouble(); sc.nextLine();

                emp[i] = new Employee(id, name, age, gender, salary);

            }

            int searchAge = sc.nextInt();sc.nextLine();

            Employee result = getEmployeeWithSecondLowestSalary(emp);

            if(result != null){
                System.out.println(result.getId() + "#" + result.getName());
            }
            else{
                System.out.println("Null");
            }

            int count = countEmployeesBasedOnAge(emp, searchAge);

            if(count > 0){
                System.out.println(count);
            } 
            else{
                System.out.println("No employee found for the given age");
            }

            sc.close();
    }
}
