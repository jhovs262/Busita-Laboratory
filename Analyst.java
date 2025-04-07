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
        System.out.pasrintln("Age: " + analyst.getAge());d
        System.out.println("Salard2311qasddsasasa
