package models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class PizzaMenu {
    private List<PizzaMenuItem> menuList;
    private LocalDateTime lastUpdates;

    public PizzaMenu(){
        menuList = new ArrayList<>();
        setLastUpdates();
    }
    public void addItem(PizzaMenuItem toAdd){
        menuList.add(toAdd);
        setLastUpdates();
    }
    public void removeItem(PizzaMenuItem toRemove){
        menuList.remove(toRemove);
        setLastUpdates();
    }

    public List<PizzaMenuItem> getMenuList() {
        return menuList;
    }

    public LocalDateTime getLastUpdates() {
        return lastUpdates;
    }

    private void setLastUpdates(){
        lastUpdates = LocalDateTime.now();
    }

}
