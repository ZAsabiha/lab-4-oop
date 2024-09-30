import java.time.LocalDate;
import java.util.List;

public class  Actions implements SummaryExpenses{
    List<Transaction> tran;
    @Override
    public void profitorloss( List<Transaction> transaction){
        double pluscount=0.0;
            double negcount=0.0;
        for(Transaction t: transaction){
            double total=0.0;
            
            if(t.getAmount()>0){
                pluscount+=t.getAmount();

            }
            else{
                negcount+=t.getAmount();

            }

        }
        if(pluscount>negcount){
            System.out.println("prifit occurs as salary is more than expense");
        }
        else{
            System.out.println("loss occurs as expense is more than salary");
        }
    }
    @Override
    public int totalbanktransacctions(List<Transaction> transaction){
        int c=0;
        for(Transaction t: transaction){
            LocalDate date=t.getDate();
            if(date!=null){
                c++;
            }
        }
        return c;
            

    }
    @Override
    public void toptenexpense(List<Transaction> transaction){
            
        for(Transaction t: transaction){
            
           
            System.out.println(t.getProducttype() );
        }



    }
    @Override
    public void highestcategory(List<Transaction> transaction){
        double max=0.0;
        String mostexpensiveitem=" ";
        for(Transaction t: transaction){
            
           if(t.getAmount()>=max){
            max=t.getAmount();
            mostexpensiveitem=t.getProducttype() ;
           }
            
        }
        System.out.println(mostexpensiveitem);




    }
    
}
