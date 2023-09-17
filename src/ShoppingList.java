import java.util.Objects;

public class ShoppingList {
    public static String [] shop = new String[10];

    static int add_item(String item, int n){
        shop[n] = item;
        System.out.println("item added : "+ item);
        return ++n;
    }
    static void del_item(String item){
        for (int i = 0; i < 10; i++) {
            if(Objects.equals(shop[i], item)){
                shop[i] = "0";
                System.out.println("item deleted : "+ item);
                return;
            }
        }
        System.out.println("No such item : "+item);
    }
    static void get_list(String [] list){
        System.out.println("Your shopping list ");
        for (int i = 0; i < 10; i++) {
            if (list[i]!="0")
                System.out.println(list[i]);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            shop[i] = "0";
        }
        int n=0;
        n = add_item("Bag",n);
        n = add_item("Shoes",n);
        n = add_item("Lipstick",n);
        n = add_item("Davidoff Perfume",n);
        n = add_item("Fossil Watch",n);
        del_item("Hi");
        del_item("Bag");

        get_list(shop);
    }
}
