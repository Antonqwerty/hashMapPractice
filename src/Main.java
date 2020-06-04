import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        //hashMapTest1();
        hashMapTest2();
    }

    public static void hashMapTest1() {
        HashMap<String, String> brandCountry = new HashMap<String, String>();
        brandCountry.put("Apple", "US");
        brandCountry.put("Toyota", "Japan");
        brandCountry.put("AK-47", "Russia");
        brandCountry.put("Adidas", "Germany");
        System.out.println(brandCountry);
        System.out.println(brandCountry.get("Adidas"));
        System.out.println(brandCountry.size());
        System.out.println("\n");
        //brandCountry.clear();
        //System.out.println(brandCountry);
        System.out.println("VALUES:");
        for (
                String i : brandCountry.values())

        {
            System.out.println(i);
        }
        System.out.println("\n");
        for (
                String i : brandCountry.keySet())

        {
            System.out.println("KEY:" + i + " " + "VALUE:" + brandCountry.get(i));
        }
    }

    public static void hashMapTest2() {
        HashMap<String, Integer> currency = new HashMap<String, Integer>();
        currency.put("Gold", 200);
        currency.put("Dollar", 35);
        currency.put("Euro", 45);
        for (String i : currency.keySet()) {
            System.out.println("KEY: " + i + " " + "VALUE: " + currency.get(i));
        }
    }

}

