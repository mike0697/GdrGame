package it.mike.game.creature.character.inventory;

import it.mike.game.item.GenericItem;
import it.mike.game.item.item.TrainingBlade;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

//todo aggiungere funzione stampa equip

@XmlAccessorType(XmlAccessType.FIELD)
public class EquipInventory {

    public EquipInventory() {}

    final public int shield = 0;
    final public int weapon = 1;
    protected TrainingBlade bladeEq = null;
    final public int gloves = 2;
    final public int boots = 3;
    final public int helm = 4;
    final public int suit = 5;
    final public int ring1 = 6;
    final public int ring2 = 7;
    final public int ring3 = 8;
    final public int ring4 = 9;
    final public int amulet = 10;
    final public int earring1 = 11;
    final public int earring2 = 12;
    final public int belt = 13;
    final public int charm = 14;
    final public int talisman = 15;
    final public int bracelet1 = 16;
    final public int bracelet2 = 17;
    final public int arcana = 18;
    final public int epaulet = 19;
    final public int effector = 20;
    final public int carnelian = 21;

    /**
     * equip a blade from the inventory
     * add in the inventory the last blade equipped
     * @param inventory the inventory of the player
     * @param itemToAdd the item (a blade) to equip
     */
    public void setBlade(Inventory inventory, GenericItem itemToAdd) {
        //cerca nell' inventario se c'è l' item
        // quindi controlla se non esiste e fa return in caso non esite
        int exist = inventory.linearSearch(Inventory.inventoryArrayList, itemToAdd);
        if (exist == -1) {
            System.out.println("item non esiste");
            return;
        }
        if (itemToAdd instanceof TrainingBlade) {
            if (bladeEq == null) {
                bladeEq = (TrainingBlade) itemToAdd;
                int positionInventory = Inventory.inventoryArrayList.indexOf(itemToAdd);
                inventory.removeItem(itemToAdd);
                assert (bladeEq == null) : "bladeeq non esite";
            }else {
                if(inventory.capacity < itemToAdd.SPACE_ID){
                    return;
                }
                inventory.addItem(bladeEq);
                bladeEq = null;
                bladeEq = (TrainingBlade) itemToAdd;
                int positionInventory = Inventory.inventoryArrayList.indexOf(itemToAdd);
                inventory.removeItem(itemToAdd);
            }
        } else {
            return;
        }
    }
}







