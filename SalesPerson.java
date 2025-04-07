public class SalesPerson extends Employee {
 
    private double commissionPercentage;
 
    public SalesPerson(String name, int age, double salary, double commissionPercentage) {
        super(name, age, salary);
        this.commissionPercentage = commissionPercentage;
    }
 
    public double getCommissionPercentage() {
        return this.commissionPercentage;
    }
 
    public void raiseCommission() {
        if (this.commissionPercentage < 0.30) {
            this.commissionPercentage = this.commissionPercentage * 1.2;
        }
    }
 
}