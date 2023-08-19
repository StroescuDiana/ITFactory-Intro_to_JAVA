import java.util.ArrayList;

public class Array_advanced {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> groceryList = new ArrayList();

        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");

        ArrayList<String> productList = new ArrayList();
        productList.add("pizza");
        productList.add("turta dulce");
        productList.add("oranges");

        ArrayList<String> drinksList = new ArrayList();
        drinksList.add("limonata");
        drinksList.add("water");

        groceryList.add(drinksList);
        groceryList.add(bakeryList);
        groceryList.add(productList);

        System.out.println(groceryList); // ------> displays the entire list of lists
        System.out.println(groceryList.get(1).get(2)); // -------> displays only the desired element from the list
    }
}
