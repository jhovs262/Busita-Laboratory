public class Employee {
 
    private final String name;
    protected int age;
    protected double salary;
 
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
 
    public String getName() {
        return this.name;
    }
 
    public int getAge() {
        return this.age;
    }
 
    public double getSalary() {
        return this.salary;
    }
 
    public void raiseSalary() {
        this.salary = this.salary * 1.2;
    }
 
    public static void main(String[] args) {
        Employee emp = new Employee("Jhovan", 25, 50000);
 
        System.out.println("Name: " + emp.getName());
        System.out.println("Age: " + emp.getAge());
        System.out.println("Salary: " + emp.getSalary());
   
        emp.raiseSalary();
       
        System.out.println("The Salary after raise" + emp.getSalary());
    }
}