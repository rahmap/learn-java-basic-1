import rahmap.Storage;
import java.util.HashMap;

public class Main {

    public static Storage storage = new Storage();

    public static void main(String[] args) {
        HashMap<Object, Object> peoples = new HashMap<>();

        // Mengisi kantong ajaib dengan 5 benda
        peoples.put("name","Rahma Andita Purnama");
        peoples.put("age", 25);
        peoples.put("address","Yogyakarta");
        peoples.put("hasGF", false);
        peoples.put(0, "wkwk");

        for (Object key : peoples.keySet()) {
            if(key.equals("hasGF") && peoples.get(key).equals(false)){
                System.out.println("Tidak punya GF");
            }
            System.out.println(key + ": " + peoples.get(key));
        }

        HashMap<String, Object> items = new HashMap<>();
        for (int i = 1; i <= 5; i++) {
            items.put("item_"+i, i);
            Main.printName(Integer.toString(i));
        }
        Main.storage.setListItems(items);

        for (String key : Main.getStorageListItems().keySet()){
            System.out.println(key + ": " + Main.getStorageListItems().get(key));
        }
    }

    protected static void printName(String name) {
        System.out.println(name);
    }

    protected static HashMap<String, Object> getStorageListItems() {

        return Main.storage.getListItems();
    }
}