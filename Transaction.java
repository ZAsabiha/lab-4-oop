import java.time.LocalDate;
public class Transaction{
   private LocalDate date;
    private double amount;
    private String producttype;
    public Transaction(LocalDate date, double amount, String producttype) {
        this.date = date;
        this.amount = amount;
        this.producttype = producttype;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public String getProducttype() {
        return producttype;
    }
    public void setProducttype(String producttype) {
        this.producttype = producttype;
    }
   
}