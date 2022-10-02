package persistence.models;

public class Salaries {
    private int idsalary;
    private double amount;


    public Salaries(int idsalary, double amount) {
        this.idsalary = idsalary;
        this.amount = amount;
    }

    public Salaries(){

    };

    public int getIdsalary() {
        return idsalary;
    }

    public void setIdsalary(int idsalary) {
        this.idsalary = idsalary;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Salaries{" +
                "idsalary=" + idsalary +
                ", amount=" + amount +
                '}';
    }
}
