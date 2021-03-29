package it.mike.game.creature.character.inventory;


import it.mike.game.item.GenericItem;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementWrapper;

import java.util.ArrayList;


@XmlAccessorType(XmlAccessType.FIELD)
public class Inventory {

    public Inventory() {}

    protected int capacity = 15;
    protected int maxCapacity = 15;

    @SuppressWarnings("all")
    @XmlElementWrapper
    static protected ArrayList<GenericItem> inventoryArrayList = new ArrayList<GenericItem>();

    static {
        initialize();
    }

    /**
     * Initialize the arrayList because you need to save the data in a file
     *  and you need to know the length
     */
    public static void initialize(){
        for (int i = 0; i < 30; i++) {
            inventoryArrayList.add(i, null);
        }
    }

    /**
     * Search and return the Item in the Inventory
     * @param inventoryArrayList the array
     * @param item the Item
     * @return an int of the index of the item
     */
    protected int linearSearch(ArrayList<GenericItem> inventoryArrayList, GenericItem item){
        return inventoryArrayList.indexOf(item);
    }


    /**
     * Add an item into the inventory
     * @param item the Generic Item
     * @param quantity the quantity of the item
     */
    public void addItem(GenericItem item, int quantity){
        if(quantity <= 0)
            return;
        if(quantity == 1){
            addItem(item);
        }else {
            addItem(item);
            addItem(item, quantity - 1);
        }
    }

    /**
     * Add an item into the inventory
     * @param item he Generic Item
     */
    public void addItem(GenericItem item){
        //controlla lo spazio
        if(this.capacity <= 0)
            return;
        if(this.capacity - item.SPACE_ID < 0){
            System.out.println("non c'`e spazio");
            return;
        }
        this.capacity -= item.SPACE_ID;

        int position = linearSearch(inventoryArrayList, item);
        if(position == -1){
            System.out.println("add item");
            int nullItem = linearSearch(inventoryArrayList, null);
            inventoryArrayList.set(nullItem, item);
        }
        else {
            if(item.is_equip_or_armor)
            {
                System.out.println("add item : ");
                int nullItem = linearSearch(inventoryArrayList, null);
                inventoryArrayList.set(nullItem, item);
            }
            else {
                System.out.println("add itemQuantity : ");
                inventoryArrayList.get(position).quantity += 1;
            }
        }
    }

    /**
     * remove and destroy an item from the inventory
     * @param item An item to pass: if equals, then destroy
     */
    public void removeItem(GenericItem item){
        int point = linearSearch(inventoryArrayList, item);
        if(point == -1){
            return;
        }
        int spaceItem = item.SPACE_ID;
        capacity += spaceItem;
        if(capacity > maxCapacity)
            capacity = maxCapacity;
        if(inventoryArrayList.get(point).is_equip_or_armor){
            inventoryArrayList.remove(point);
            inventoryArrayList.add(null);
        }else
            {
            int quantity = inventoryArrayList.get(point).quantity;
            if(quantity <= 1)
            {
                inventoryArrayList.remove(point);
                inventoryArrayList.add(null);
            }
            else
                {
                inventoryArrayList.get(point).quantity = quantity - 1;
            }
        }
    }

    /**
     * print the Inventory
     */
    public void printInventory(){
        int i = 0;
        while(inventoryArrayList.get(i) != null){
            System.out.println(" " +inventoryArrayList.get(i));
            i++;
        }
        System.out.println("Inventario stampato");
    }

    /**
     * Save the inventory when you exit the game
     */
    public void saveTheInventory(SaveInventory e){
        int i = 0;
        while (inventoryArrayList.get(i) != null && i < 30){
            e.itemToSave(inventoryArrayList.get(i));
            inventoryArrayList.set(i, null);
            i++;
        }
    }

    /**
     * Load the inventory
     * @param e the Object where the Items is saved
     */
    public void loadTheInventorySaved(SaveInventory e){
        GenericItem loadItem = e.getItem();
        if(loadItem == null)
            return;
        inventoryArrayList.set(0, loadItem);
        int i = 1;
        while (loadItem != null){
            loadItem = e.getItem();
            inventoryArrayList.set(i, loadItem);
            i++;
        }
    }
}







