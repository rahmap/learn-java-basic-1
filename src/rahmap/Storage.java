package rahmap;

import java.util.HashMap;

public class Storage {
    public HashMap<String, Object> listItems;

    public HashMap<String, Object> getListItems() {
        return listItems;
    }

    public void setListItems(HashMap<String, Object> listItems) {
        this.listItems = listItems;
    }
    
    public String info() {
        return "Full!";
    }
}
