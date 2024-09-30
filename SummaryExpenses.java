import java.util.List;

public interface SummaryExpenses {
    public void profitorloss( List<Transaction> transaction);
    public int totalbanktransacctions(List<Transaction> transaction);
    public void toptenexpense(List<Transaction> transaction);
    public void highestcategory(List<Transaction> transaction);
    
}