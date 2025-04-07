public class Analyst extends Employee {
 
    public Analyst(String name, int age, double salary) {
        super(name, age, salary);
    }
 
    public double getAnnualBonus() {
        return this.getSalary() * 0.10;
    }
 
    public static void main(String[] args) {
        Analyst analyst = new Analyst("Jhovan", 30, 60000.0);
 
        System.out.println("Name: " + analyst.getName());
        System.out.println("Age: " + analyst.getAge());
        System.out.println("Salary: " + analyst.getSalary());
        System.out.println("Annual Bonus: " + analyst.getAnnualBonus());
    }
}