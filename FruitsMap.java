
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FruitsMap{
     
      public static void main(String[] args) {
         
         HashMap <String,String> fruits = new HashMap<>();

          
           fruits.put(" Apple", " 3" );
           fruits.put("Orange", "4 ");
           fruits.put("Banana ", "5");
           fruits.put("Pear", " 6" );

             Iterator<Map.Entry<String,String>> it = fruits.entrySet().iterator();
              while(it.hasNext()){
                  Map.Entry<String,String>entry=it.next();
                  System.out.println(entry.getKey() + " = " + entry.getValue());
              }
        }
    }




          



 
 