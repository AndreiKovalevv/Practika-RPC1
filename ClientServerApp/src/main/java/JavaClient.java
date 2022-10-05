import java.util.*;
import org.apache.xmlrpc.*;

public class JavaClient {
   public static void main (String [] args) {
   
      try {
         String serverUrl = "http://localhost/";
         XmlRpcClient client =  new XmlRpcClient("http://localhost/"); 
         Vector params = new Vector();
         
         params.addElement(29);
         params.addElement(9);

         Object result = client.execute("sample.difference", params);

         int difference = ((Integer) result);
         System.out.println("Результат вычитания 2ух чисел = "+ difference);

      } catch (Exception exception) {
         System.err.println("JavaClient: " + exception);
      }
   }
}