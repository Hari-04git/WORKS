import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class VegMap{
     
      public static void main(String[] args) {
         
         HashMap <String,String> veggies = new HashMap<>();

          
           veggies.put(" Carrot", " 3" );
           veggies.put("Beetroot", "4 ");
           veggies.put("Tomato ", "5");
           veggies.put("Potato", " 6" );

             Iterator<Map.Entry<String,String>> it = veggies.entrySet().iterator();
              while(it.hasNext()){
                  Map.Entry<String,String>entry=it.next();
                  System.out.println(entry.getKey() + " = " + entry.getValue());
              }
        }
    }




          



 
 