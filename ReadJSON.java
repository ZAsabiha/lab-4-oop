
import java.io.FileReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ReadJSON {
    private List<Transaction> transactions = new ArrayList<>();

    public void ReadFromFile() {
        JSONParser parser = new JSONParser();

        try {
        
            Object obj = parser.parse(new FileReader("transaction.json"));
            JSONArray transactionArray = (JSONArray) obj;

        
            for (Object transactionObj : transactionArray) {
                JSONObject transaction = (JSONObject) transactionObj;

               
                String dateStr = (String) transaction.get("date");
                double amount = (double) transaction.get("amount");
                String description = (String) transaction.get("description");

              
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                LocalDate date = LocalDate.parse(dateStr, formatter);

                
                transactions.add(new Transaction(date, amount, description));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

 
}
