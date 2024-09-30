import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class ReadXML implements FileRead {
    private List<Transaction> transactions = new ArrayList<>();
    public void ReadFromFile(){
         try {
            File file = new File("transaction.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(file);
            doc.getDocumentElement().normalize();

            NodeList nodeList = doc.getElementsByTagName("transaction");

            for (int i = 0; i < nodeList.getLength(); i++) {
                String date1 = doc.getElementsByTagName("date").item(i).getTextContent();
                String amount1 = doc.getElementsByTagName("amount").item(i).getTextContent();
                String productType = doc.getElementsByTagName("producttype").item(i).getTextContent();

                LocalDate date = LocalDate.parse(date1);
                double amount = Double.parseDouble(amount1);

                transactions.add(new Transaction(date, amount, productType));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
