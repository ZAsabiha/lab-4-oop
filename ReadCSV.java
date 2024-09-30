import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.time.format.DateTimeFormatter;


public class ReadCSV implements FileRead {
    private List<Transaction> transactions = new ArrayList<>();
    private DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd");
    
    public void ReadFromFile(){
       
        try{
            BufferedReader reader=new BufferedReader(new FileReader("transaction.txt"));
            String line =reader.readLine();
            while(line!=null){
                String parts[]=line.split(",");
                LocalDate date=LocalDate.parse(parts[0],formatter);
                double amount=Double.parseDouble(parts[1]);
                 String producttype=parts[2];
                 transactions.add(new Transaction(date,amount,producttype));
                 line = reader.readLine();
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    

    
}
