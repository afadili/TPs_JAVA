import java.util.Arraylist;
public class main{

public static void main(String[] args) {
         var apple1 = new Apple(20, "Golden");
         var apple2 = new Apple(40, "Pink Lady");
         var pear = new Pear(5);

         var basket = new Basket();
         basket.add(apple1);
         basket.add(apple2);
         basket.add(pear, 7);    // une poire
         System.out.println(basket);

         var set = new HashSet<Apple>();
         set.add(new Apple(20, "Golden"));
         System.out.println(set.contains(new Apple(20, "Golden")));

       }
}
