import java.util.Iterator;
import java.util.ArrayList;

public class JavaCollectionList {

    public static void main(String[] args) {

       ArrayList<String> groclist=new ArrayList<String>();

        groclist.add("Bacon");
        groclist.add("Milk");
        groclist.add("Eggs");
        groclist.add("Flour");
        groclist.add("Sugar");
        groclist.add("Ice Cream");
        groclist.add("Gum");
        groclist.add("Butter");
        
      ArrayList<String> packinglist=new ArrayList<String>();

      packinglist.add("Shirt");
      packinglist.add("Pants");
      packinglist.add("Shorts");
      packinglist.add("Sneakers");
      packinglist.add("Socks");
      packinglist.add("Sunglasses");
      packinglist.add("Toothbrush");
      
        
       Iterator number, number2;
        
        number =groclist.iterator();
        number2=packinglist.iterator();
        
        System.out.println("Grocery List! ");
        while(number.hasNext())
        {
          String item=(String)number.next();

          System.out.println("Grocery Item: "+item);
        }
        System.out.println("Packing List! ");
        while(number2.hasNext())
        {
          String item=(String)number.next();

          System.out.println("Packing Item: "+item);
        }
    }
}
